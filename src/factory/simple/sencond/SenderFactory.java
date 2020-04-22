package factory.simple.sencond;

import factory.simple.EmailSender;
import factory.simple.Sender;
import factory.simple.SmsSender;

public class SenderFactory {

    public Sender produceEmail(){
        return new EmailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
