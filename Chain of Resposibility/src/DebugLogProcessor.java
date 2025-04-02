public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == super.DEBUG){
            System.out.println("Debug Log Processor "+message);
        }
        super.log(logLevel, message);
    }
}
