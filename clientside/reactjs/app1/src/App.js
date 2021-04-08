import logo from './logo.svg';
import './App.css';
import Welcome from './Welcome';
import WelcomeClass from './WelcomeClass';
import DisplayUser from './DisplayUser';
import DisplayUsers from './DisplayUsers';
import ClickCounter from './ClickCounter';
import AddUser from './AddUser';

function App() {
  let user1 = { id: 1, name: 'mohan', age: 21 };
  let user2 = { id: 2, name: 'ajay', age: 21 };
  let user3 = { id: 3, name: 'rohit', age: 21 };

  let users = [user1, user2, user3];

  return (
    <div>
      {/* <DisplayUsers users={users} />*/}

     { /*<ClickCounter/>*/ }

     <AddUser />

    </div>

  );

}

export default App;
