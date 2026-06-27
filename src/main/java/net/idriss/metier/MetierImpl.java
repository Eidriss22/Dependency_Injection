package net.idriss.metier;

import net.idriss.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;

    public MetierImpl(IDao dao) {
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
