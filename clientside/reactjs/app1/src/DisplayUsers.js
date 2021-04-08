import DisplayUser from "./DisplayUser";

function DisplayUsers({users}){

return (
<div>
<h3>Users information</h3>

<ul>


{users.map( (user) =>  <li> <DisplayUser user={user} />   </li>  )}


</ul>

</div>

);

}

export default DisplayUsers