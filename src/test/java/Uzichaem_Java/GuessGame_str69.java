package Uzichaem_Java;

public class GuessGame_str69 { // GuessGame_str69 содержит три переменных экземпляра для трёх объекто Player
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){ // Создаем три объекта Player и присваиваем их трем переменным экземпляра.
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; // Объявляем три переменных для хранения ответов для каждого игрока
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; //in Right (правильно) перевод.
        boolean p2isRight = false; // Объявляем три переменные для хранения правильности или неправильности
        // (true или false)ответов игроков
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); // создаем число которое игроки должны угадать
        System.out.println("Я загадываю число от 0 до 9 . . .");

        while (true){
            System.out.println("Число которое нужно угадать - " + targetNumber);

            p1.guess();
            p2.guess(); // Вызываем метод guess из каждого объекта Player
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает что это... - " + guessp1);
            guessp2 = p2.number;
            System.out.println("Второй игрок думает что это... - " + guessp2); // Извлекаем варианты ответов каждого игрока
            guessp3 = p3.number;
            System.out.println("Третий игрок думает что это... - " + guessp3);

            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if (guessp2 == targetNumber){ // Проверяем варианты каждого из игроков на соответствие загаданному числу.
                p2isRight = true;
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){ // если 1 игрок или 2 игрок или 3 игрок (|| означает или) угадал
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Третий игрок угадал? " + p3isRight);
                System.out.println("Конец игры!");
                break;
            }else { //иначе остаемся в цикле и просим игроков сделать еще одну попытку
                System.out.println("Игроки должны попробовать еще разочек!");
            }//конец if/else
        }//конец цилка while
    } //конец метода startGame
} // конец класса GuessGame_str69
