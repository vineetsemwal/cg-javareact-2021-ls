import { Link } from 'react-router-dom';

export default function NavLinks() {

    return (
        <div>

            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                <Link to="/" className="navbar-brand" >
               Routing demo
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

                            <Link to="/about" className="nav-link" >
                                <span>About us</span>

                            </Link>
                        </li>




                        <li className="nav-item">

                            <Link to="/contact" className="nav-link" >
                                <span>Contact us</span>

                            </Link>
                        </li>


                    </ul>

                </div>
            </nav>




        </div>


    );



}