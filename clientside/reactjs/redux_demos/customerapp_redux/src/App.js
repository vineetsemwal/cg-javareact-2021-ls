import logo from "./logo.svg";
import "./App.css";
import CounterComponent from "./component/CounterComponent";
import DisplayCustomerDetails from "./component/DisplayCustomerDetails";
import GetCustomerDetails from "./component/GetCustomerDetails";
import AddCustomer from "./component/AddCustomer";
import DisplayCustomerList from "./component/DisplayCustomerList";
import GetAllCustomers from "./component/GetAllCustomers";
import { BrowserRouter as Router, Route, Link, Switch } from "react-router-dom";
import Navbar from "./component/Navbar";
import Home from "./component/Home";
import GetCustomerDetailsOnRequest from "./component/GetCustomerDetailsOnRequest";
import { Provider } from "react-redux";
import store from "./redux/store";

function App() {
  return (
    <div>
      <Provider store={store}>
        <Router>
          <Navbar />
          <div className="container" style={{ marginTop: "50px" }}>
            <div className="row">
              <div className="col-md-9">
                <Switch>
                  <Route exact path="/" component={Home} />
                  <Route exact path="/all" component={GetAllCustomers} />
                  <Route exact path="/addcustomer" component={AddCustomer} />
                  <Route
                    exact
                    path="/customerdetails/:id"
                    component={GetCustomerDetails}
                  />
                  <Route
                    exact
                    path="/customerdetailsonrequest"
                    component={GetCustomerDetailsOnRequest}
                  />
                </Switch>
              </div>
            </div>
          </div>
        </Router>
      </Provider>
    </div>
  );
}

export default App;
