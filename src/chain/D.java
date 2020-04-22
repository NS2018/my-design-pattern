package chain;

public class D extends Handler {
    public D() {
        super(7, 30, "总经理");
    }

    @Override
    protected boolean hasNextHandler() {
        return false;
    }
}
