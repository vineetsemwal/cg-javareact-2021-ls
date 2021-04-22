import React, { useState , useEffect} from 'react'
import DisplayCustomerDetails from './DisplayCustomerDetails';
import commonStyle from './commonStyle.module.css';
import { useDispatch, useSelector } from 'react-redux';
import { fetchCustomerById } from '../redux/fetchcustomerbyid/fetchCustomerByIdActions';
import GetCustomerDetailsById from './GetCustomerDetailsById';

/**
 * component that display Customer details, it takes id from parameter passed in Link
 * It uses GetCustomerDetailsById with id as prop  
 */
export default function GetCustomerDetailsByParameter(props) {


    return (
        <div>
        <GetCustomerDetailsById id={props.match.params.id} />
        </div>

    );

}