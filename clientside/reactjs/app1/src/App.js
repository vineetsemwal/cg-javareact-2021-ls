import logo from './logo.svg';
import './App.css';
import Welcome from './Welcome';
import WelcomeClass from './WelcomeClass';
import DisplayUser from './DisplayUser';
import DisplayUsers from './DisplayUsers';
import ClickCounter from './ClickCounter';
import AddUser1 from './AddUser1';
import AddUser2 from './AddUser2';
import AddUser3 from './AddUser3';
import AddUser4 from './AddUser4';
import AddUser5 from './AddUser5';
import UsersTabular from './UsersTabular';
import DisplayFruits from './DisplayFruits';
import RefExample from './RefExample';
import AddEmployee from './AddEmployee';
import DisplayEmployees from './DisplayEmployees';
import SimplePureComponent from './SimplePureComponent';
import DisplayEven from './DisplayEven';
import ErrorBoundary from './ErrorBoundary';
import ClickCounterFun from './ClickCounterFun';
import FormHandlingFun from './FormHandlingFun';
import StyleEx1 from './StyleEx1';
import DisplayNumber from './DisplayNumber';
import StyleEx2 from './StyleEx2';
import StyleEx3 from './StyleEx3';

function App() {
  let user1 = { id: 1, name: 'mohan', age: 21 };
  let user2 = { id: 2, name: 'ajay', age: 21 };
  let user3 = { id: 3, name: 'rohit', age: 21 };

  let users = [user1, user2, user3];

  return (
    <div>
      {/* <DisplayUsers users={users} />*/}

      {/* <ClickCounter/> */}

      {/*<AddUser5/>*/}

      { /*  <UsersTabular users={users}  /> */}


      {/*<DisplayFruits/>*/}

       <StyleEx3 />   
  




    </div>

  );

}

export default App;
