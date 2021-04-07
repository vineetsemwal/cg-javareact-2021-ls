/**
 * let is block scoped
 */
function displayNum(){
  
    if(true) {
        let num=20;

     }
 
     console.log("num is "+num);
 }
 
 displayNum();