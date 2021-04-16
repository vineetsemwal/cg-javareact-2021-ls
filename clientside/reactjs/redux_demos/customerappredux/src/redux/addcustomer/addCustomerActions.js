import { addCustomer } from "../../service/CustomerService";
import store from "../store";
import addCustomerConstants from "./addCustomerConstants";

function addCustomerSuccess(customer) {
    return ({
        customer: customer,
        error: '',
        type: addCustomerConstants.success
    });

}

function addCustomerFail(error) {
    return (
        {
            customer: undefined,
            error: error,
            type: addCustomerConstants.fail
        });
}

function addCustomerAction(data) {

    return () => {
        const promise = addCustomer(data);
        promise.then(
            response => {
                const customer=response.data;
                let actionObj = addCustomerSuccess(customer);
                store.dispatch(actionObj);
            }
        ).catch(error => {
            let actionObj = addCustomerFail(error.message);
            store.dispatch(actionObj);
        })

    }


}

export {addCustomerAction,addCustomerSuccess,addCustomerFail};

