package LeetCode.StringProblems;

public class LongPressed {
    public boolean isLongPressedName(String name,String typed) {
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
            while(j < typed.length()){
                if(j==0||typed.charAt(j)!=typed.charAt(j-1)){
                    return false;
                }
                j++;
            }


        return i==name.length();
    }


    public static void printResult(String name,String typed){
        System.out.println("Name: "+name);
        System.out.println("Typed: "+typed);
        LongPressed obj=new LongPressed();
        if(obj.isLongPressedName(name,typed)){
            System.out.println(obj.isLongPressedName(name,typed)+", it can be a name");
        }else {
            System.out.println(obj.isLongPressedName(name,typed)+", it can not be a name");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String name="alex";
        String typed="aaleex";

        String name2="saeed";
        String typed2="ssaaedd";

        printResult(name,typed);
        printResult(name2,typed2);
    }
}
