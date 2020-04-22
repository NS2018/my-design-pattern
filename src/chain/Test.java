package chain;

public class Test {

    public static void main(String[] args) {
        Handler a = new A();
        Handler b = new B();
        Handler c = new C();
        Handler d = new D();

        a.setNextHandler(b);
        b.setNextHandler(c);
        c.setNextHandler(d);

        ILevel level = new LeaveInfo("员工1",2.5d,"病假");
        ILevel level2 = new LeaveInfo("员工2",0.5d,"病假");
        ILevel level3 = new LeaveInfo("员工3",7.5d,"病假");
        ILevel level4 = new LeaveInfo("员工4",5.5d,"病假");
        ILevel level5 = new LeaveInfo("员工5",-5.5d,"病假");
        ILevel level6 = new LeaveInfo("员工6",60d,"病假");

        a.submit(level);
        a.submit(level2);
        a.submit(level3);
        a.submit(level4);
        a.submit(level6);
        a.submit(level5);
    }
}
