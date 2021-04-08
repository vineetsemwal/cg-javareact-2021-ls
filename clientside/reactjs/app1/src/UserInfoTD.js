import React from 'react';

function UserInfoTD({ user }) {
  return (
    <>
      <td>{user.id}</td>

      <td>{user.name}</td>

      <td>{user.age}</td>
    </>
  );
}

export default UserInfoTD;
