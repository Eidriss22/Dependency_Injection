package net.idriss.metier;

import net.idriss.dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI * Math.cos(t);

        return res;
    }
}
