/**
 * array destructuring
 */

let numbers=[10,20,30,40];

//let num1=numbers[0];
//let num2=numbers[1];

let [num1, num2, num3, num4]=numbers;
console.log(num1 +" "+num2+" "+num3+" "+num4);

let [num11,num22,...remaining]=numbers;

console.log(num11+" "+num22);

for(let num of remaining){
    console.log(num);
}