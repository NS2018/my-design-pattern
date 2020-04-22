package factory.simple.third;

import factory.simple.EmailSender;
import factory.simple.Sender;
import factory.simple.SmsSender;

public class SenderFactory {

    public static Sender produceEmail(){
        return new EmailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
