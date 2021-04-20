import React, { useState } from 'react';

export default function DynamicDropdownEx() {
    const products = [
        { id: 1, name: 'samsung' },
        { id: 2, name: 'motorolla' },
        { id: 3, name: 'apple' },
        { id: 4, name: 'xiaomi' }
    ];

    const productRef = React.createRef();
    const intialState={id:undefined};
    const [currentState,setNewState]  = useState(intialState);

    const setFieldValue = (ref) => {
        const chosenValue = ref.current.value;
        console.log("chosen value=", chosenValue);
        const newState={...currentState,id:chosenValue};
        setNewState(newState);
        
    }
    const style = {margin:'50px'};

    return (

        <div style={style}>

            <form>
                <select name="product" ref={productRef} onChange={()=>setFieldValue(productRef)}>
                    <option disabled selected>select product</option>
                    {products.map(product => <option key={product.id} value={product.id} >{product.name} </option>)}

                </select>

            </form>


            <h3>Chosen Product id is {currentState.id} </h3>
            
        </div>

    );

}