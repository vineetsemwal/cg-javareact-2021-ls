import { applyMiddleware, combineReducers, createStore } from "redux";
import { composeWithDevTools } from "redux-devtools-extension";
import thunk from "redux-thunk";
import addCustomerReducer from "./addcustomer/addCustomerReducer";
import fetchAllCustomersReducer from "./fetchallcustomers/fetchAllCustomersReducer";
import fetchCustomerByIdReducer from "./fetchcustomerbyid/fetchCustomerByIdReducer";
import getCustomerOnRequestReducer from "./getCustomerOnRequest/getCustomerOnRequestReducer";

const store = createStore(
  combineReducers({
    fetchAllCustomers: fetchAllCustomersReducer,
    fetchCustomerById: fetchCustomerByIdReducer,
    addCustomer: addCustomerReducer,
    getCustomerOnRequest:getCustomerOnRequestReducer
  }),
  composeWithDevTools(applyMiddleware(thunk))
);

export default store;
