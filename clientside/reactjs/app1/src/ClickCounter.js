import { Component } from 'react';
import React from 'react';


class ClickCounter extends Component {
    
    constructor(props){
        super(props);
        this.state={counter:0};// initial state
    }    


    increment() {
  
     // this.setState({counter:this.state.counter+1}); //state update
      this.setState(previousState=>{
       let obj={  counter: previousState.counter+1       }   ;
       return obj;

      } )
    }

    render() {
        return (
            <div>
                Counter is {this.state.counter}
                <br />
                <button onClick={() => this.increment()}> Increment </button>

            </div>
        );
    }


}


export default ClickCounter;