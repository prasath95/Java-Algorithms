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

       // find  minimum number in the list -1
      //  findMin(5,2,3,1,6,7,9);

        // find first recursive character -2.1
        //findFirstReq("fdasdfdsa");

        //find last recursive character -2.2
       // findLastReq("aajksdfdszaa");



        /*
        * find specific number from array using binary tree algorithm
        *
        * */
//        int[] arr={1,4,10,3,20,5,11,6};
//
//        BinaryTree binaryTree=new BinaryTree();
//
//        int num=binaryTree.find(arr,0,arr.length,10);
//
//        System.out.println("position == "+num);


        /*
        * find minimum number from list
        *
        * */
//       FindMaximumNumber findMaximumNumber=new FindMaximumNumber();
//       int minNum=findMaximumNumber.findMin(122,34,54,2,87,9,634);
//       System.out.println("Minimum number is == "+minNum);

        int[] arr={1,4,3,2,5,65,6,7,89};

        FindMaximumNumber findMaximumNumber=new FindMaximumNumber();
       // int output=findMaximumNumber.findMax(arr);
       // System.out.println("output "+output);

        ///
        int output2=findMaximumNumber.findMin(arr);
        System.out.println("output "+output2);


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
