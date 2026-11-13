package RandomPractice;

public class CommomPrefix {
    public static String common(String[] words) {
        if(words==null || words.length==0)return "";
        String pre=words[0];
        for (int i = 1; i < words.length; i++) {
                while (!words[i].startsWith(pre)) {
                    pre= pre.substring(0,pre.length() - 1);

                    if(pre.isEmpty()){
                        return "";
                    }
                }
        }

        return pre;

    }

    public static void printArray(String[] arr){
        System.out.print("Array: {");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i< arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();

    }

    public static void printresult(String[] arr){
        System.out.print("Input ");
        printArray(arr);
        System.out.print("Output: " + common(arr));
        System.out.println();
    }

    public static void main(String[] args){
        String[] words={"flower", "flow", "flight"};

        printresult(words);
    }
}
