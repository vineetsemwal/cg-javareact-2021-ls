import {useState} from 'react';


export default function CounterComponent(){
    
  const [count,setCountState]  =useState(0);


    const incrementHandler=(event)=>{
     event.preventDefault();
      setCountState(count+1);    
      //setCountState((prevCount)=>prevCount+1); 
    }


   return (

    <div>
  Counter is {count}
 <br/>

 <button onClick={(incrementHandler)}>Increment</button>

    </div>
    
    
    )

} 