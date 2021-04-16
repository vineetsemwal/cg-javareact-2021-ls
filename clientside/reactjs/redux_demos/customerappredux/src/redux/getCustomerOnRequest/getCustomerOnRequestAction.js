import { fetchCustomer } from "../../service/CustomerService";
import store from "../store";
import getCustomerOnRequestConstants from "./getCustomerOnRequestConstants";

function getCustomerOnRequestSuccess(customer) {

    return ({
        type: getCustomerOnRequestConstants.success,
        customer: customer,
        error: ''
    });

}


function getCustomerOnRequestFail(error) {

    return ({
        type: getCustomerOnRequestConstants.fail,
        customer: undefined,
        error: error
    });

}

function getCustomerOnRequest(id) {

    return () => {
        const promise = fetchCustomer(id);
        promise.then((response) => {
            const customer = response.data;
            const actionObj = getCustomerOnRequestSuccess(customer);
            store.dispatch(actionObj);
        }).catch(error => {
            const actionObj = getCustomerOnRequestFail(error.message);
            store.dispatch(actionObj);
        })
    }

}


export {getCustomerOnRequest,getCustomerOnRequestFail,getCustomerOnRequestSuccess};

