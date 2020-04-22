package template;

public class PutIntoIceBox extends PutThingTemplate {

    @Override
    protected void open() {
        System.out.println("拉开冰箱");
    }

    @Override
    protected void release() {
        System.out.println("把大象塞进冰箱");
    }

    @Override
    protected void close() {
        System.out.println("关闭冰箱门");
    }
}
