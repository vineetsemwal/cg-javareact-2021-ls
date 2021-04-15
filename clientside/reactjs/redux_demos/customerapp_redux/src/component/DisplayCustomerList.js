import { useEffect, useState } from "react";
import { fetchAll } from "../service/CustomerService";
import DisplayCustomerDetails from "./DisplayCustomerDetails";
import commonStyle from './commonStyle.module.css';
import { Link } from 'react-router-dom';

export default function DisplayCustomerList({ customers }) {

    console.log("inside Display customer lsit", customers);
    return (
        <div>

            <ul>

                {
                    customers.map((customer) => <li key={customer.id}>

                       <Link to={`/customerdetails/${customer.id}`} >
                       <span>{customer.id} {customer.name} </span>
                       
                       </Link>

                    </li>)
                }
            </ul>


        </div>

    )

}