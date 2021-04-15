import { applyMiddleware, createStore } from "redux";
import { composeWithDevTools } from "redux-devtools-extension";
import thunk from "redux-thunk";
import countReducer from "./countReducer";

const store=createStore(
    countReducer,
    composeWithDevTools(applyMiddleware(thunk))
);

export default store;