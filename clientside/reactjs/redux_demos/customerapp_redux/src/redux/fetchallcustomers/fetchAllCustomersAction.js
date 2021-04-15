import { fetchAll } from "../../service/CustomerService";
import store from "../store";
import fetchAllCustomersConstants from "./fetchAllCustomersConstants";

function fetchAllCustomersRequest(){
return ( {
 
 customers:[],
 error:'',
progress:true,
type:fetchAllCustomersConstants.fetch_customers_reqest

});
    
}

function fetchAllCustomersSuccess(customers){
    return ( { 
        customers:customers,
        error:'',
       progress:false,
       type:fetchAllCustomersConstants.fetch_customers_success
       
       });    
}



function fetchAllCustomersFail(error){
    return ( { 
        customers:[],
        error:error,
       progress:false,
       type:fetchAllCustomersConstants.fetch_customers_fail
       
       });    
}

function fetchAllCustomers(){
    store.dispatch( fetchAllCustomersRequest());
    const promise=fetchAll();
    promise.then(response=>{
        let customers=response.data;
        let actionObj=fetchAllCustomersSuccess(customers);
        store.dispatch(actionObj);
    }).catch(
        error=>{
            let actionObj=fetchAllCustomersFail(error.message);
            store.dispatch(actionObj);
        }
    )
    
}

export  {fetchAllCustomersRequest, fetchAllCustomersFail, fetchAllCustomersSuccess, fetchAllCustomers};



