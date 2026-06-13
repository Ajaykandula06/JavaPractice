package Strings;

public class ShortestPath {
    public static void path(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            if(current == 'W'){
                x--;
            }else if(current == 'N'){
                y++;
            }else if(current == 'S'){
                y--;
            }else{
                x++;
            }
        }

        double result=Math.sqrt(y*y + x*x);
        System.out.println("Shortest path is: " + result);

    }

    public static void printString(String str){
        System.out.println("Given Direction: " + str);
    }

    public static void main(String[] args) {
        String direction="WWEEEENESENNN";

       printString(direction);
        path(direction);    }
}
