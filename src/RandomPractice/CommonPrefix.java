package RandomPractice;

public class CommonPrefix {
    public String common(String[] arr){
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            while(!arr[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())return "";
            }
        }
        return prefix;
    }

    public static void printArray(String[] arr){
        System.out.print("Array: ");
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(String[] arr){
        System.out.print("Input ");
        printArray(arr);
        CommonPrefix obj=new CommonPrefix();
        System.out.println("Output: " + obj.common(arr));
        System.out.println();

    }

    public static void main(String[] args){
    String[] arr={"flower","flow","flight"};

    printResult(arr);
    }
}
