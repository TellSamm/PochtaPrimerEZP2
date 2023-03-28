package TestUyra;

import Nasledovaniye.Killer;

public class ManKiller extends Killer {

   private String nameGun = gun;

    public static void main(String[] args) {
        new ManKiller().model("Terijak");
    }

    public void model(String modelName) {
        System.out.println();
    }

}
