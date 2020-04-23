package state;

public class Pass extends FlowState {
    @Override
    void audit() {
        super.context.setFlowState(Context.audit);
        super.context.getFlowState().audit();
    }

    @Override
    void pass() {
        System.out.println("通过");
    }

    @Override
    void noPass() {
        super.context.setFlowState(Context.noPass);
        super.context.getFlowState().noPass();
    }
}
