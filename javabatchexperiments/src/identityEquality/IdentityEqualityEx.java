package identityEquality;

import student.beans.Student;

public class IdentityEqualityEx {
    public static void main(String args[]){
      Customer customer1=new Customer("c1","arpit");
      Customer customer2=new Customer("c1","arpit");
      boolean isSame=customer1==customer2;
      System.out.println(isSame);
      boolean isEqual=customer1.equals(customer2);
      System.out.println("equal="+isEqual);
    }
}
