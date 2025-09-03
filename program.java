public class program{
    public static void main(String[]args){
        int arr[]= {2, 1, 5, 1, 3, 2};
        int k=3;
        int maxsum=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
    }