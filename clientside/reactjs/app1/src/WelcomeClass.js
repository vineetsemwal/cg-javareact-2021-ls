import { Component } from 'react';
//import React from 'react';

class WelcomeClass extends Component {

 
    render() {
        let {msg, children}=this.props;// let msg=this.props.msg; let children=this.props.children
        return (
            <div>
            {msg}
             <br/>
            {children}
            </div>
        );
    }

}


export default WelcomeClass;