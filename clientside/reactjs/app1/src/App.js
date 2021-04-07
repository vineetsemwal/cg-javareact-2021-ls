import logo from './logo.svg';
import './App.css';
import Welcome from './Welcome';
import WelcomeClass from './WelcomeClass';
import DisplayUser from './DisplayUser';

function App() {
  let msg1="hello raja";
  let msg2="hello mohan";
  let msg3="hello rohit";
  let msg4="hello ajay";
  let msg5="hello yash";
  let user = { id: 1, name: 'mohan', age: 21 };


  return (
    <div> 
     <DisplayUser user={user} />

      </div>

  );

}

export default App;
