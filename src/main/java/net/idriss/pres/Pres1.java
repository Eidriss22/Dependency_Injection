package net.idriss.pres;

import net.idriss.dao.DaoImpl;
import net.idriss.metier.MetierImpl;

public class Pres1 {
    static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        System.out.println("Res = " + metier.calcul());
    }
}
