package factory.chouxiang;

public class SmsProduceFacroty implements Produce {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
