import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
*  #### BASIC ALGORITHMS IN JAVA  ####
*
* find a minimum number in the list -1
*
*
* */

public class Main {

    // find a minimum number in the list -1
    static int  minNum;

    // find first recursive character -2.1
    static int count;

    public static void main(String[] args) {

       // find  minimum number in the list -1
      //  findMin(5,2,3,1,6,7,9);

        // find first recursive character -2.1
        //findFirstReq("fdasdfdsa");

        //find last recursive character -2.2
        findLastReq("aajksdfdszaa");


    }

    private static void findLastReq(String text) {

        char[] letters=text.toCharArray();

        for(int i=letters.length-1;i>0;i--)
        {
           System.out.println("i - "+i);

            int count=1;

            for(int j=letters.length-1;j>=0 ;j--)
            {
                System.out.println("i - "+i+" -- j - "+j);

                if(letters[i]==letters[j])
                {
                    count++;
                    System.out.println(" "+letters[i]);
                    System.out.println("count -- "+count);

                    letters[j]='o';
                }
            }

            if(count > 1 && letters[i] != 'o')
            {
                System.out.println("here - "+letters[i]);
                return;
            }

        }
    }

    // find first recursive character -2.1
    private static void findFirstReq(String text) {

        char[] letters=text.toCharArray();

        for(int i=0;i<letters.length;i++)
        {
            count=1;

            for(int j=i+1;j<letters.length;j++)
            {
                if(letters[i]==letters[j])
                {
                    count++;
                    letters[j]='o';
                }
            }

            //finding all duplicate char
//            if(count>1&& letters[i] != 'o')
//                System.out.println("##### "+letters[i]);

           // find first duplicate element
            if(count>1 && letters[i] != 'o')
            {
                System.out.println(""+letters[i]);
                return;
            }

        }

    }

    // find a minimum number in the list -1 answer
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
