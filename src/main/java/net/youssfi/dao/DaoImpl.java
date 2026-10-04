package net.youssfi.dao;

import java.net.StandardSocketOptions;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version base de données");
        double t = 34;
        return t;
    }
}
