package machine;


import java.io.PrintStream;
import java.util.Scanner;

class ConsoleUI implements UI {
    private final Scanner in;
    private final PrintStream out;

    public ConsoleUI(ConsoleContext context) {
        in = new Scanner(context.getIn());
        out = context.getOut();
    }

    @Override
    public int readInt(String prompt) {
        println(prompt);
        out.print("> ");
        int n = in.nextInt();
        in.nextLine();
        return n;
    }

    @Override
    public String readString(String prompt) {
        println(prompt);
        out.print("> ");
        return in.nextLine();
    }

    @Override
    public void println(String s) {
        out.println(s);
    }
}

