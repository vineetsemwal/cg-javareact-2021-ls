import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Route, Link, Switch } from 'react-router-dom';
import DisplayStudentDetails from './components/DisplayStudentDetails';
import GetStudentDetails from './components/GetStudentDetails';
import AddStudent from './components/AddStudent';



function App() {
 
  return (
    <div>
     
   {/* <GetStudentDetails /> */} 
    

   {<AddStudent />}

    </div>
  );
}

export default App;
