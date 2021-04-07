import logo from './logo.svg';
import './App.css';
import Welcome from './Welcome';
import WelcomeClass from './WelcomeClass';

function App() {
  let msg1="hello raja";
  let msg2="hello mohan";
  let msg3="hello rohit";

  return (
    <div> 
           
      <Welcome msg={msg1} />  
      
      <Welcome msg={msg2} />  

      <Welcome msg={msg3} />  


       <WelcomeClass />
       <WelcomeClass />
       
      </div>

  );

}

export default App;
