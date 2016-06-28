package ex11;

public class Boeing787 extends Plane implements FlyingObject {
    @Override
    public void fly() {
        System.out.println("Boeing787が飛びます。");
    }

    @Override
    public void refuel() {
        System.out.println("給油します。");
    }
}
