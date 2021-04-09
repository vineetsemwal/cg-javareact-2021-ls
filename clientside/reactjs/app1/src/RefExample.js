import React, { Component } from "react";

class RefExample extends Component {
  fullNameRef = React.createRef();
  ageRef = React.createRef();

  constructor(props){
      super(props);
      const initialStateObj={fullName:'', age:-1, formStatus:''};
      this.state=initialStateObj;
  }

  submitHandler(event){
      console.log("inside submit handler");
      event.preventDefault();
      const newStateObj={...this.state,formStatus:'Form successfully submitted'};
      //this.setState(newStateObj);
      
      let stateFun=(prevState) =>{
        const newStateObj={...prevState,formStatus:'Form successfully submitted'};     
        return newStateObj;
      };

      this.setState(stateFun);
      

  }

  setFullName(){
    const fullNameField=this.fullNameRef.current;
    const fullNameVal=fullNameField.value;   
    const newStateObj=  {...this.state, fullName:fullNameVal};
   this.setState(newStateObj);

  }

  setAge(){
    const ageNameField=this.ageRef.current;
    const ageVal=ageNameField.value;    
    const newStateObj={...this.state, age :ageVal};
    this.setState(newStateObj);

  }


  render() {
      console.log("inside render");
     return  (
     
    <div>
      <form onSubmit={(event)=>this.submitHandler(event) }>
        <label>Full name</label>
        <input name="fullName" type="text" ref={this.fullNameRef} onChange={()=>this.setFullName()} />

        <br />

         <label> age</label>
        <input name="age" type="number" ref={this.ageRef} onChange={()=>this.setAge()} />

        <br/>

        <button >Submit Form</button>


      </form>

      <h2>User Submitted Details</h2>

       <h3>{this.state.formStatus}</h3>
      
       Fullname is {this.state.fullName} age is {this.state.age}

    </div>
      );


  }
}

export default RefExample;
