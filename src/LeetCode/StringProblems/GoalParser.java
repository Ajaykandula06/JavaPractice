    package LeetCode.StringProblems;

    public class GoalParser {
        public String interpret(String command){
            command = command.replace("()","o");
            command = command.replace("(al)","al");
            return command;
        }

        public static void printResult(String command){
            System.out.println("Input String: " + command);
            GoalParser obj=new GoalParser();
            System.out.println("Output String: " + obj.interpret(command));
            System.out.println();
        }

        public static void main(String[] args) {
            String command = "G()(al)";
            String command2="G()()()()(al)";
            String command3="(al)G(al)()()G";

            printResult(command);
            printResult(command2);
            printResult(command3);
        }
    }
