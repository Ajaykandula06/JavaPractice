package LeetCode.StringProblems;

public class RobotOrigin {
    public boolean judgeCircle(String moves){
        int uCount=0,dCount=0,lCount=0,rCount=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')uCount++;
            else if(moves.charAt(i) == 'D')dCount++;
            else if(moves.charAt(i) == 'L')lCount++;
            else rCount++;
        }
        return uCount==dCount && lCount==rCount;
}

public static void printResult(String moves){
    System.out.println("Moves: " + moves);
    RobotOrigin obj=new RobotOrigin();
    if(obj.judgeCircle(moves)){
        System.out.println("True, the Robot ended up at the Origin");
    }else {
        System.out.println("False, the Robot is not ended upp at the Origin");
    }
    System.out.println();
}

    public static void main(String[] args) {
        String moves = "UD";
        String moves2 = "LL";

        printResult(moves);
        printResult(moves2);
    }
}
