/**
 * object destructing
 */

let user={name:'nisha', age:21};

let name1=user.name;
let age1=user.age;

console.log(name1 +" "+age1);


let {name:name2,age:age2 }=user;// object destructuring

console.log(name2 +" "+age2);
