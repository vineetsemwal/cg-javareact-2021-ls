import React, { useState } from 'react'
import DisplayCustomerDetails from './DisplayCustomerDetails';
import commonStyle from './commonStyle.module.css';
import { fetchCustomer } from '../service/CustomerService';
import { useDispatch, useSelector } from 'react-redux';
import { getCustomerOnRequest } from '../redux/getCustomerOnRequest/getCustomerOnRequestAction';

export default function GetCustomerDetailsOnRequest() {
    /*
    let mockCustomer={
        id:10,
        name: 'shiv',
        age:21,
        address: 'chennai'
      };
      */

    const idRef = React.createRef();

    const intitalState = { id: undefined };

    const [currentState, setNewState] = useState(intitalState);

    const response=useSelector(state=>{
        return ({
          customer:state.getCustomerOnRequest.customer,
          error: state.getCustomerOnRequest.error
        });
    })

    const dispatch=useDispatch();



    const submitHandler = (event) => {
        event.preventDefault();
        console.log("current state", currentState);
         const id=idRef.current.value;
         dispatch(getCustomerOnRequest(id));

    }

    const setFieldState = () => {
        const idValue = idRef.current.value;
        const newState = { ...currentState, id: idValue, customer: undefined, errMsg: undefined };
        setNewState(newState);
    }

    return (
        <div>
            <h1> Get customer details on request</h1>

            <div className={commonStyle.content}>
                <form onSubmit={submitHandler} className={commonStyle.content}>

                    <div className="form-group">
                        <label>Enter id</label>

                        <input name="id" type="number" ref={idRef} onChange={setFieldState} className="form-control" />

                    </div>

                    <button className="btn btn-primary">Get Customer</button>

                </form>

                {response.customer ? (
                    <div>
                        <DisplayCustomerDetails customer={response.customer} />
                    </div>
                ) : ''}


                {
                    response.error ? (

                        <div className={commonStyle.error}>
                            Request processing unsuccessful
                            <br />
                            {response.error}

                        </div>
                    ) : ''

                }
            </div>
        </div>

    );

}