package machine;

class CheckResult {
    private static final CheckResult positiveResult = new CheckResult();

    private final boolean enoughResources;
    private final String message;

    /** Creates a positive result. */
    private CheckResult() {
        enoughResources = true;
        message = "I have enough resources, making you a coffee!";
    }

    /** Creates a negative result with a specified message. */
    private CheckResult(String message) {
        this.enoughResources = false;
        this.message = message;
    }

    public static CheckResult positive() {
        return positiveResult;
    }

    public static CheckResult negative(String formatMessage, String resourceName) {
        return new CheckResult(String.format(formatMessage, resourceName));
    }

    public boolean hasEnoughResources() {
        return enoughResources;
    }

    public String getMessage() {
        return message;
    }
}

