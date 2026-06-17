package LeetCode;

public class IdenticalPairs {
    public static int identicalPairs(int[] nums){
        int pairs=0;
        for(int i=0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    pairs+=1;
                }
            }
        }
        return pairs;
    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void printResult(int[] arr){
        printArray(arr);
        int pairs=identicalPairs(arr);
        System.out.println("Identical Pairs in the given Array: " + pairs);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        int[] nums2={1,4,2,5,6,3,9,8};
        int[] nums3={1,1,1,1};

        printResult(nums);
        System.out.println();

        printResult(nums2);
        System.out.println();

        printResult(nums3);


    }
}
