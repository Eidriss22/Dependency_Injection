package net.idriss.metier;

import net.idriss.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    public MetierImpl(){
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI * Math.cos(t);

        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
