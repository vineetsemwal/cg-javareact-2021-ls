import { Component } from 'react';
//import React from 'react';

class WelcomeClass extends Component {

 
    render() {
        let {msg}=this.props;// let msg=this.pops.msg;
        return (
            <div>
            {msg}
            </div>
        );
    }

}


export default WelcomeClass;