
import reduxConstants from "./reduxConstants";
import store from "./store";

function incrementAction(countValue){

    return { count:countValue, type:reduxConstants.increment};

}

function decrementAction(countValue){
    return { count:countValue, type:reduxConstants.decrement};

}

function resetAction(){

    return { count:0, type:reduxConstants.reset};
}

function increment(){

   return ()=>{ 
   const state= store.getState();
   let count=state.count;
    count++;
    let actionObj=incrementAction(count);
    store.dispatch(actionObj);
   };
}



function decrement(){
    return ()=>{
     const state=store.getState();
     let count=state.count;
     count--;
     let actionObj=decrementAction(count);
     store.dispatch(actionObj);
    };
}

function reset(){
    return ()=>{
    let actionObj=resetAction();
    store.dispatch(actionObj);
    };
}

export {incrementAction,decrementAction,resetAction , increment, decrement, reset} ;

