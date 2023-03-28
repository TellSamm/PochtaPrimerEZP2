package Uzichaem_Java;

public class SimpleDotCom {
    int [] locationCells;
    int numOfHits = 0;

    public void setLocztionCells (int[] locs){
        locationCells = locs;
    }

    public String checkYourSelf (String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "мимо";
        for (int cell : locationCells){
            if (guess == cell){
                result = "Попал";
                numOfHits ++;
                break;
            }
        } // выходим из цикла
        if (numOfHits==locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    } //завершаем метод
} // завершаем класс
