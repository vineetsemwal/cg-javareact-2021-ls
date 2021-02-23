package doselect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        ArrayListOps operations=new ArrayListOps();
        ArrayList<Integer>changedList= operations.changeList5(list,20,100);
        System.out.println(changedList);
    }
}

class ArrayListOps {
    public ArrayList<Integer> makeArrayListInt(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(0);
        }
        return list;
    }

    public ArrayList<Integer> reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
        return list;
    }


    public ArrayList<Integer> changeList1(ArrayList<Integer> list, int m, int n) {
        for (int i = 0; i < list.size(); i++) {
            Integer number = list.get(i);
            if (number.intValue() == m) {
                list.set(i, n);
            }
        }
        return list;
    }

    public ArrayList<Integer> changeList2(ArrayList<Integer> list, int m, int n) {
        ArrayList<Integer> converted = new ArrayList<>();
        for (Integer number : list) {
            if (number.intValue() == m) {
                converted.add(n);
            } else {
                converted.add(number);
            }
        }
        return converted;
    }

    public ArrayList<Integer> changeList3(ArrayList<Integer> list, int m, int n) {
        UnaryOperator<Integer> operator = element -> {
            if (element == m) {
                return n;
            }
            return element;
        };
        list.replaceAll(operator);
        return list;
    }


    public ArrayList<Integer> changeList4(ArrayList<Integer> list, int m, int n) {
        UnaryOperator<Integer> operator = element -> {
            if (element == m) {
                return n;
            }
            return element;
        };
        List<Integer> converted = list.stream().map(operator).collect(Collectors.toList());
        ArrayList<Integer> arrayList = new ArrayList<>(converted);
        return arrayList;
    }

    public ArrayList<Integer>changeList5(ArrayList<Integer>list,int m, int n){
        Collections.replaceAll(list,m,n);
        return list;
    }


}
