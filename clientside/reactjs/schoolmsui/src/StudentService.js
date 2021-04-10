import axios from 'axios';


export default class StudentService {

    baseUrl="http://localhost:8585";

    fetchStudent(id){
      let url=this.baseUrl+"/students/byid/"+id ; 
      let promise=axios.get(url);
       return promise;
    }


}

