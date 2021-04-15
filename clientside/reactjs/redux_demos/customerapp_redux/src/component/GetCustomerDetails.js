import React, { useState , useEffect} from 'react'
import DisplayCustomerDetails from './DisplayCustomerDetails';
import commonStyle from './commonStyle.module.css';
import {fetchCustomer}  from '../service/CustomerService';

export default function GetCustomerDetails(props) {
    /*
    let mockCustomer={
        id:10,
        name: 'shiv',
        age:21,
        address: 'chennai'
      };
      */
    const idRef = React.createRef();


    const intitalState = { customer:undefined, errMsg: undefined };

    const [currentState, setNewState] = useState(intitalState);

    

    const fetchCustomerOnRender=()=>{
        const id=props.match.params.id;// fetching id from parameter     
        const promise=  fetchCustomer(id);
        const successFun=(response)=>{
        const newState={...currentState, customer:response.data};
            setNewState(newState);
        };
         const errFun=(error)=>{
           const newState={...currentState, errMsg:error.message};
            setNewState(newState);
         };

         promise.then(successFun).catch(errFun);

    }

     useEffect(fetchCustomerOnRender);


    const setFieldState = () => {
        const idValue = idRef.current.value;
        const newState = { ...currentState, id: idValue, customer: undefined, errMsg:undefined };
        setNewState(newState);
    }

    return (
        <div>
            <h1> Get customer details</h1>
           


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