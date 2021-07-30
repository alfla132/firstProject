
function makeRow(obj) {
    // <tr><td>id</td><td>first_name</td><td>last_name</td></tr>
    let tr = document.createElement('tr');
    tr.addEventListener('mouseover', mover, true);
    tr.addEventListener('mouseout', mout, true);
    tr.addEventListener('click', trClick, true); // 상위요소 -> 하위요소. 
    // 필드의 갯수만큼 반복할 때 fon .. in 반복문 사용.
    for (let field in obj) {
        console.log('필드: ' + field + ', 값: ' + obj[field]);
        console.log(`필드: ${field}, 값: ${obj[field]}`) //위에 더하기 사용안하고 `(백틱)을 사용해서 간단히 표현가능
        let td = document.createElement('td');
        let text = document.createTextNode(obj[field]);
        td.appendChild(text);
        tr.appendChild(td);
    }
    // 삭제버튼 생성.
    let td = document.createElement('td');
    let btn = document.createElement('input');
    btn.type = 'button'; // btn.setAttribute('type', 'button') 같음.
    btn.value = '삭제';
    btn.addEventListener('click', deleteRow);//callback 함수
    td.appendChild(btn);
    tr.appendChild(td);
    
    return tr;
    }
    
    let deleteRow = (arg) => {
        arg.stopPropagation(); //이벤트의 전파를 차단.
        //arrow function 일 경우에는 this 키워드는 window 오브젝트. 
        arg.target.parentElement.parentElement.remove();
        
    }
    
    // mouseover, mouseout 이벤트
    // console.log(arg.target.parentNode.parentNode.childNodes[2].previousSibling.innerText);
        
    let mover = function (arg) {
        // arg.stopPropagation();
        // arrow function 일 경우에는 this 키워드는 window 오브젝트.
        this.style.backgroundColor = 'grey';
    }
    
    let mout = function(arg) {
        // arg.stopPropagation();
        // function 일 경우에는 this 키워드는 event 대상.
        this.style.backgroundColor = 'white';
    }
    
    let trClick = function () {
        window.alert(this.children[0].innerHTML);
    }