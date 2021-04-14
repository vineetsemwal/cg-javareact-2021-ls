import { useEffect, useState } from "react";
import { fetchAll } from "../service/CustomerService";
import DisplayCustomerDetails from "./DisplayCustomerDetails";
import commonStyle from './commonStyle.module.css';

export default function DisplayCustomerList({ customers }) {

    console.log("inside Display customer lsit", customers);
    return (
        <div>

            <ul>

                {
                    customers.map((customer) => <li key={customer.id}>

                        <DisplayCustomerDetails customer={customer} />

                    </li>)
                }
            </ul>


        </div>

    )

}