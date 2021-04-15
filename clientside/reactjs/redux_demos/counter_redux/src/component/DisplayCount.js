import { useSelector } from "react-redux"

export default function DisplayCount() {

   const response =useSelector(state=>{
        const result= {count:state.count};
        return result;
    })

    return (
        <div>
          <h1>Displays Count component </h1>

         Count is {response.count}

        </div>

    )


}