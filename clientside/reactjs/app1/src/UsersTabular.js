import UserInfoTD from "./UserInfoTD";

function UsersTabular({users}) {
  

  return <table border="1">
    <tbody>
      <tr><th>Id</th> <th>Name</th> <th>Age</th> </tr>
    {
    
    users.map(user=><tr key={user.id}> <UserInfoTD  user={user} /> </tr>)
    
    }
    </tbody>
    </table>;
}


export default UsersTabular;