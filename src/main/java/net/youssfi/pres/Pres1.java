package net.youssfi.pres;

import net.youssfi.dao.DaoImpl;
import net.youssfi.metier.IMetierImpl;

public class Pres1 {

    public static void main() {
        DaoImpl d = new DaoImpl();
        IMetierImpl metier = new IMetierImpl(d);
        //metier.setDao(d); Injection des dépendances
        System.out.println("RES= "+metier.calcul());
    }
}
