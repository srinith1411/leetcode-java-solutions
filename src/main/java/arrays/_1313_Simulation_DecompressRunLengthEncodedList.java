import java.util.*;

public class _1313_Simulation_DecompressRunLengthEncodedList {

    public static int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> a=new ArrayList<Integer>();

        for(int i=0;i<nums.length;i+=2){

            for(int j=1;j<=nums[i];j++){

                a.add(nums[i+1]);
            }
        }

        int res[]=new int[a.size()];
        int k=0;

        for(int i:a){

            res[k++]=i;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size:");
        int n=sc.nextInt();

        int nums[]=new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int res[]=decompressRLElist(nums);

        System.out.println("Decompressed array:");

        for(int i:res){
            System.out.print(i+" ");
        }
    }
}