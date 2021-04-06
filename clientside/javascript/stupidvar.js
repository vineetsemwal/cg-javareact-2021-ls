/**
 * var problem: variable declared with var is available outside the block where it is declared( in the whole function)  
 */
function displayNum(){

   if(true) {
        var num=20;
    }

    console.log("num is "+num);
}

displayNum();