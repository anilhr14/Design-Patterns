public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == super.ERROR){
            System.out.println("Error Log Processor " + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
