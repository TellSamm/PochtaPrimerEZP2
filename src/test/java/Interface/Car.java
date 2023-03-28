package Interface;

public class Car implements Transport, InterfaceTest {

    @Override
    public void go() {
        System.out.println("We are driving!");
    }

    @Override
    public void stop() {
        System.out.println("We are stoping!");
    }

    @Override // эти методы мы реализуем (переопределяем) из 2 интерфейса InterfaceTest
    public void method1() {
        System.out.println("Test1");
    }

    @Override // эти методы мы реализуем (переопределяем) из 2 интерфейса InterfaceTest
    public void method2() {
        System.out.println("Test2");
    }
}
