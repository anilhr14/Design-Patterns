public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == super.INFO){
            System.out.println("Info Log Processor "+ message);
        }
        super.log(logLevel, message);
    }
}
