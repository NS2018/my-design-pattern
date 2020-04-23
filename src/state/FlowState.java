package state;

public abstract class FlowState {

    protected Context context;

    abstract void audit();

    abstract void pass();

    abstract void noPass();

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
