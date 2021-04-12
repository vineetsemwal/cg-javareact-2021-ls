import axios from 'axios';

const baseUrl = 'http://localhost:8585';

function fetchStudent(id) {
  const url = baseUrl + "/students/byid/" + id;
  const promise = axios.get(url);
  return promise;
}


function addStudent(data) { // data is {studentName:'jatin', studScore:90}
  const url = baseUrl + "/students/add";
  const requestData = { name: data.sname, score: data.score };
  const promise = axios.post(url, requestData);
  return promise;
}

export { fetchStudent, addStudent };