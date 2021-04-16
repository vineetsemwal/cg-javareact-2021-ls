import getCustomerOnRequestConstants from "./getCustomerOnRequestConstants"

const intialState={
customer: undefined,
error:''
}

function getCustomerOnRequestReducer(state=intialState, action){

    if(action.type===getCustomerOnRequestConstants.fail ||
        action.type===getCustomerOnRequestConstants.success){
        let newState={...state,...action};
        return newState;
        }

        return state;
}

export default getCustomerOnRequestReducer;