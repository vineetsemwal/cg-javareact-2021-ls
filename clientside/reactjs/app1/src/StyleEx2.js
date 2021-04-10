import style1 from './style1.module.css'
import  style2 from  './style2.module.css'

export default function StyleEx2() {


    return (
        <div>


            <div className={`${style1.box}  ${style1.boxfont} `}>
                Our box 1, using 2 css class
            </div>



            <div className={style2.box}>
                Our box 2, using 1 css class
            </div>


        </div>

    );


}