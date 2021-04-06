
var user1 = {
    name: "arpit",
    age: 21,
    displayUser: function(){
        console.log(this.name+" "+this.age);
    }
};


var user2 = {
    name: "mohan",
    age: 22,
    displayUser: function(){
        console.log(this.name+" "+this.age);
    }
}

var users = [];
users.push(user1,user2);

function displayUsers(users) {
    for (var i = 0; i < users.length; i++) {   
       var user=users[i];
       user.displayUser();
    }

}

displayUsers(users);