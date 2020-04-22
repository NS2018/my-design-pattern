package factory.simple.sencond;

import factory.simple.Sender;

public class Test {

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produceEmail();
        sender.send();
    }
}
