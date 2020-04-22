package chain;

public class C extends Handler {
    public C() {
        super(3, 7, "部门经理");
    }

    @Override
    protected boolean hasNextHandler() {
        return true;
    }
}
