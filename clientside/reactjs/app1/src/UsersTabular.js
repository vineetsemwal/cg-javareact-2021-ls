import UserInfoTD from "./UserInfoTD";

function UsersTabular({users}) {
  

  return <table border="1">{
    
    users.map(user=><tr key={user.id}> <UserInfoTD  user={user} />  </tr>)
    
    }</table>;
}


export default UsersTabular;