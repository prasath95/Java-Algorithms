import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxMin {

    /*
    * find a max and min using sort
    * */
    void findMaxAndMin(int[] numbers)
    {
        Arrays.sort(numbers);

        System.out.println("maximum is "+numbers[numbers.length-1]);
        System.out.println("minimum is "+numbers[0]);
    }


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
