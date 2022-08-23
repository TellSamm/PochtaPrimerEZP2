public class Parking {  // публичный класс Parking для работы с парковкой
    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.printFreeParkingPlacesAmount();
        parking.leaveParkingPlace();
        parking.reserveParkingPlace();
        parking.reserveParkingPlace();
        parking.reserveParkingPlace();
    }
    public static final int TOTAL_PARKING_PLACES = 100;
    private int freeParkingPlaces = 100;
    private boolean isFull = false;



    public void printFreeParkingPlacesAmount() {
        System.out.println("Свободных парковочных мест осталось: " + freeParkingPlaces);
    }
    // константа, отвечающая за общее количество парковочных мест
    // всего на парковке 100 свободных мест;
    // эта переменная доступна всем классам

    // если парковка заполнена, значение переменной isFull будет true;
    // если свободные места ещё есть - false
    // метод, который выводит количество свободных мест

    // метод, который резервирует парковочное место
    public void reserveParkingPlace() {
        // если парковка не заполнена, можно забронировать место;
        // иначе нужно вывести сообщение о том, что мест больше нет
        if (!isFull) {
            System.out.println("Забронировано парковочное место");
            freeParkingPlaces--; // уменьшили количество свободных мест
            printFreeParkingPlacesAmount(); // вывели информацию об оставшихся местах
            // если после бронирования не осталось свободных мест,
            // то парковка заполнена: переменная isFull == true
            if (freeParkingPlaces == 0) {
                isFull = true;
            }
        } else {
            System.out.println("Свободных мест нет!");
        }
    }

    // метод, который освобождает парковочное место
    public void leaveParkingPlace() {
        // если свободных мест меньше, чем всего мест на
        // парковке (то есть хотя бы одно место занято),
        // можно освободить место и увеличить количество свободных мест на 1
        if (freeParkingPlaces < TOTAL_PARKING_PLACES) {
            freeParkingPlaces++;
            System.out.println("Автомобиль покинул парковку");
            printFreeParkingPlacesAmount();
            isFull = false;
        } else {
            System.out.println("Парковочных мест не может быть больше "
                    + TOTAL_PARKING_PLACES);
        }
    }
}