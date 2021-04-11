import { Component } from 'react';

class DisplayStudentDetails extends Component {

    constructor(props) {
        super(props);
    }

    render() {
        const student = this.props.student;

        return (
            <div>

   id is {student.id}
    <br/>
   name is  {student.name} 
     <br/>
   course id is  {student.courseId}
     <br/>
    course name is  {student.courseName}
        

            </div>
        )

    }


}

export default DisplayStudentDetails;