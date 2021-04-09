import React, { Component } from "react";

class AddEmployee extends Component {


    empNameRef = React.createRef();
    ageRef = React.createRef();

    constructor(props) {
        super(props);
        this.state = { empName: '', age: -1, formStatus: '' };
    }


    submitHandler(event) {
        event.preventDefault();  
        this.setState({ ...this.state, formStatus: 'Employe Form details Sent' });
        let emp={empName:this.state.empName, age: this.state.age };
        this.props.addHandler(emp);
        
    }

    setEmployeeName() {
        let nameVal = this.empNameRef.current.value;
        this.setState({ ...this.state, empName: nameVal })
    }

    setAge() {
        let ageVal = this.ageRef.current.value;
        this.setState({ ...this.state, age: ageVal });
    }



    render() {

        return (

            <div>

                <form onSubmit={(event) => this.submitHandler(event)}>
                    <label>Employee Name</label>
                    <input name="empName" type="text" ref={this.empNameRef} onChange={() => this.setEmployeeName()} />

                    <br />
                    <label>Age</label>
                    <input name="age" type="number" ref={this.ageRef} onChange={() => this.setAge()} />
                    <br />
                    <button >Add Employee </button>

                </form>

                <h3>{this.state.formStatus} </h3>

                 name is  {this.state.empName} age is {this.state.age}
           
            </div>

        );

    }

}


export default AddEmployee;