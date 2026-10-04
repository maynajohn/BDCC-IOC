package net.youssfi.pres;

import net.youssfi.metier.IMetierImpl;

public class Pres1 {
    public static void main() {
        IMetierImpl metier = new IMetierImpl();
        System.out.println("RES= "+metier.calcul());
    }
}
