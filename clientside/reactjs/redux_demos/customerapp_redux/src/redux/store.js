import { applyMiddleware, createStore } from "redux";
import { composeWithDevTools } from "redux-devtools-extension";
import thunk from "redux-thunk";
import fetchAllCustomersReducer from "./fetchallcustomers/fetchAllCustomersReducer";


const store=createStore(
fetchAllCustomersReducer,

composeWithDevTools(applyMiddleware(thunk))
);

export default store ;