

public class VarArgsEx {

    public static void main(String[] args){
        VarArgsEx example=new VarArgsEx();
        example.acceptNumbers(1);
        example.acceptNumbers(1,2);
        example.acceptNumbers(1,2,3);
        example.acceptNumbers(1,2,3,4,5,6,7);
        example.acceptNumbers();
    }

    void acceptNumbers(int...args){
        for(int number:args){
            System.out.println("number ="+number);
        }
    }

}
