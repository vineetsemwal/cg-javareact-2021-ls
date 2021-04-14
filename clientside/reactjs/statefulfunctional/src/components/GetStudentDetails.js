import React , {useState} from 'react';
import DisplayStudentDetails from './DisplayStudentDetails';
import {fetchStudent} from '../service/StudentService'
import  commonStyle from './commonStyle.module.css'


export default function GetStudentDetails(){
    /*
    const testStudent={ 
        id:10,
        name: 'jatin',
        score:90,
        courseId: 13,
        courseName:'java language' 
       };
       */
    const idRef=React.createRef();

    let [state,setFormState]=useState({id:undefined, student:undefined, errMsg:undefined});

    const setIdHandler=()=>{
         let field=idRef.current;
         let fieldValue=field.value;
         let newState={...state,id:fieldValue, student:undefined , errMsg:undefined};
         setFormState(newState);
    }

    const submitHandler=(event)=>{
       event.preventDefault();
       let promise=fetchStudent(state.id);
       const successFun=(response)=>{
           console.log("isnide successfun",response.data);
           setFormState({...state, student:response.data});
       }
       const errFun=(error)=>{
           console.log("inside errorfun");
           setFormState({...state, errMsg:error.message});
       }
       promise.then(successFun).catch(errFun);
    }

    return (

        <div>
            <h3>Get user details</h3>

            <form onSubmit={(event) => submitHandler(event)}>
                <div>
                    <label>Enter Id </label>
                    <input name="id" type="number" ref={idRef} onChange={() => setIdHandler()} />
                </div>

                <button> Get Student</button>
            </form>

            {state.student ? (

                <div>
                    <h3>Student Details </h3>
                    <DisplayStudentDetails student={state.student} />
                </div>

            ) : ''}


            {state.errMsg ? (
                <div className={commonStyle.error}>
                Request Processing was not successful
                <br/>
                
                 {state.errMsg}
                </div>

            ) : ''}

        </div>

    );

}