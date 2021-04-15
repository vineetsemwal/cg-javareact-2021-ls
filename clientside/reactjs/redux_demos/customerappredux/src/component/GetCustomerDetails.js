import React, { useState , useEffect} from 'react'
import DisplayCustomerDetails from './DisplayCustomerDetails';
import commonStyle from './commonStyle.module.css';
import { useDispatch, useSelector } from 'react-redux';
import { fetchCustomerById } from '../redux/fetchcustomerbyid/fetchCustomerByIdActions';

export default function GetCustomerDetails(props) {
    /*
    let mockCustomer={
        id:10,
        name: 'shiv',
        age:21,
        address: 'chennai'
      };
      */
   
    const currentState = useSelector( state=>{
          return ({
            customer: state.fetchCustomerById.customer,
            error:state.fetchCustomerById.error
          });
      })
   
      const dispatch=useDispatch();
  

    const fetchCustomerOnRender=()=>{
        const id=props.match.params.id;// fetching id from parameter     
         dispatch(fetchCustomerById(id));

    }

     useEffect(fetchCustomerOnRender,[]);



    return (
        <div>
            <h1> Get customer details</h1>
           


            {currentState.customer ? (
                <div>
                    <DisplayCustomerDetails customer={currentState.customer} />
                </div>
            ) : ''}


            {
                currentState.error ? (

                    <div className={commonStyle.error}>
                        Request processing unsuccessful
                        <br />
                        {currentState.error}

                    </div>
                ) : ''

            }
        </div>

    );

}