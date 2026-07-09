package LeetCode.StringProblems;

public class ExcelSheetColumnTitle {
public String convertToTitle(int columnNumber){
   StringBuilder result=new StringBuilder();
   while(columnNumber>0){
       int reminder=columnNumber%26;
       if(reminder==0){
           result.append('Z');
           columnNumber = columnNumber/26-1;
       }else{
           result.append((char)('A'+reminder-1));
           columnNumber = columnNumber/26;
       }
   }
   return result.reverse().toString();
}

public static void printResult(int num){
    System.out.println("Given columnNumber: "+ num);
    ExcelSheetColumnTitle obj=new ExcelSheetColumnTitle();
    String s=obj.convertToTitle(num);
    System.out.println("Converted String: " + s);
    System.out.println();
}

    public static void main(String[] args) {
        int num=701,num2=1 ,num3=26 ,num4=27,num5=28;

        printResult(num);
        printResult(num2);
        printResult(num3);
        printResult(num4);
        printResult(num5);

    }
}
