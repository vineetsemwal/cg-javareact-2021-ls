import React, { useState } from 'react';
import DisplayStudentDetails from './DisplayStudentDetails';
import {addStudent} from '../service/StudentService';
import  commonStyle from './commonStyle.module.css'

export default function AddStudent() {
 /*
    const testStudent={ 
     id:10,
     name: 'jatin',
     score:90,
     courseId: 13,
     courseName:'java language' 
    };
   */ 
  const nameRef=React.createRef();
  const scoreRef=React.createRef();
  const initialState={
    sname: undefined,
    score: undefined,
    errMsg: undefined,
    student: undefined,
  };
  let [state, setFormState] =useState(initialState);

 const  changeHandler=(ref)=>{
    const field = ref.current;
    const fieldName = field.name;
    const fieldValue = field.value;
    let newState={...state,[fieldName]:fieldValue, student:undefined, errMsg:undefined};
    setFormState(newState);
  }

  const submitHandler=(event)=>{
   event.preventDefault();
   console.log("inside submit handler",state);   
   const formData={...state};
   let promise=addStudent(formData);
   const successFun=(response)=>{
       console.log("inside successfun ", response.data);
       const newState={...state,student:response.data};
        setFormState(newState);
   }
   const errFun=(error)=>{
       console.log("isnide error");
       const newState={...state,errMsg:error.response.data};
       setFormState(newState);
   }

   promise.then(successFun).catch(errFun);

  }

    return (
        <div>
            
          <form onSubmit={(event)=>submitHandler(event)}>
            <div>
              <label>Enter name</label>
              <input
                name="sname"
                ref={nameRef}
                onChange={() => changeHandler(nameRef)}
              />
            </div>

            <div>
              <label>Enter score</label>
              <input
                name="score"
                ref={scoreRef}
                onChange={() =>changeHandler(scoreRef)}
              />
            </div>

            <button>Add Student</button>
          </form>
 
 
          { state.student? (
            <div>
              <h3> Student successfully created</h3>
              <DisplayStudentDetails student={state.student} />
            </div>
          ) : (
            ""
          )}

          {state.errMsg ? (
            <div className={commonStyle.error}>
              Request was not successful <br />
              {state.errMsg}
            </div>
          ) : (
            ""
          )}
 
        </div>

    );


}