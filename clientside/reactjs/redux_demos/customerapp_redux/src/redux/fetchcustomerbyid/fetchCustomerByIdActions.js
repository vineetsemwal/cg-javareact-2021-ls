import { fetchCustomer } from "../../service/CustomerService";
import store from "../store";
import custByIdConst from "./fetchCustomerByIdConstants";


function fetchCustomerByIdRequest(){

    return {
         progress: true,
         customer:undefined,
         error:'',
         type:custByIdConst.fetch_customerById_request
    };

}

function fetchCustomerByIdSuccess(customer){
    return {
        progress: false,
        customer:customer,
        error:'',
        type:custByIdConst.fetch_customerById_success
   };

}


function fetchCustomerByIdFail(error){
    return {
        progress: false,
        customer:undefined,
        error:error,
        type:custByIdConst.fetch_customerById_fail
   };

}


function fetchCustomerById(id){
    console.log("inside action fetchCustomerById id="+id);
    store.dispatch(fetchCustomerByIdRequest());

    
      const promise=fetchCustomer(id);
      promise.then(response=>{
          const customer=response.data;
          let actionObj=fetchCustomerByIdSuccess(customer);
          store.dispatch(actionObj);
      })
      .catch(error=>{
          let actionObj=fetchCustomerByIdFail(error.message);
          store.dispatch(actionObj);
      })  
      

}


export  {fetchCustomerByIdFail,fetchCustomerByIdSuccess, fetchCustomerByIdRequest, fetchCustomerById};


