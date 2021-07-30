// js/variable.js

let var1 = 'Hello'; //변수..

var1 = 'World'; // string
var1 = 100;
var1 = true;
console.log(typeof var1);
let var11 = 10;
console.log(var1);

const con1 = 'Good'; // 상수.
// con1 = 'Morning';

let num1 = 1;
let num2 = 1;
console.log(num1 + num2);

document.write('<h1>Hello</h1>');
document.write('<ul>');
document.write('    <li>Apple</li>');
document.write('    <li>Banana</li>');
document.write('</ul>');

let str = '<ul>';
str += '    <li>Orange</li>';
str += '    <li>Mango</li>';
str += '    </ul>';
document.write(str);

let fruits = ['수박', '딸기', '복숭아']; //웬만하면 배열 이렇게 쓰기
// fruits = new Array();
fruits.push('수박');
fruits.push('딸기');
fruits[2] = '복숭아';
fruits[fruits.length] = '자몽';
fruits[fruits.length] = '자두';
// fruits.pop(); //마지막 위치 삭제.
fruits.unshift('자몽'); //제일 앞쪽에 추가.
// fruits.shift(); //첫번째 위치 삭제.

console.log(typeof fruits);

document.write('<ul>');
for (let i = 0; i < fruits.length; i++) {
    document.write('<li>' + fruits[i] + '</li>');
}
document.write('</ul>');