

public class SwitchEx {

    public static void main(String args[]){

        SwitchEx example=new SwitchEx();
        example.choose("seven");

    }

    public void choose(String choice){
        switch(choice){
            case "one":{
                System.out.println("you have chosen one");
                break;
            }

            case "two": {
                System.out.println("you have chosen two");
                break;
            }

            default:{
                System.out.println("please choose option one or two");
            }
        }
    }

}
