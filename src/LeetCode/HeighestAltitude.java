package LeetCode;

public class HeighestAltitude {
    public static int largestAltitude(int[] gain){
        int currentAlt=0;
        int maxAlt=0;
        for(int i=0;i < gain.length;i++){
            currentAlt+=gain[i];
            if(currentAlt > maxAlt){
                maxAlt=currentAlt;
            }
        }
        return maxAlt;
    }

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for(int i=0;i < arr.length;i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void printResult(int large){
        System.out.println("Largest Altitude: " + large);
    }

    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        int[] gain2={-4,-3,-2,-1,4,3,2};

        printArray(gain);
        printResult(largestAltitude(gain));
        System.out.println();

        printArray(gain2);
        printResult(largestAltitude(gain2));
    }
}
