public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor =
                new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));
        logProcessor.log(logProcessor.ERROR, "called");
    }
}