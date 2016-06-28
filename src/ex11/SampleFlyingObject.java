package ex11;

public class SampleFlyingObject {
    public static void main(String[] args) {
        FlyingObject aPlane, aBird;

        aPlane = new Boeing787();
        aBird = new Swallow();

        aPlane.fly();
        aBird.fly();
//        aBird.pick(); // この行を付け加えるとエラーになる
    }
}