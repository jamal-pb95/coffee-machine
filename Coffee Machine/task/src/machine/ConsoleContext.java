package machine;


import java.io.InputStream;
import java.io.PrintStream;

class ConsoleContext {
    private final PrintStream out;
    private final InputStream in;

    public ConsoleContext(PrintStream out, InputStream in) {
        this.out = out;
        this.in = in;
    }

    public PrintStream getOut() {
        return out;
    }

    public InputStream getIn() {
        return in;
    }
}
