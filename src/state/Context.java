package state;

public class Context {

    private FlowState flowState;
    protected static final Audit audit = new Audit();
    protected static final Pass pass = new Pass();
    protected static final NoPass noPass = new NoPass();

    public Context(FlowState flowState) {
        setFlowState(flowState);
    }

    public FlowState getFlowState() {
        return flowState;
    }

    public void setFlowState(FlowState flowState) {
        this.flowState = flowState;
        this.flowState.setContext(this);
    }

    void audit(){
        this.getFlowState().audit();
    }

    void pass(){
        this.getFlowState().pass();
    }

    void noPass(){
        this.getFlowState().noPass();
    }
}
