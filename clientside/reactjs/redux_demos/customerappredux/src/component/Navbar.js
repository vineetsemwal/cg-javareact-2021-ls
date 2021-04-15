import { BrowserRouter as Router, Route, Link, Switch } from 'react-router-dom';


export default function Navbar() {

    return (
        <div>


            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                <Link to="/" className="navbar-brand" >
                    Stateful functional demo
                </Link>

                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <div className="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item active">
                            <Link to="/" className="nav-link" >
                                <span>Home </span>
                                <span className="sr-only">(current)</span>

                            </Link>


                        </li>

                        <li className="nav-item">

                            <Link to="/addcustomer" className="nav-link" >
                                <span>Add Customer</span>

                            </Link>
                        </li>




                        <li className="nav-item">

                            <Link to="/all" className="nav-link" >
                                <span>Get All customers</span>
                            </Link>
                        </li>

                        <li className="nav-item">

                            <Link to="/customerdetailsonrequest" className="nav-link" >
                                <span>Get customer details</span>
                            </Link>
                        </li>

                    </ul>

                </div>
            </nav>






        </div>

    )

}