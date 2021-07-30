// ajax = Asynchronous Javascript And Xml
        // string : 102Hong8020 103Hong8020 102Hong8020 102Hong8020
        // xml: <id>102</1d><name>Hong</name><score>80</score><age>20</age>
        //ajax 는 비동기방식

        // let xhtp = new XMLHttpRequest();
        // xhtp.open('get', 'dataset.xml');
        // xhtp.send();
        // xhtp.onreadystatechange = function() {
        //     if(this.readyState == 4 && this.status == 200) {
        //         console.log(this.responseXML);
        //         let xmlDoc = this.responseXML;
        //         let data = xmlDoc.getElementsByTagName('record');
        //         for(let i = 0; i< data.length; i++) {
        //             console.log(data[i].children[1].innerHTML);
        //         }
        //     }
        // }
        document.addEventListener('DOMContentLoaded', function () {
            ajax('dataset.xml', 1);
            let btns = document.querySelectorAll('.pagination > button')
            for (let i = 0; i < btns.length; i++) {
                btns[i].addEventListener('click', function () {
                    //클릭 이벤트 시 button의 클래스를 초기화.
                    for (let i = 0; i < btns.length; i++) {
                        btns[i].className = '';
                    }
                    let page = this.innerHTML;
                    this.className = 'active';
                    ajax('dataset.xml', page);
                })
            }
        })



        function ajax(url, page) {
            let xhtp = new XMLHttpRequest(); // new Object();
            xhtp.open('get', url);
            xhtp.send();
            xhtp.onreadystatechange = function () {
                if (xhtp.readyState == 4 && xhtp.status == 200) {
                    console.log(xhtp.responseXML);
                    // document.getElementById('show').innerHTML = makePage(xhtp.responseXML);
                    makePage(xhtp.responseXML, page);
                }
                console.log(xhtp)
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