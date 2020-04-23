package state;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("申请请假");
        Context context = new Context(new Audit());
        context.audit();
        Thread.sleep(1000);
        context.pass();
    }
}
