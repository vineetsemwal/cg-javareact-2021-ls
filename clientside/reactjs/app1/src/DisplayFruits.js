import { Component } from "react";
import AddFruit from "./AddFruit";

class DisplayFruits extends Component {

    constructor(props) {
        super(props);
        this.state = { fruits: [] };// initial state
        // this.addFruit=this.addFruit.bind(this);
    }

    addFruit = (fruitName) => {
        let fruits = this.state.fruits;
        fruits.push(fruitName);
        this.setState({ fruits: fruits });
    }

    render() {
        return (
            <div>
                <h3>Added Fruits</h3>

                <AddFruit parentHandler={this.addFruit} />

                <ul>
                    {this.state.fruits.map(fruit => <li key={fruit}>   {fruit}  </li>)}
                </ul>
            </div>
        );
    }
}

export default DisplayFruits;
