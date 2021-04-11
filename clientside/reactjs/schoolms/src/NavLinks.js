import { Link } from 'react-router-dom';

export default function NavLinks() {

    return (
        <div>

            <nav>

                <Link to="/">
                    <span>Home </span>

                </Link>

                <br />

                <Link to="/about">
                    <span>About </span>

                </Link>

                <br />
                <Link to="/contact">
                    <span>Contact </span>

                </Link>



            </nav>

        </div>


    );



}