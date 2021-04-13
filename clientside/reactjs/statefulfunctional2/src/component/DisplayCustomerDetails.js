
export default function DisplayCustomerDetails({ customer }) {
    let { id, name, age, address } = customer;

    return (
        <div>
            id is {id}
            <br />
    name is {name}
            <br />
    age is {age}
            <br />
    address is {address}

        </div>
    );


}