package factory.simple;

public class Test {

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender email = senderFactory.produce("email");
        email.send();
    }
}
