package LeetCode.StringProblems;

public class DefangingIPaddress {
    public String dafangIPaddr(String address){
        address=address.replace(".","[.]");
        return address;
    }

    public static void printResult(String address){
        System.out.println("Input String: " + address);
        DefangingIPaddress obj=new DefangingIPaddress();
        System.out.println("Output String: " + obj.dafangIPaddr(address));
        System.out.println();
    }

    public static void main(String[] args) {
        String address="1.1.1.1";
        String address2="255.100.50.0";

        printResult(address);
        printResult(address2);
    }
}
