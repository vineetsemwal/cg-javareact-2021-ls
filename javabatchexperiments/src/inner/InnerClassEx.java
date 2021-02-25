package inner;


public class InnerClassEx {

    public static void main(String[] args){

        StudentOut student = new StudentOut(23,"hyderabad","madhavpur-23623");
    }

}

class StudentOut{

    int age;
    Address address;

    public StudentOut(int age, String city, String address){
        this.age = age;
        this.address = new Address(city,address);
    }


    class Address{
        String city;
        String address;
        public Address(String city, String address){
          this.city = city;
          this.address = address;

        }

        @Override
        public String toString(){
           return city +address+ age;
        }


    }
}
