package calculator;

public class MultiDArray2 {
    public static void main(String[] args){
        int array2D[][]=new int[2][];
        int row0[]={1,2,3,4,5,6,7};
        int row1[]={10,11,12};
        array2D[0]=row0;
        array2D[1]=row1;
        for (int row=0;row<array2D.length;row++){
            System.out.println();
            int columnArray[]=array2D[row];
            for(int col=0;col<columnArray.length;col++){
                System.out.print(columnArray[col]+"  ");
            }
        }
    }
}
