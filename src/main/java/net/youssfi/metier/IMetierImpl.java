package net.youssfi.metier;

import net.youssfi.dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI/2 * Math.cos(t);
        return res;

    }
}
