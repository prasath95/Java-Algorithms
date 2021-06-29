import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
*  #### BASIC ALGORITHMS IN JAVA  ####
*
* find a minimum number in the list -1
*
*
* */

public class Main {
    static int  minNum;

    public static void main(String[] args) {

       // find a minimum number in the list -1

        findMin(5,2,3,1,6,7,9);
    }

    private static void findMin(int i7, int i1, int i2, int i3, int i4, int i5, int i6) {
        List<Integer> list1=new ArrayList<>();
        list1.add(i7);
        list1.add(i1);
        list1.add(i3);
        list1.add(i4);
        list1.add(i5);
        list1.add(i6);

        for(int i=1;i<list1.toArray().length;i++)
        {
            int min=0;
            if(list1.get(i-1) > list1.get(i))
            {
               minNum=min=list1.get(i);
            }
        }

        System.out.println("minimum number is ==== >  "+minNum);


    }
}
