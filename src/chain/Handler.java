package chain;

public abstract class Handler {

    /**0
     * A:0~1
     * B:1~3
     * C:3~7
     * D:>7
     */
    protected final double ONE_DAY = 1;
    protected final double THREE_DAY = 3;
    protected final double SEVEN_DAY = 7;

    private String title;

    /**
     * 处理范围
     */
    private double min_day = 0;
    private double max_day = 0;

    private Handler nextHandler;


    public Handler(double min_day, double max_day, String title) {
        this.min_day = min_day;
        this.max_day = max_day;
        this.title = title;
    }


    public final void submit(ILevel level){

        double days = level.getDays();

        if(days < 0d){
            throw new IllegalArgumentException("请假天数不能小于0");
        }

        if(0 == days){
            return;
        }

        if(days >= min_day && days < max_day){
            System.out.println(level.toString());
            System.out.println(title+"审批通过");
        }else if(days >= max_day){
            if (hasNextHandler()) {
                getNextHandler().submit(level);
            }else {
                System.out.println("你的请假天数我们无法提交审批到个人");
            }
        }else {
            System.out.println(title+"的审批天数:"+min_day+"大于你的请假天数:"+days+"你可能只需要说一声就行,不需要请假");
        }
    }

    protected abstract boolean hasNextHandler();


    public double getMin_day() {
        return min_day;
    }

    public void setMin_day(double min_day) {
        this.min_day = min_day;
    }

    public double getMax_day() {
        return max_day;
    }

    public void setMax_day(double max_day) {
        this.max_day = max_day;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
