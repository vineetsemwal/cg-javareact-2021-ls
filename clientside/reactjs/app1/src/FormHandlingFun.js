import React, { useState } from "react";

export default function FormHandlingFun() {

    let [form, setForm] = useState({ fullName: '', age: -1, formStatus: '' })

    const fullNameRef = React.createRef();
    const ageRef = React.createRef();

    const setFullName = (prevState) => {
        let fullNameVal = fullNameRef.current.value;
        return { ...prevState, fullName: fullNameVal };
    }

    const setAge = (prevState) => {
        let ageVal = ageRef.current.value;
        return { ...prevState, age: ageVal };
    }

/*
    const submitHandler = (prevState) => {
        return { ...prevState, formStatus: 'Form Submitted Successfully' };
    }
*/

    
        const submitHandler = (event) => {
            event.preventDefault();
            setForm(
                prevState => {
                    return { ...prevState, formStatus: 'Form Submitted Successfully' }
                }
            );
        }
      
    return (

        <div>

            <h1>Form handling state management in functional component</h1>
            <form>
                <label>Full name</label>
                <input name="fullName" type="text" ref={fullNameRef} onChange={() => setForm(setFullName)} />

                <br />

                <label> age</label>
                <input name="age" type="number" ref={ageRef} onChange={() => setForm(setAge)} />

                <br />

                <button onClick={(event)=>submitHandler(event) } >Submit Form</button>


            </form>


       <h3> {form.formStatus}</h3>

       Fullname is {form.fullName} age is {form.age}

        </div>

    );

}
