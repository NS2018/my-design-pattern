package factory.simple.third;

import factory.simple.Sender;

public class Test {

    public static void main(String[] args) {
        Sender sender = SenderFactory.produceEmail();
        sender.send();
    }
}
