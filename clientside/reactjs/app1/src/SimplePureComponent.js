import {PureComponent} from 'react';

 class SimplePureComponent extends PureComponent {


    render(){
       return (
           <div>
             <h3> Simple Pure component whose ui will be rerendered only when there is change in state/props</h3>  
           </div>
       ) 
    }

 }

 export default SimplePureComponent;
