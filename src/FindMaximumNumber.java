import java.util.ArrayList;
import java.util.List;

public class FindMaximumNumber {
    // find a minimum number in the list -1 answer

//      int findMin(int i7, int i1, int i2, int i3, int i4, int i5, int i6) {
//
//        List<Integer> list1=new ArrayList<>();
//        list1.add(i7);
//        list1.add(i1);
//        list1.add(i2);
//        list1.add(i3);
//        list1.add(i4);
//        list1.add(i5);
//        list1.add(i6);
//
//       ///   int[] list1={i1,i2,i3,i4,i5,i6,i7};
//
//        int max=0;
//
//        for(Integer i:list1)
//        {
//
//            if( max < i)
//            {
//                max=i;
//                System.out.println("maximum number from list is -"+max);
//            }
//
//        }
//
//        return max;
//
//    }

    /*
    * find maximum number
    * */
    int findMax(int[] numbers){

        int maxVal=numbers[0];

        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i]>maxVal)
            {
                maxVal=numbers[i];
            }
        }

        return maxVal;
    }

    /*
    * find minimum number
    * */
    int findMin(int[] numbers)
    {
        int minVal=numbers[0];

        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i]<minVal)
            {
                minVal=numbers[i];
            }
        }

        return minVal;
    }

}
