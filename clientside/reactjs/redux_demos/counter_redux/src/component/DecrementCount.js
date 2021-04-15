import { useDispatch, useSelector } from "react-redux";
import { decrement } from "../redux/countActions";

export default function DecrementCount() {


    const response = useSelector(state => {
        const result = { count: state.count };
        return result;
    })


   const dispatch =useDispatch();
        


    const clickHandler = (event)=>{
        event.preventDefault();
        dispatch(decrement);
    }


    return (
        <div>
            <h1>Decrement Count component </h1>


        Count is {response.count}

            <br />

            <button onClick={clickHandler}>Decrement</button>


        </div>


    )

}