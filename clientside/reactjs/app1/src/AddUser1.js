import { Component } from "react";

class AddUser1 extends Component {
  constructor(props) {
    super(props);
    this.state = { firstname: "", lastname: "", age: -1 };
  }

  setFirstName(event) {
    let firstnameVal = event.target.value;
    this.setState({
      firstname: firstnameVal,
      lastname: this.state.lastname,
      age: this.state.age,
    });
  }

  setLastName(event) {
    let lastnameVal = event.target.value;
    this.setState({
      firstname: this.state.firstname,
      lastname: lastnameVal,
      age: this.state.age,
    });
  }

  setAge(event) {
    let ageVal = event.target.value;
    this.setState({
      firstname: this.state.firstname,
      lastname: this.state.lastname,
      age: ageVal,
    });
  }

  render() {
    return (
      <div>
        <form>
          <div>
            <label>Enter firstname</label>

            <input
              name="firstname"
              type="text"
              onChange={(event) => this.setFirstName(event)}
            />
          </div>

          <div>
            <label>Enter lastname</label>

            <input
              name="lastname"
              type="text"
              onChange={(event) => this.setLastName(event)}
            />
          </div>

          <div>
            <label>Enter age</label>

            <input
              name="age"
              type="number"
              onChange={(event) => this.setAge(event)}
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

export default AddUser1;
