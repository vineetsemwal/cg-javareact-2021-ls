import  reduxConstants from './reduxConstants';

const initialState={count:0};

export default function countReducer(state=initialState,action){

      switch(action.type){

        case reduxConstants.increment :{    
           const newState={count:action.count};
           return newState;
        }

        case reduxConstants.decrement : {
          const newState={count:action.count};
            return newState;

        }

        case reduxConstants.reset: {
            const newState={count:action.count};
            return newState;
        }

        default : {
            return state;
        }

   }

}