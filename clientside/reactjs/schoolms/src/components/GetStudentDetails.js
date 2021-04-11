import React, { Component } from "react";
import DisplayStudentDetails from "./DisplayStudentDetails";
import commonStyle from './commonStyle.module.css';
import {fetchStudent} from '../service/StudentService';

export default class GetStudentDetails extends Component {


    idRef = React.createRef();
    intitialState={ id: -1,  student: undefined, errMsg: undefined };

    constructor(props) {
        super(props);
        this.state = this.intitialState;
        //this.submitHandler=this.submitHandler.bind(this);
    }


    submitHandler(event) {
        event.preventDefault();
        console.log("about to create request",this.state);   
        const promise =fetchStudent(this.state.id); 
        promise.then((response)=>{
            const student=response.data;
            this.setState({...this.state,student:student ,errMsg:undefined});
            console.log("student fetched", this.state.student );
       
        })
        .catch(
           (error)=>{
               console.log("there was error",error);
               this.setState({...this.state,student:undefined,errMsg:error.response.data});
       
           }
        );
    }

    setIdHandler() {
        let idVal = this.idRef.current.value;
        this.setState({ ...this.state, id: idVal , student:undefined, errMsg:undefined });
    }


    render() {
     console.log("isnide render , state=",this.state);
        return (

            <div>
                <h3>Get user details</h3>

                <form onSubmit={(event) => this.submitHandler(event)}>
                    <div>
                        <label>Enter Id </label>
                        <input name="id" type="number" ref={this.idRef} onChange={() => this.setIdHandler()} />
                    </div>

                    <button> Get User</button>
                </form>

                {this.state.student ? (

                    <div>
                        <h3>Student Details </h3>
                        <DisplayStudentDetails student={this.state.student} />
                    </div>

                ) : ''}


                {this.state.errMsg ? (
                    <div className={commonStyle.error}>
                    Request Processing was not successful
                    <br/>
                    
                     {this.state.errMsg}
                    </div>

                ) : ''}

            </div>

        );


    }

}