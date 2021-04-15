import { fetchCustomerById } from "./fetchCustomerByIdActions";
import custByIdConst from "./fetchCustomerByIdConstants";

const initialState= {
    progress: false,
    customer:undefined,
    error:''
};;

export default function fetchCustomerByIdReducer(state=initialState, action){

    if(action.type==custByIdConst.fetch_customerById_request || 
        action.type== custByIdConst.fetch_customerById_success || 
        action.type==custByIdConst.fetch_customerById_fail
        ){
         let newState={...state,...action};
         return newState;
        }

        return state;
        
}


