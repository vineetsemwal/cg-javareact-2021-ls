/**
 * spread operator or rest operator , same as var args in java
 */

function add(...nums){
    let result=0;
    for(let i=0;i<nums.length; i++ ){
        result=result+nums[i];
    }

return result;
}

let result1=add(10);
let result2=add(10,20);
let result3=add(10,20,30);
console.log(result1);
console.log(result2);
console.log(result3);

