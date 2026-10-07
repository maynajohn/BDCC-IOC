package net.youssfi.pres;

import net.youssfi.dao.DaoImpl;
import net.youssfi.metier.MetierImpl;

public class Pres1 {

    public static void main() {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d); Injection des dépendances
        System.out.println("RES= "+metier.calcul());
    }
}
