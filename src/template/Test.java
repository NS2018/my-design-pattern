package template;

public class Test {

    public static void main(String[] args) {
        PutThingTemplate putIntoBottle = new PutIntoBottle();
        PutThingTemplate putIntoIceBox = new PutIntoIceBox();
        putIntoBottle.put();
        putIntoIceBox.put();
    }
}
