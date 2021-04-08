import React, { Component } from "react";


class AddUser4 extends Component {

   firstnameRef=React.createRef();
   lastnameRef=React.createRef();
   ageRef=React.createRef();

  constructor(props) {
    super(props);
    this.state = { firstname: "", lastname: "", age: -1 };
  }

  setFirstName() {
    const field=this.firstnameRef.current;
    let firstnameVal = field.value;
    this.setState({ ...this.state, firstname:firstnameVal   });
  }

  setLastName() {
    const field=this.lastnameRef.current;
    let lastnameVal = field.value;
    this.setState({...this.state, lastname:lastnameVal    });
  }

  setAge() {
    const field=this.ageRef.current;
    let ageVal = field.value;
    this.setState({...this.state , age:ageVal});
  }

  render() {
    return (
      <div>
        <h3>Add USer 4</h3>
        <form>
          <div>
            <label>Enter firstname</label>

            <input
              name="firstname"
              type="text"
              ref={this.firstnameRef}
              onChange={() => this.setFirstName()}
            />
          </div>

          <div>
            <label>Enter lastname</label>

            <input
              name="lastname"
              type="text"
              ref={this.lastnameRef}
              onChange={() => this.setLastName()}
            />
          </div>

          <div>
            <label>Enter age</label>

            <input
              name="age"
              type="number"
              ref={this.ageRef}
              onChange={() => this.setAge()}
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

export default AddUser4;
