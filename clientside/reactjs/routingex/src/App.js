import logo from './logo.svg';
import './App.css';
import Home from './Home';
import About from './About';
import Contact from './Contact';
import NavLinks from './NavLinks'
import { BrowserRouter as Router, Route, Link, Switch } from 'react-router-dom';



function App() {
  return (
    <div>


      <Router>
        <NavLinks />

        <div className="container" style={ {marginTop:'50px'}}>

          <div className="row">

            <div className="col-md-9">

              <Switch>

                <Route path="/" exact component={Home} />

                <Route path="/about" exact component={About} />


                <Route path="/contact" exact component={Contact} />
              </Switch>
            </div>

            <div className="col-md-3">

              <h3>Ads here</h3>
            </div>
          </div>
        </div>

      </Router>

    </div>
  );
}

export default App;
