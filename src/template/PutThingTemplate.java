package template;

/**
 * 模拟放东西
 */
public abstract class PutThingTemplate {

    protected abstract void open();

    protected abstract void release();

    protected abstract void close();

    public void put(){
        open();
        release();
        close();
    }
}
