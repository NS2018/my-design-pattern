package factory.simple;

public class SenderFactory {

    public Sender produce(String type){
        if("email".equals(type)){
            return new EmailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("please set a right type");
            return null;
        }
    }
}
