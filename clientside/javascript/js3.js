
var user1 = {
    name: "arpit",
    age: 21
};


var user2 = {
    name: "mohan",
    age: 22
}

var users = [];
users.push(user1,user2);

function displayUsers(users) {
    for (var i = 0; i < users.length; i++) {   
       var user=users[i];
       console.log(user.name+" "+user.age);
    }

}

displayUsers(users);