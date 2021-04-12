import React, { Component } from "react";
import DisplayStudentDetails from "./DisplayStudentDetails";
import commonStyle from "./commonStyle.module.css";
import {addStudent} from "../service/StudentService"

 export default class AddStudent extends Component {
  nameRef = React.createRef();
  scoreRef = React.createRef();

   

  constructor(props) {
    super(props);
    /*
    const testStudent={ 
     id:10,
     name: 'jatin',
     score:90,
     courseId: 13,
     courseName:'java language' 
    };
    */

    this.state = {
      sname: undefined,
      score: undefined,
      errMsg: undefined,
      student: undefined,
    };
  }

  changeHandler(ref) {
    const field = ref.current;
    const fieldName = field.name;
    const fieldValue = field.value;
    const newState = { ...this.state, [fieldName]: fieldValue , student:undefined , errMsg: undefined};
    this.setState(newState);
  }

  submitHandler(event){
      event.preventDefault();
      console.log("inside submit handler ");
      let formData={...this.state};
      const successFun=(response)=>{
          console.log("inside succesfun", response);
          this.setState({...this.state,student:response.data});
      } ;

      const errFun=(error)=>{
             console.log("inside err fun", error);
             this.setState({...this.state, errMsg:error.response.data});
      };

      const promise=addStudent(formData);
      promise.then(successFun)
      .catch(errFun);
    

  }

  render() {
    return (
      <div>
        <div>
          <form onSubmit={(event)=>this.submitHandler(event)}>
            <div>
              <label>Enter name</label>
              <input
                name="sname"
                ref={this.nameRef}
                onChange={() => this.changeHandler(this.nameRef)}
              />
            </div>

            <div>
              <label>Enter score</label>
              <input
                name="score"
                ref={this.scoreRef}
                onChange={() => this.changeHandler(this.scoreRef)}
              />
            </div>

            <button>Add Student</button>
          </form>

          {this.state.student ? (
            <div>
              <h3> Student successfully created</h3>
              <DisplayStudentDetails student={this.state.student} />
            </div>
          ) : (
            ""
          )}

          {this.state.errMsg ? (
            <div className={commonStyle.error}>
              Request was not successful <br />
              {this.state.errMsg}
            </div>
          ) : (
            ""
          )}
        </div>
      </div>
    );
  }
}
