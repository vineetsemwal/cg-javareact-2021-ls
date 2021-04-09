import { Component } from 'react';

class DisplayEven extends Component {

    render() {
        const num = this.props.num;
        console.log("num="+this.props.num);
        if (num%2!== 0) {
            throw new Error(num+" is not even");
        }
        return (

            <div>
                {num} is even
            </div>
        );
    }

}

export default DisplayEven;