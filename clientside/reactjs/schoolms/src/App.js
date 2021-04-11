import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Route, Link, Switch } from 'react-router-dom';
import DisplayStudentDetails from './components/DisplayStudentDetails';
import GetStudentDetails from './components/GetStudentDetails';



function App() {
 
  return (
    <div>
     
    <GetStudentDetails /> 
    


    </div>
  );
}

export default App;
