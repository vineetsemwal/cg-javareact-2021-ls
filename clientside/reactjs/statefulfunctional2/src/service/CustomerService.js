import axios from 'axios';


const baseUrl = "http://localhost:8585";

function fetchCustomer(id) {
    const url = baseUrl + "/customers/byid/" + id;
    const promise = axios.get(url);
    return promise;
}

function addCustomer(data) {
    const url = baseUrl + "/customers/add";
    let requestData = {name:data.name, age:data.age, address:data.address };
    console.log("inside addcustomer service, request data",requestData);
    const promise = axios.post(url, requestData);
    return promise;
}

function fetchAll(){
    const url = baseUrl + "/customers";
    const promise = axios.get(url);
    return promise;
}


export { fetchCustomer, addCustomer, fetchAll };