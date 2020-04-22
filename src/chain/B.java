package chain;

public class B extends Handler {
    public B() {
        super(1, 3, "部门主管");
    }

    @Override
    protected boolean hasNextHandler() {
        return true;
    }
}
