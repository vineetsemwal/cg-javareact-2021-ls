import React, { Component } from "react";
import DisplayStudentDetails from "./DisplayStudentDetails";
import StudentService from "./StudentService";

class SearchUser extends Component {
    idRef = React.createRef();
    service = new StudentService();
    initialState={student:undefined, error:undefined};
    constructor(props) {
        super(props);
        this.state=this.initialState;
    }   

    submitHandler(event) {
        this.state=this.initialState;
        event.preventDefault();
        //create a request to server
        const id = this.idRef.current.value;
        console.log("id for which user details has to eb submitted");
        let promise = this.service.fetchStudent(id);
        promise.then((response) => {            
            const student=response.data;
            console.log("inside success student fetched", student);
            this.setState({...this.state,student:student});

        })
            .catch((err) => {
                console.log("inside err callback",);
                this.setState({...this.state,error:err.response.data});
            }

            );

    }

    render() {
        return (
            <div>
                <h3>Get user by id </h3>
                <form>
                    <div>
                        <label>Enter user id</label>
                        <input type="number" ref={this.idRef} />
                    </div>
                    <button onClick={(event) => this.submitHandler(event)}>
                        Get User
          </button>
                </form>
                <h3>Fetched Student Details</h3>

                {this.state.student ? (
                    <DisplayStudentDetails student={this.state.student} />
                ) : this.state.error }

            

            </div>
        );
    }
}

export default SearchUser;
