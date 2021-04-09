import { useState } from "react";


function ClickCounterFun(){


     let [counter,setCount]  =useState(0);
  

    //const  setCountState=prevCount=>prevCount+1 ;

    return (
        <div>
            Counter is {counter}
            <br />
          <button onClick={ ()=>setCount(prevCount=>prevCount+1) } >Increment Count</button>
        </div>
    );

}

export default ClickCounterFun;