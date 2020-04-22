package factory.chouxiang;

public class EmailProduceFactory implements Produce {
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
