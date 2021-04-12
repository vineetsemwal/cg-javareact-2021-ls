
export default function DisplayStudentDetails({ student }) {


    return (

        <div>

            id is {student.id}
            <br />
name is {student.name}
            <br />
score is {student.score}
            <br />
course id id {student.courseId}
            <br />
course name is {student.courseName}
        </div>

    );

}