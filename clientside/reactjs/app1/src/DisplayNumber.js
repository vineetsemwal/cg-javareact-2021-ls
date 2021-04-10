import "./style1.css";

export default function DisplayNumber({ num }) {
   /** 
    way1
    **/
          return (
      
                <div>
      
                <div className={num %2===0?'even' : 'odd'}>
                     number is {num}
                </div>
      
                </div>
              
              
              );
              
    /*
    way 2
      if (num % 2 == 0) {
        return (<div className="even">number is {num}</div>);
      } else {
        return (<div className="odd">number is {num}</div>);
      }
    */

    /**
     * way 3
     
    let desiredClass = 'odd';
    if (num % 2 == 0) {
        desiredClass = "even";
    }
    return (<div className={desiredClass}>number is {num}</div>);

*/
}
