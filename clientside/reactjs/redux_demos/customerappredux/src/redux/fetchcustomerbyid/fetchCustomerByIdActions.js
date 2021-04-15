import { fetchCustomer } from "../../service/CustomerService";
import store from "../store";
import fetchCustomerByIdConstants from "./fetchCustomerByIdConstants";

function fetchCustomerByIdRequest(){

    return ({
       progress:true,
       customer:undefined,
       error:'',
       type:fetchCustomerByIdConstants.fetchByIdRequest
    });

}

function fetchCustomerByIdSuccess(customer){

    return ({
       progress:false,
       customer:customer,
       error:'',
       type:fetchCustomerByIdConstants.fetchByIdSuccess
    });

}


function fetchCustomerByIdFail(error){

    return ({
       progress:false,
       customer:undefined,
       error:error,
       type:fetchCustomerByIdConstants.fetchByIdFail
    });

}

function fetchCustomerById(customerId){

    return ()=>{
       store.dispatch(fetchCustomerByIdRequest());
       const promise= fetchCustomer(customerId);
       promise.then(response=>{
           const customer=response.data;
           store.dispatch(fetchCustomerByIdSuccess(customer))
       })
       .catch(error=>{
           store.dispatch(fetchCustomerByIdFail(error.message))
       })

    }

}

export {fetchCustomerById, fetchCustomerByIdFail, fetchCustomerByIdSuccess, fetchCustomerByIdRequest};
