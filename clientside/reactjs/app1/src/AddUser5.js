import React, { Component } from "react";


class AddUser5 extends Component {

   firstnameRef=React.createRef();
   lastnameRef=React.createRef();
   ageRef=React.createRef();

  constructor(props) {
    super(props);
    this.state = { firstname: "", lastname: "", age: -1 };
  }


  setFieldValue(reference){
    const field=reference.current;
    let fieldName=field.name;
    let fieldVal = field.value;
    this.setState({...this.state , [fieldName]:fieldVal});

  }

  render() {
    return (
      <div>
        <h3>Add USer 5</h3>
        <form>
          <div>
            <label>Enter firstname</label>

            <input
              name="firstname"
              type="text"
              ref={this.firstnameRef}
              onChange={() => this.setFieldValue(this.firstnameRef)}
            />
          </div>

          <div>
            <label>Enter lastname</label>

            <input
              name="lastname"
              type="text"
              ref={this.lastnameRef}
              onChange={() => this.setFieldValue(this.lastnameRef)}
            />
          </div>

          <div>
            <label>Enter age</label>

            <input
              name="age"
              type="number"
              ref={this.ageRef}
              onChange={() => this.setFieldValue(this.ageRef)}
            />
          </div>
        </form>

        <div>
          <h3>User entered</h3>
          First Name: {this.state.firstname}
          <br />
          Last Name: {this.state.lastname}
          <br />
          Age: {this.state.age}
        </div>
      </div>
    );
  }
}

export default AddUser5;
