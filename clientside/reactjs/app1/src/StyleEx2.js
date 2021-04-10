import style1 from './style1.module.css'
import  style2 from  './style2.module.css'

export default function StyleEx2() {


    return (
        <div>


            <div className={style1.box+" " +style1.boxfont}>
                Our box 1, using 2 css classes from style1
            </div>



            <div className={style2.box+" "+style1.boxfont}>
                Our box 2, using 2 css class , one from style 1 , one from style2
            </div>


        </div>

    );


}