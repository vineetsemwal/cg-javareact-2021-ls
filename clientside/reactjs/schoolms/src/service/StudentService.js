import axios from 'axios';

const baseUrl='http://localhost:8585/';

function fetchStudent(id){
 const url=baseUrl+"/students/byid/"+id;
  const promise=  axios.get(url);
  return promise;
}


export {fetchStudent};