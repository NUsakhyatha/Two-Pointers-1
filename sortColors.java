public class sortColors {

    public void sortColors(int[] nums) {

        int mid=0;int l=0;
        int r= nums.length-1;

        while(mid<=r)
        {
            if( nums[mid]==2)
            {
                swap(nums,mid,r);
                r--;

            }
            else if(nums[mid]==0)
            {
                swap(nums,l,mid);
                l++;mid++;
            }
            else
            {
                mid++;
            }
        }

    }

    public void  swap(int[] arr,int a, int b)
    {
        if(a==b) return;
        int temp;
        temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}

//O(1) = space complexity
// O(n)