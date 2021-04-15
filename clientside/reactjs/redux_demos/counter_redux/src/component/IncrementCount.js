import { useDispatch, useSelector } from "react-redux";
import { increment } from "../redux/countActions";

export default function IncrementCount() {


    const response = useSelector(state => {
        const result = { count: state.count };
        return result;
    })


   const dispatch =useDispatch();
        

    const clickHandler = (event) => {
        event.preventDefault();
        dispatch(increment());  
    }


    return (
        <div>
            <h1>Increment Count component </h1>



       Count is {response.count}

            <br />

            <button onClick={clickHandler}>Increment</button>


        </div>


    )

}