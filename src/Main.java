/*
*  #### BASIC ALGORITHMS IN JAVA  ####
*
* find a minimum number in the list -1
*
*
* */

public class Main {
    // find first recursive character -2.1
    static int count;

    public static void main(String[] args) {

        int[] arr={1,4,3,2,5,65,6,7,89};

        //FindMaxMin findMaximumNumber=new FindMaxMin();
       // int output=findMaximumNumber.findMax(arr);
       // System.out.println("output "+output);

        //
        // int output2=findMaximumNumber.findMin(arr);
       // System.out.println("output "+output2);

        //
       // findMaximumNumber.findMaxAndMin(arr);

        BubbleSort.bubbleSort(arr);


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
}
