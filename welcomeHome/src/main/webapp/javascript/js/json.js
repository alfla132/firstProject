function ajax(url, page) {
    //기존에 있던 데이터를 화면삭제 해주고
    let divShow = document.querySelector('#show')
    let cnt = divShow.children.length;
    for (let i = 0; i < cnt; i++) {
        divShow.removeChild(divShow.children[0]);
    }

    let startCnt, endCnt;
    startCnt = (page - 1) * 10; //인덱스 기준으로 0~9, 10~19 (10개씩 끊어서 보여주기)
    endCnt = page * 10 - 1;


    let xhtp = new XMLHttpRequest();
    xhtp.open('get', url);
    xhtp.send();
    xhtp.onload = function () {
        let showDiv = document.getElementById('show');
        let data = JSON.parse(xhtp.responseText);

        data.filter(function (val, idx) {
            if (startCnt <= idx && idx <= endCnt) {
                return val;
            }
        }).forEach(function (val, idx) {
            // span: id, strong: first_name, last_name, email
            let span = document.createElement('span')
            span.innerHTML = val.id;
            let strong1 = document.createElement('strong')
            strong1.innerHTML = val.first_name;
            let strong2 = document.createElement('strong')
            strong2.innerHTML = val.last_name;
            let strong3 = document.createElement('strong')
            strong3.innerHTML = val.email;
            let div = document.createElement('div')
            div.setAttribute('class', 'row');
            //div 하위요소로 span, strong1, strong2, strong3 
            div.appendChild(span)
            div.appendChild(strong1)
            div.appendChild(strong2)
            div.appendChild(strong3)

            showDiv.appendChild(div);

        })
    } //end of xhtp.onload;
} //end of ajax();

ajax('MOCK_DATA.json', 1); //첫 화면에 첫 페이지 보여주기 위함
let btns = document.querySelectorAll('.pagination > button');
for (let i = 0; i < btns.length; i++) {
    btns[i].addEventListener('click', function () {
        //클릭 이벤트 시 button의 클래스를 초기화.
        for (let i = 0; i < btns.length; i++) {
            btns[i].className = '';
        }
        this.className = 'active';
        let page = this.innerHTML;
        ajax('MOCK_DATA.json', page);
    });

}