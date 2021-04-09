import { Component } from 'react';
import AddEmployee from './AddEmployee';

class DisplayEmployees extends Component {

    constructor(props) {
        super(props);
        this.state = { employees: [] };
    }

    addEmployee=(emp)=> {
        this.setState({employees:[...this.state.employees, emp]});

/*
      this.setState(prevState => {
        let newEmployees=[...this.state.employees,emp];
        return {employees:newEmployees };
      });

      */

    }

    render() {
        return (
            <div>

                <AddEmployee addHandler={this.addEmployee} />

                <ul>
                    {this.state.employees.map(emp => <li key={emp.empName}>{emp.empName} {emp.age}</li>)}
                </ul>

            </div>
        );

    }

}

export default DisplayEmployees;