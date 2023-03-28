package TestUyra;

public class Moto implements Auto{

    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public String getName() {
        return "Меня звать по всякому!";
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setSpeed(int speed) {

    }
}
