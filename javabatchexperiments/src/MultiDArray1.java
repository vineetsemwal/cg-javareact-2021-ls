
public class MultiDArray1 {

    public static void  main(String args[]){
      int array[][]=new int[3][2];
        MultiDArray1 program=new MultiDArray1();
      program.populate(array);
      program.display(array);

    }

    void populate(int array[][]){
        for(int row=0; row<3; row++){
            for (int column=0;column<2;column++){
                array[row][column]=column*10;
            }
        }
    }

    void display(int array[][]){
        for(int row=0; row<3; row++){
            System.out.println();
            for (int column=0;column<2;column++){
               int element= array[row][column];
            System.out.print(element+"  ");
            }
        }
    }




}
