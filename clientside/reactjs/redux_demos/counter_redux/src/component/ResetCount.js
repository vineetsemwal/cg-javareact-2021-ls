import { useDispatch, useSelector } from "react-redux";
import { reset } from "../redux/countActions";

export default function ResetCount(){


    const response = useSelector(state => {
        const result = { count: state.count };
        return result;
    })


   const dispatch =useDispatch();
        


    const clickHandler=(event)=>{
        event.preventDefault();
        console.log("inside click handler, action dispatched");
        dispatch(reset);
    }
 
 
     return (
         <div>
         <h1>Reset Count component </h1>
 
    
 
 
        Count is {response.count}
 
        <br/>
 
        <button onClick={clickHandler}>Reset</button> 
 
 
       </div>
 
         
         )
 
 }