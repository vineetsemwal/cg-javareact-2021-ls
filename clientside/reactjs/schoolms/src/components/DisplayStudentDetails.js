
/*

    private int id;
    private String name;
    private int score;
    private int courseId;
    private String courseName;
*/
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