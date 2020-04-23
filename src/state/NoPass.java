package state;

public class NoPass extends FlowState {

    @Override
    void audit() {
        super.context.setFlowState(Context.audit);
        super.context.getFlowState().audit();
    }

    @Override
    void pass() {
        super.context.setFlowState(Context.pass);
        super.context.getFlowState().pass();
    }

    @Override
    void noPass() {
        System.out.println("未通过");
    }
}
