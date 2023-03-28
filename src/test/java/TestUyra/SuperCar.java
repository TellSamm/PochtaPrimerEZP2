package TestUyra;

public class SuperCar extends Car{

    int superSpeed = 100;

    public void setMaxSpeed(int superSpeed){ // это у нас Set-р
        this.superSpeed = superSpeed;
        System.out.println("Максимальная скорость на супер тачке: " + superSpeed * 2);
    }

    public int getSuperSpeed(){ // это у нас Get-р
        return superSpeed;
    }
    @Override
    public int getSpeed(){
        return super.getSpeed() * getSuperSpeed();
    }


}
