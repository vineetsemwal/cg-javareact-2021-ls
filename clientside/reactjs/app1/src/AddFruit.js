import React,{ Component } from 'react';

class AddFruit extends Component {


    fruitRef=React.createRef();



    buttonClicked(event){
       event.preventDefault();
      let fruitName=  this.fruitRef.current.value;
       this.props.parentHandler(fruitName);
    }

    render() {

        return(

        <div>

            <form>

             <input type="text" name="fruit" ref={this.fruitRef} />

             <button onClick={(event)=>this.buttonClicked(event) } > Add Fruit</button>

            </form>

        </div>

        );
    }

}

export default AddFruit;