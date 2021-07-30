   function submitFnc(e) {
       e.preventDefault(); //submit의 기본기능 차단.
       let list = document.querySelector('#list > tbody');

       let num = document.tbl.num.value;
       let sbj = document.tbl.sbj.value;
       let name = document.tbl.name.value;
       let date = document.tbl.date.value;


       let childCnt = list.children.length;
       console.log(childCnt)


       if (childCnt % 2 == 0) {
           let liTag = createTr(num, sbj, name, date);
           liTag.setAttribute('class', 'altRow');
           // liTag.className = 'altRow';
           list.appendChild(liTag);
       } else {
           list.appendChild(createTr(num, sbj, name, date));
       }
       document.tbl.num.value = childCnt + 1;
    }
    addTrEvent();

       function createTr(num, sbj, name, date, checkbox) {

           let trTag = document.createElement('tr');

           for (let i = 0; i < arguments.length; i++) {
               let tdTag = document.createElement('td')
               tdTag.setAttribute('class', 'td' + (i + 1))
               let text = document.createTextNode(arguments[i])
               tdTag.appendChild(text)
               trTag.appendChild(tdTag)

           }
           let tdTag = document.createElement('td')
           let inputTag = document.createElement('input')
           inputTag.setAttribute('type', 'checkbox')
           trTag.appendChild(tdTag);
           tdTag.appendChild(inputTag)
           return trTag;
       }

   
       function addTrEvent() {
   let trs = document.querySelectorAll('#list > tbody > tr')
   console.log(trs)
   for (let i = 0; i < trs.length; i++) {
       trs[i].addEventListener('click', function () {
           console.log('번호: ', this.children[0].innerHTML);
           //form 화면의 각 요소의 값 <= this.children[2].innerHTML
           document.getElementById('num').value = this.children[0].innerHTML
           document.getElementById('sbj').value = this.children[1].innerHTML
           document.getElementById('name').value = this.children[2].innerHTML
           document.getElementById('date').value = this.children[3].innerHTML
       }); //매개값 (event, function)
   }
}
   //수정 버튼을 클릭하면 실행될 eventHandler(코드);
   let updateBtn = document.querySelector('#inputForm > form > input[type="button"]')
   console.log(updateBtn);
   updateBtn.addEventListener('click', function () {
       // 폼태그 안에 사용자가 수정한 값을 테이블에서 찾아와서(tr=id) 하위요소 값 변경.
       let numInput = document.getElementById('num');
       let sbjInput = document.getElementById('sbj');
       let nameInput = document.getElementById('name').value;
       let dateInput = document.getElementById('date');

       console.log(numInput.value); //수정하고자 하는 게시판의 글번호.
       let searchId = numInput.value
       let findTr = document.getElementById(searchId);
       console.log(findTr);
       //제목:
       findTr.children[1].innerHTML = sbjInput.value
       //이름:
       findTr.children[2].innerHTML = nameInput;
       //날짜:
       findTr.children[3].innerHTML = dateInput.value;

   });

   //선택삭제 버튼 클리하면 선택값만 삭제처리.
   document.getElementById('delBtn').addEventListener('click', function () {
       //체크박스 선택된 요소 가지고 와야된다.
       let checkedBox = document.querySelectorAll('#list > tbody > tr > td > input[type="checkbox"]:checked')
       console.log(checkedBox)
       for (let i = 0; i < checkedBox.length; i++) {
           checkedBox[i].parentNode.parentNode.remove();
       }

       //남은 데이터의 tr 건수만큼 가져와서 class => altRow;
       let remainTr = document.querySelectorAll('#list > tbody > tr')
       for (let i = 0; i < remainTr.length; i++) {
           if (i % 2 == 0) {
               remainTr[i].className = 'altRow';
           } else {
               remainTr[i].className = '';
           }
       }
   })