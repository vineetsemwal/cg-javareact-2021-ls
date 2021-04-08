import { Component } from "react";

class AddUser3 extends Component {
  constructor(props) {
    super(props);
    this.state = { firstname: "", lastname: "", age: -1 };
  }


  setFieldValue(event) {
    let field = event.target;
    let fieldName = field.name;
    let fieldVal = field.value;
    this.setState({ ...this.state, [fieldName]: fieldVal });
  }

  render() {
    return (
      <div>
        <h3>Add USer 3</h3>
        <form>
          <div>
            <label>Enter firstname</label>

            <input
              name="firstname"
              type="text"
              onChange={(event) => this.setFieldValue(event)}
            />
          </div>

          <div>
            <label>Enter lastname</label>

            <input
              name="lastname"
              type="text"
              onChange={(event) => this.setFieldValue(event)}
            />
          </div>

          <div>
            <label>Enter age</label>

            <input
              name="age"
              type="number"
              onChange={(event) => this.setFieldValue(event)}
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

export default AddUser3;
