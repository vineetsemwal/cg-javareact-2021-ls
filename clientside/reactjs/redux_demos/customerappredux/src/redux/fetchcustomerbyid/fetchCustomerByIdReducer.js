import fetchCustomerByIdConstants from "./fetchCustomerByIdConstants";

const initialState={
    progress:false,
    customer:undefined,
    error:''
}

 function  fetchCustomerByIdReducer(state =initialState, action){

  if(action.type===fetchCustomerByIdConstants.fetchByIdRequest ||
     action.type===fetchCustomerByIdConstants.fetchByIdSuccess ||
     action.type===fetchCustomerByIdConstants.fetchByIdFail
    ){
        let newState={...state, ...action};
        return newState;
    }

    return state ;

}

export default fetchCustomerByIdReducer;