import fetchAllCustomersConstants from "./fetchAllCustomersConstants";


const initialState={ 
    customers:[],
    error:'',
   progress:false,
   
   };


export default function fetchAllCustomersReducer(state=initialState, action){

    switch (action.type){

        case fetchAllCustomersConstants.fetch_customers_reqest :{
            let newState={...state, ...action};
            return newState;
        }

        case fetchAllCustomersConstants.fetch_customers_success : {
                  let newState={...state,...action};
                   return newState;  
        }


        case fetchAllCustomersConstants.fetch_customers_fail:{
            let newState={...state,...action};
            return newState;  
        }

        default : {
            return state;
        }

    }

}