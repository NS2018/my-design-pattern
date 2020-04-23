package state;

public class Audit extends FlowState {


    @Override
    void audit() {
        System.out.println("审核中");
    }

    @Override
    void pass() {
        super.context.setFlowState(Context.pass);
        super.context.getFlowState().pass();
    }

    @Override
    void noPass() {
        super.context.setFlowState(Context.noPass);
        super.context.getFlowState().noPass();
    }
}
