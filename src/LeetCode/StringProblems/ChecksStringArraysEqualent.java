package LeetCode.StringProblems;

public class ChecksStringArraysEqualent {
    public boolean arrayStringsAreEqual(String[] word1,String[] word2){
        return String.join("",word1).equals(String.join("",word2));
    }

    public static void printArray(String[] arr){
        System.out.print("Array: ");
        System.out.print("{");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("} ");
        System.out.println();
    }


    public static void printResult(String[] word1,String[] word2){
        System.out.print("First ");
        printArray(word1);
        System.out.print("Second ");
        printArray(word2);
        ChecksStringArraysEqualent obj=new ChecksStringArraysEqualent();
        if(obj.arrayStringsAreEqual(word1,word2)){
            System.out.println("Given 2 Arrays are Equal");
        }else{
            System.out.println("Given 2 Arrays are notEqual");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
       String[] word3 = {"a", "cb"}, word4 = {"ab", "c"};
       String[]  word5  = {"abc", "d", "defg"}, word6 = {"abcddefg"};

       printResult(word1,word2);
       printResult(word3,word4);
       printResult(word5,word6);
    }
}
