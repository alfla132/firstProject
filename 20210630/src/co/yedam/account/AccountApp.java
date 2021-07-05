package co.yedam.account;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

//데이터를 담아놓기 위한 Account
// 컨트롤 입금, 출금, => 사용자의 입력으로 메뉴를 실행.
public class AccountApp {
	private static AccountApp app = new AccountApp();

	private AccountApp() {

	}

	public static AccountApp getInstance() {
		return app;
	}

	Account[] accounts = new Account[10];
	Scanner scn = new Scanner(System.in);
	File file = new File("accountList.txt");

	// 계좌번호(ano)를 입력 해당계좌를 반환해주는 메소드.
	private Account findAccount(String ano) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
				return accounts[i];
			}
		}

		return null;
	}

	private void printMenu() {
		System.out.println("---------------------------------------------------------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.파일저장 6.파일열기 7.종료");
		System.out.println("---------------------------------------------------------");
		System.out.println("선택> ");
	}

	private void creatAccount() {
		String ano = Utils.scanString("생성할 계좌번호를 입력하세요>>> ");
		String owner = Utils.scanString("예금주를 입력하세요>>> ");
		String amount = Utils.scanNumberString("금액을 입력하세요>>> ");
		Utils.scanString("입력되었습니다.");
		Account acnt = new Account(ano, owner, Integer.parseInt(amount));
//		acnt.setAno(ano);
//		acnt.setOwner(owner);
//		acnt.setBalance(Integer.parseInt(amount)); // 문자열숫자 -> int 숫자로 바꿔줌

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = acnt;
				System.out.println("한건 입력되었습니다.");
				break; // 비어있는 위치에 한건 입력후 종료.
			}
		}
	}// creatAcount()

	private void accountList() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println("account정보) " + "예금주: " + accounts[i].getOwner() + ", 계좌번호: " + accounts[i].getAno()
						+ ", 잔액: " + accounts[i].getBalance());
			}
		}
	}

	// 예금처리..
	private void deposit() {
		System.out.println("계좌번호 >>> ");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당 계좌번호는 없습니다.");
		} else {
			String amt = Utils.scanNumberString("예금액을 입력>>> ");
			System.out.println("입금되었습니다.");
			int balance = acnt.getBalance();
			acnt.setBalance(balance + Integer.parseInt(amt));
		}
	}

	// 출금처리..
	private void withdraw() {
		System.out.println("계좌번호 >>> ");
		String ano = scn.nextLine();
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당 계좌번호는 없습니다.");
		} else {
			String amt = Utils.scanNumberString("출금액을 입력>>> ");
			Utils.scanString("출금되었습니다.");
			int balance = acnt.getBalance();
			acnt.setBalance(balance - Integer.parseInt(amt));
		}
	}

	private void fileSave() {
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					Account account = accounts[i];
					String val = account.getAno() + "," + account.getOwner() + "," + account.getBalance() + "\n";
					os.write(val.getBytes());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void fileOpen() {
		Reader is = null;
		try {
//			is = new FileInputStream(file);
			is = new FileReader(file);
			int readByte = 0;
			StringBuffer sb = new StringBuffer(); // str += newStr;
			while ((readByte = is.read()) != -1) {
				System.out.print((char) readByte);
				sb.append((char) readByte);
			}
			String[] acnts = sb.toString().split("\n");
			for (int i = 0; i < acnts.length; i++) {
				String[] acnt = acnts[i].split(",");
				accounts[i] = new Account(acnt[0], acnt[1], Integer.parseInt(acnt[2]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void exe() {
		// 1.계좌생성 2.계좌목록 3.예금 4.출금 5.파일저장 6.파일열기 7.종료 
		boolean run = true;
		while (run) {
			printMenu();
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				System.out.println("계좌생성");
				creatAccount();

			} else if (selectNo == 2) {
				System.out.println("계좌목록");
				accountList();
			} else if (selectNo == 3) {
				System.out.println("예금");
				deposit();
			} else if (selectNo == 4) {
				System.out.println("출금");
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("파일저장");
				fileSave();
			} else if (selectNo == 6) {
				System.out.println("파일불러오기");
				fileOpen();
			} else if (selectNo == 7) {
				System.out.println("종료");
				run = false;
			}

		} // while

		System.out.println("시스템이 종료되었습니다.");
	} // exe
} // class
