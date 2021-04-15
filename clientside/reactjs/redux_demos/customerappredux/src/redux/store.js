import { applyMiddleware, combineReducers, createStore } from "redux";
import { composeWithDevTools } from "redux-devtools-extension";
import thunk from "redux-thunk";
import fetchAllCustomersReducer from "./fetchallcustomers/fetchAllCustomersReducer";
import fetchCustomerByIdReducer from "./fetchcustomerbyid/fetchCustomerByIdReducer";

const store=createStore(
    combineReducers(
        {
   fetchAllCustomers: fetchAllCustomersReducer,
   fetchCustomerById:fetchCustomerByIdReducer
        }),
    composeWithDevTools(applyMiddleware(thunk))
);

export default store;
