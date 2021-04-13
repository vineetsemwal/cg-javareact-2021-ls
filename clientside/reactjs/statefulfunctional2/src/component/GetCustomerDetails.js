import React, { useState } from 'react'
import DisplayCustomerDetails from './DisplayCustomerDetails';
import commonStyle from './commonStyle.module.css';
import {fetchCustomer}  from '../service/CustomerService';

export default function GetCustomerDetails() {
    /*
    let mockCustomer={
        id:10,
        name: 'shiv',
        age:21,
        address: 'chennai'
      };
      */

    const idRef = React.createRef();

    const intitalState = { id: undefined, customer:undefined, errMsg: undefined };

    const [currentState, setNewState] = useState(intitalState);


    const submitHandler = (event) => {
        event.preventDefault();
        console.log("current state", currentState);
        const promise= fetchCustomer(currentState.id);
        const successFun=(response)=>{
        const newState={...currentState, customer:response.data};
            setNewState(newState);
        };
         const errFun=(error)=>{
           const newState={...currentState, errMsg:error.response.data};
            setNewState(newState);
         };

         promise.then(successFun).catch(errFun);

    }

    const setFieldState = () => {
        const idValue = idRef.current.value;
        const newState = { ...currentState, id: idValue, customer: undefined, errMsg:undefined };
        setNewState(newState);
    }

    return (
        <div>
            <h1> Get customer details</h1>
            <form onSubmit={submitHandler}>

                <div>
                    <label>Enter id</label>

                    <input name="id" type="number" ref={idRef} onChange={setFieldState} />

                </div>

                <button>Get Customer</button>

            </form>


            {currentState.customer ? (
                <div>
                    <DisplayCustomerDetails customer={currentState.customer} />
                </div>
            ) : ''}


            {
                currentState.errMsg ? (

                    <div className={commonStyle.error}>
                        Request processing unsuccessful
                        <br />
                        {currentState.errMsg}

                    </div>
                ) : ''

            }
        </div>

    );

}