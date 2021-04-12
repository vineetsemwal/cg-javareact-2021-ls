import { useState } from "react";

export default function ClickCounter() {

     let [counter, setCounter ]  =useState(0);

     const incrementHandler=()=>{
         let newState=counter+1;
         const stateFun=prevCount=>prevCount+1;
         setCounter(stateFun);
     }

    return (
        <div>
            <h3>Increments counter</h3>
             {counter}
            <br/>
            <button onClick={incrementHandler}>Increment </button>


        </div>

    );


}