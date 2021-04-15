import { fetchAll } from "../../service/CustomerService";
import store from "../store";
import fetchAllCustomersContants from "./fetchAllCustomersConstants";


function fetchAllCustomersRequest(){
 return (
     {
      progress: true,
      customers:[],
      error:'',
      type:fetchAllCustomersContants.fetchAllCustomersRequest
     }
 );

}

function fetchAllCustomersSuccess(customers){

    return (
        {
         progress: false,
         customers:customers,
         error:'',
         type:fetchAllCustomersContants.fetchAllCustomersSuccess
        });
}


function fetchAllCustomersFail(error){

    return (
        {
            progress: false,
            customers:[],
            error:error,
            type:fetchAllCustomersContants.fetchAllCustomersFail
           });
   

}

function fetchAllCustomers(){

    return ()=>{        
       store.dispatch(fetchAllCustomersRequest());
       const promise=fetchAll();
       promise.then((response)=>{
           const customers=response.data;
           store.dispatch(fetchAllCustomersSuccess(customers));
       }).catch(error=>{
           store.dispatch(fetchAllCustomersFail(error.message));
       }) 

    }

}
 
export {fetchAllCustomers, fetchAllCustomersFail, fetchAllCustomersSuccess, fetchAllCustomersRequest};