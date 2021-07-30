// js/variable1.js

const numbers = [23, 44, 18, 35, 50];
numbers.push(42);
let sum1 = 0;

for (let i = 0; i < numbers.length; i++) {
    document.writeln(numbers[i] + '<br>');
    sum1 += numbers[i];
}
document.write('...................'+ '<br>' )
document.write('합계: ' + sum1);