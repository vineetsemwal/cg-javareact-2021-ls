import { Component } from 'react';
import React from 'react';


class ClickCounter extends Component {

    constructor(props) {
        super(props);
        this.state = { counter: 0 };// initial state
        console.log("inside constructor");
    }



    increment() {
        console.log("isnide increment handler");
        // this.setState({counter:this.state.counter+1}); //state update
        this.setState(previousState => {
            let obj = { counter: previousState.counter+1 };
            return obj;

        })
    }

    static getDerivedStateFromProps(props, state) {
        console.log("inside getdrived state from props");
        return state;

    }


    componentDidMount() {
        console.log("inside component did mount");
    }

    shouldComponentUpdate(nextProps, nextState) {
        console.log("inside shoud component update");
        console.log("counter value="+nextState.counter);
         //return true;        
        return ( nextProps!==this.props || (nextState.counter!==this.state.counter));
        
    }

    componentDidUpdate() {
        console.log("inside componentDidUpdate");
    }

    render() {
        console.log("inside render");
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