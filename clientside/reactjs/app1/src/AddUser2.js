import { Component } from "react";

class AddUser2 extends Component {
  constructor(props) {
    super(props);
    this.state = { firstname: "", lastname: "", age: -1 };
  }

  setFirstName(event) {
    let firstnameVal = event.target.value;
    this.setState({ ...this.state, firstname:firstnameVal   });
  }

  setLastName(event) {
    let lastnameVal = event.target.value;
    this.setState({...this.state, lastname:lastnameVal    });
  }

  setAge(event) {
    let ageVal = event.target.value;
    this.setState({...this.state , age:ageVal});
  }

  render() {
    return (
      <div>
        <h3>Add USer 2</h3>
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

export default AddUser2;
