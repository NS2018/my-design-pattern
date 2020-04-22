package factory.chouxiang;

public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("email send");
    }
}
