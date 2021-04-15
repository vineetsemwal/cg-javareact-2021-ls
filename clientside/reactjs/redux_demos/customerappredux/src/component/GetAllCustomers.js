import { useEffect, useState } from "react";
import { fetchAll } from "../service/CustomerService";
import DisplayCustomerDetails from "./DisplayCustomerDetails";
import commonStyle from './commonStyle.module.css';
import DisplayCustomerList from "./DisplayCustomerList";
import { useDispatch, useSelector } from "react-redux";
import { fetchAllCustomers } from "../redux/fetchallcustomers/fetchAllCustomersActions";

export default function GetAllCustomers() {

    /*
        const c1={id:1, name:'shivender',age:21, address:'chennai'};
        const c2={id:2, name:'raja',age:22, address:'chennai'};
    
         const customers=[c1, c2];      
    
    */

    const currentState =useSelector(state=>{
         return {
           customers: state.fetchAllCustomers.customers,
           error:state.fetchAllCustomers.error,

         };
     }) 
     
     const dispatch=useDispatch();

    const fetchAll = () => {
        console.log("inside use state function")
        dispatch(fetchAllCustomers());
    };

    /**
     * use effect gets execute when component is mounted and also when component is updated
     * in this demo we don't want it to execute when component is updated because in usestate we are changing the state
     *  that means component has got updated and so usestate will get execute again , this will become an infinite cycle
     * to break this cycle, empty array is passed, now useeffect will be executed only when component is mounted
     *  and not when it is updated
     */
    useEffect(fetchAll, []);

    console.log("inside getall customers", currentState.customers);

    return (
        <div>

            <h1>Get All customers</h1>

            <div className={commonStyle.content}>
                <ul >

                    {currentState.customers ? (

                        <DisplayCustomerList customers={currentState.customers} />

                    ) : ''}



                </ul>

            </div>
            { currentState.error ? (

                <div className={commonStyle.error}>
                    Error in request processing
                    <br />
                    {currentState.error}
                </div>
            ) : ''}


        </div>

    )

}