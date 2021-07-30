document.addEventListener('DOMContentLoaded', function () {
    ajax('MOCK_DATA.json', 1);
    let btns = document.querySelectorAll('.pagination > button')
    for (let i = 0; i < btns.length; i++) {
        btns[i].addEventListener('click', function () {
            //클릭 이벤트 시 button의 클래스를 초기화.
            for (let i = 0; i < btns.length; i++) {
                btns[i].className = '';
            }
            let page = this.innerHTML;
            this.className = 'active';
            ajax('MOCK_DATA.json', page);
        })
    }
})



function ajax(url, page) {
    let xhtp = new XMLHttpRequest(); // new Object();
    xhtp.open('get', url);
    xhtp.send();
    xhtp.onreadystatechange = function () {
        if (xhtp.readyState == 4 && xhtp.status == 200) {
            let data = JSON.parse(xhtp.response);
            makePage(xhtp.responseXML, page);
            console.log(data)
        }
    }
}

function makePage(data, page) {
    // 기존에 있던 데이터를 화면에서 삭제해주고 
    let divShow = document.querySelector('#show')
    let cnt = divShow.children.length;
    for (let i = 0; i < cnt; i++) {
        console.log(divShow.firstChild)
        divShow.removeChild(divShow.children[0]);
    }
    //페이지 건수만큼 화면에 보여주도록.
    let records = data.getElementsByTagName('record')
    let startCnt, endCnt;
    startCnt = (page - 1) * 10; // 0
    endCnt = page * 10 - 1; // 9
    endCnt = endCnt > records.length ? records.length - 1 : endCnt;
    console.log(endCnt);
    for (let i = startCnt; i <= endCnt; i++) {
        let div = document.createElement('div');
        div.className = 'row';

        let span = document.createElement('span');
        span.innerText = records[i].children[0].innerHTML
        let strong = document.createElement('strong')
        strong.innerText = records[i].children[1].innerHTML;
        let strong1 = document.createElement('strong')
        strong1.innerText = records[i].children[2].innerHTML;
        let strong2 = document.createElement('strong')
        strong2.innerText = records[i].children[3].innerHTML;

        div.appendChild(span)
        div.appendChild(strong)
        div.appendChild(strong1)
        div.appendChild(strong2)

        // records[i].children[0].innerText + ' - ' + records[i].children[0].innerText
        document.getElementById('show').appendChild(div)
    }

}