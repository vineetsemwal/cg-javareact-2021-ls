/**
 * array example map function
 */

let array=[10,11,12,13,14];

let customFun=(num, index)=>console.log(`number at index ${index} is  ${num}`);

//function customFun(num, index){
//    console.log(`number at index ${index} is  ${num}`);
//}


array.map(  customFun  );