public class Test_1 {

    public static void main(String[] args) {

    int a [] = new int[100];

    for (int i = 0; i < a.length; i++){
        System.out.println(a[i]);
    }

    for (int y: a){
        System.out.println("Тест прошёл успешно "  + y);
    }

    }
}
