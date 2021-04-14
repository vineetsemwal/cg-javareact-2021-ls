import React, { useState } from "react";
import DisplayCustomerDetails from "./DisplayCustomerDetails";
import commonStyle from "./commonStyle.module.css";
import { addCustomer } from "../service/CustomerService";
import validationMessage from '../validationMessage';

export default function AddCustomer() {
  /*
    let mockCustomer={
        id:10,
        name: 'shiv',
        age:21,
        address: 'chennai'
      };
*/
  const nameRef = React.createRef();
  const ageRef = React.createRef();
  const addressRef = React.createRef();
  const initialState = {
    name: undefined,
    age: undefined,
    address: undefined,
    customer: undefined,
    errMsg: undefined,
    validations: { age: undefined, name: undefined },
  };
  const [currentState, setNewState] = useState(initialState);

  const submitHandler = (event) => {
    event.preventDefault();
    if (currentState.validations.name || currentState.validations.age) {
      return;
    }

    let data = { ...currentState };
    const promise = addCustomer(data);
    promise
      .then((response) =>
        setNewState({ ...currentState, customer: response.data })
      )
      .catch((error) =>
        setNewState({ ...currentState, errMsg: error.message })
      );
  };

  const setFieldState = (ref) => {
    const fieldName = ref.current.name;
    const fieldValue = ref.current.value;
    let validationMsg;
    if (ref === ageRef) {
      validationMsg = validateAge(fieldValue);
    }

    if (ref === nameRef) {
      validationMsg = validateName(fieldValue);
    }

    const newValidations = { ...currentState.validations, [fieldName]: validationMsg };
    const newState = {
      ...currentState,
      [fieldName]: fieldValue,
      customer: undefined,
      errMsg: undefined,
      validations: newValidations
    };

    setNewState(newState);
   
  };


/**
 *  validating name is atleast 2 letters long
 */
  const validateName = (name) => {
    if (name.length < 2) {
      return validationMessage.nameSmallthanLengthTwo;
    }
    return undefined;
  }



  /**
   * validating age is +ve
   */
  const validateAge = (age) => {
    if (age < 0) {
      return validationMessage.ageSmallThanZero;
    }

    if (age > 120) {
      return validationMessage.ageGreaterThan120;
    }

    return undefined;
  };

  return (
    <div>
      <h1>Add Customer </h1>

      <form onSubmit={submitHandler} className={commonStyle.content}>
        <div className="form-group">
          <label>Enter name</label>
          <input
            name="name"
            type="text"
            ref={nameRef}
            onChange={() => setFieldState(nameRef)}
            className="form-control"
            required
          />

          {currentState.validations.name ? (
            <div className={commonStyle.error}>
              {currentState.validations.name}
            </div>
          ) : (
            ""
          )}
        </div>

        <div className="form-group">
          <label>Enter age</label>
          <input
            name="age"
            type="number"
            ref={ageRef}
            onChange={() => setFieldState(ageRef)}
            className="form-control"
            required
          />
          {currentState.validations.age ? (
            <div className={commonStyle.error}>
              <span>{currentState.validations.age} </span>
            </div>
          ) : (
            ""
          )}
        </div>

        <div className="form-group">
          <label>Enter address</label>
          <input
            name="address"
            type="text"
            ref={addressRef}
            onChange={() => setFieldState(addressRef)}
            className="form-control"
            required
          />
        </div>

        <button className="btn btn-primary">Add Customer </button>
      </form>

      {currentState.customer ? (
        <div>
          <h3>Customer Added</h3>
          <DisplayCustomerDetails customer={currentState.customer} />
        </div>
      ) : (
        ""
      )}

      {currentState.errMsg ? (
        <div className={commonStyle.error}>
          Request proccessing was not successful
          <br />
          {currentState.errMsg}
        </div>
      ) : (
        ""
      )}
    </div>
  );
}
