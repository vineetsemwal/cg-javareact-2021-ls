import logo from './logo.svg';
import './App.css';
import CounterComponent from './component/CounterComponent';
import DisplayCustomerDetails from './component/DisplayCustomerDetails';
import GetCustomerDetails from './component/GetCustomerDetails';
import AddCustomer from './component/AddCustomer';
import DisplayCustomerList from './component/DisplayCustomerList';
import GetAllCustomers from './component/GetAllCustomers';
import { BrowserRouter as Router, Route, Link, Switch } from 'react-router-dom';
import Navbar from './component/Navbar';
import Home from './component/Home';
import GetCustomerDetailsOnRequest from './component/GetCustomerDetailsOnRequest';



function App() {



  return (
    <div>
      <Router>
        <Navbar/>

        <Switch>
          <Route exact path="/" component={Home} />
         <Route exact path="/all" component={GetAllCustomers} />
         <Route exact path="/addcustomer" component={AddCustomer} />
         <Route  exact path="/customerdetails/:id" component={GetCustomerDetails} />
         <Route  exact path="/customerdetailsonrequest" component={GetCustomerDetailsOnRequest} />
      
      </Switch>
      </Router>
    </div>
  );
}

export default App;
