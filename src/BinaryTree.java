public class BinaryTree {

    //s - searching element
    public int find(int[] myarray,int l,int r, int s)
    {

        int m=(l+r)/2;

        if(s==myarray[m])
        {
            return m;
        }
        else if(s<myarray[m])
        {
            return find(myarray,l,m-1,s);
        }
        else if(s>myarray[m]){
            return find(myarray,r,m+1,s);
        }
        else {
            return -1;
        }
    }
}
