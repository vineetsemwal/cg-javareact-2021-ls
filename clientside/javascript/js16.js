class User{

    name;
    age=21;

    constructor( name, age){
        this.name=name;
        this.age=age;
    }

 
    display(){
        console.log(this.name+" "+this.age);
    }

//
// arrow fucntion in class 
// display=()=>  console.log(this.name+" "+this.age);
//

}



let user= new User("arpit", 21);
user.display();