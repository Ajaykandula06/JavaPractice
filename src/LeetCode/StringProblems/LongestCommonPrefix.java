package LeetCode.StringProblems;

public class LongestCommonPrefix {
    public String longestPrefix(String[] strs){
        int min=strs[0].length();
        for(int i=1;i<strs.length;i++){
            min=Math.min(min,strs[i].length());
        }
        if(min==1)return strs[0];

        String common="";
        for(int i=1;i<strs.length;i++){
            common="";
            for(int j=0;j<min;j++){
                if(strs[0].charAt(j)==strs[i].charAt(j)){
                    common += strs[i].charAt(j);
                }else{
                    min=j;
                    break;
                }
            }

        }
        return common;
    }

    public static void printArr(String[] strs){
        System.out.print("Array: ");
        System.out.print("{");
        for(int i=0;i<strs.length;i++){
            System.out.print(strs[i]);
            if(i<strs.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printResult(String[] strs){
        System.out.print("Input ");
        printArr(strs);
        LongestCommonPrefix obj=new LongestCommonPrefix();
        System.out.println("Output String: " + obj.longestPrefix(strs));
        System.out.println();

    }

    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
       String[] strs2 = {"dog","racecar","car"};
       String[] strs3={"aa", "a"};
       String[] strs4={"", "b"};
       String[] strs5={"ab", "a"};
       String[] strs6={"a"};
        String[] strs7 = {"reflower","flow","flight"};

       printResult(strs);
       printResult(strs2);
        printResult(strs3);
        printResult(strs4);
        printResult(strs5);
        printResult(strs6);
        printResult(strs7);
    }
}
