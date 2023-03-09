package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
           Se connecter a la base de donnes
        */
        double temp=Math.random()*40;
        return temp;
    }
}
