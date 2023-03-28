package TestUyra;
@Deprecated
public class Car implements Auto {
    String name;
    int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
