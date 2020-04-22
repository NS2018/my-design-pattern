package factory.chouxiang;

public class Test {

    public static void main(String[] args) {
        Produce produce = new SmsProduceFacroty();
        produce.produce().send();
    }
}
