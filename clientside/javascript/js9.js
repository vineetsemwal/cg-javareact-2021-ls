/**
 * arrow function
 */

let add=(num1, num2)=>num1+num2;

let mul=(num1,num2)=>{
    return num1*num2;
}

var addResult=add(10,20);
var mulResult=mul(4,6);

console.log("add result="+addResult);
console.log("mul result="+ mulResult);