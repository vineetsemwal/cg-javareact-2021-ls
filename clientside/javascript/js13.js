/**
 * object example again
 */

 let user={name:"arpit", age:20};

 let name1=user["name"];// user.name
let age1=user["age"];// user.age
console.log("name ="+name1+" age="+age1);

function getVal(obj, fieldName){
  let val= obj[fieldName];
  return val;
}

let name2=getVal(user,"name");
console.log("name="+name2);