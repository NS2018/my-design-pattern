package template;

/**
 * 把水倒入瓶子中
 */
public class PutIntoBottle extends PutThingTemplate {
    @Override
    protected void open() {
        System.out.println("顺时针拧开");
    }

    @Override
    protected void release() {
        System.out.println("把水倒进去");
    }

    @Override
    protected void close() {
        System.out.println("逆时针拧紧");
    }
}
