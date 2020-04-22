package chain;

public class A extends Handler {

    public A() {
        super(0.5, 1, "部门经理");
    }

    @Override
    protected boolean hasNextHandler() {
        return true;
    }
}
