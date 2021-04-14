import React, { useState } from 'react';
import DisplayCustomerDetails from './DisplayCustomerDetails';
import commonStyle from './commonStyle.module.css';
import {addCustomer} from '../service/CustomerService';



export default function AddCustomer() {
    /*
    let mockCustomer={
        id:10,
        name: 'shiv',
        age:21,
        address: 'chennai'
      };
*/
    const nameRef = React.createRef();
    const ageRef = React.createRef();
    const addressRef = React.createRef();
    const initialState = { 
        name: undefined, 
        age: undefined,
         address: undefined, 
         customer:undefined,
          errMsg:undefined
         };
    const [currentState, setNewState] = useState(initialState);


    const submitHandler = (event) => {
        event.preventDefault();
        let data={...currentState};
        const promise=addCustomer(data);
        promise.then(
            response=>setNewState({...currentState, customer:response.data})
            )
        .catch(
            error => setNewState( {...currentState,errMsg:error.message}) 
            );
     
    }


    const setFieldState=(ref)=>{
      const fieldName= ref.current.name;
      const fieldValue=ref.current.value;
      const newState={...currentState,[fieldName]:fieldValue, customer:undefined, errMsg:undefined};
      setNewState(newState);

    }


    return (

        <div>
            <h1>Add Customer </h1>

            <form onSubmit={submitHandler}>

                <div>
                    <label>Enter name</label>
                    <input name="name" type="text" ref={nameRef}  onChange={()=>setFieldState(nameRef)} />

                </div>


                <div>
                    <label>Enter age</label>
                    <input name="age" type="number" ref={ageRef} onChange={()=>setFieldState(ageRef)} />

                </div>

                <div>
                    <label>Enter address</label>
                    <input name="address" type="text" ref={addressRef}  onChange={()=>setFieldState(addressRef)} />

                </div>

                <button>Add Customer </button>

            </form>

            {currentState.customer ? (
                <div>
                    <h3>Customer Added</h3>
                    <DisplayCustomerDetails customer={currentState.customer} />
                </div>
            ) : ''}

            {currentState.errMsg ? (
                <div className={commonStyle.error}>
                   Request proccessing was not successful
                   <br/>
                   {currentState.errMsg} 
                </div>
            ) : ''}

        </div>

    );


}