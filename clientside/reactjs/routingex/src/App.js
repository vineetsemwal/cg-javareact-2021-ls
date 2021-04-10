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


        <Switch>

          <Route path="/" exact component={Home} />

          <Route path="/about" exact component={About} />         
      

          <Route path="/contact" exact component={Contact} />
        </Switch>

      </Router>

    </div>
  );
}

export default App;
