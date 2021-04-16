import addCustomerConstants from "./addCustomerConstants";

const intialState={
customer:undefined,
error:''
};

function addCustomerReducer(state=intialState, action){

    if(action.type===addCustomerConstants.fail || action.type===addCustomerConstants.success){
       let newState={...state, ...action};
       return newState;
    }

    return state;

}

export default addCustomerReducer;