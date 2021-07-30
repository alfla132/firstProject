const students = [];
        const stu1 = {
            name: '박주현',
            kor: '90',
            mat: '90',
            eng: '95'
        }
        const stu2 = {
            name: '권가영',
            kor: '95',
            mat: '90',
            eng: '90'
        }
        const stu3 = {
            name: '홍미림',
            kor: '80',
            mat: '90',
            eng: '70'
        }

        students.push(stu1);
        students.push(stu2);
        students.push(stu3);
        const fields = {
            name: '학생이름',
            kor: '국어점수',
            mat: '수학점수',
            eng: '영어점수'
        }
        // const students = [stu1, stu2, stu3];
        //학생이름, 국어, 수학, 영어 => student1 오브젝트.

        document.write('<table border="1">')
        document.write('<thead><tr>')
        for (field in fields) {
            document.write('<th>' + fields[field] + '</th>')
        }
        document.write('</tr></thead>')
        document.write('<tbody>')
        for (let i = 0; i < students.length; i++) {
            document.write('<tr>')
            for (field in students[i]) {
                document.write('<td>' + students[i][field] + '</td>')
            }
            document.write('</tr>') 
        }
        document.write('</tbody>')
        document.write('</table>')
        // for (let i = 0; i < students.length; i++) {
        //     for (field in students[i]) {
        //             console.log(field + ': ' + students[i][field])
        //         }
        //         console.log('-------------------')


        let a = 10;
        console.log(a);

        function cal() {
            let num1 = document.getElementById('num1');
            let num2 = document.getElementById('num2');
            console.log(Number(num1.value) + Number(num2.value));
            let result = document.getElementById('result');
            result.value = sum(Number(num1.value), Number(num2.value));
        }

        console.log('function정의 전: ' + sum(10,20));
        
        let fnc = function (a, b) {
            return a + b;
        }
        console.log('function정의 전: ' + fnc(10,20));

        console.log(fnc(10, 20));

        function sum(num1, num2) { // hoistning: function 정의문을 끌어올림.
            return num1 + num2;
        }
        let result = sum(10, 20);
        console.log(result);
        result = sum('Hello', 'World');
        console.log(result);