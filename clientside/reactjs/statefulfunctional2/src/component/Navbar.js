import { BrowserRouter as Router, Route, Link, Switch } from 'react-router-dom';


export default function Navbar() {

    return (
        <div>



            <Link to="/addcustomer" >
                <span>Add Customer</span>

            </Link>
            <br />
            <Link to="/all" >

                <span>Get all customers</span>
            </Link>
            <br />
            <Link to="/customerdetailsonrequest" >

                <span>Get customer details on request</span>
            </Link>
            <br />

            <Link to="/customerdetails/1" >
                <span>Get customer with id 1 </span>
            </Link>

            <br />

            <Link to="/customerdetails/2" >
                <span>Get customer with id 2 </span>
            </Link>

        </div>

    )

}