package factory.simple;

public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send email");
    }
}
