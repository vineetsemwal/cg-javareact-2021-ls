/**
 * object destructing
 */

let user={id:10, name:'nisha', age:21 };

let id1=user.id;
let name1=user.name;
let age1=user.age;

console.log(id1+" "+name1 +" "+age1);


let {id:id2,name:name2,age:age2 }=user;// object destructuring

console.log(id2 +" "+name2 +" "+age2);


let {id,name,age}=user;

console.log(id+" "+name +" "+age);