package persistence;

import model.Imovel;

import java.util.ArrayList;

public class DaoImovel extends DAO implements DefaultPersistence<Imovel> {
    @Override
    public ArrayList<Imovel> findAll() {
        return null;
    }

    @Override
    public boolean save(Imovel imovel) {
        return false;
    }

    @Override
    public boolean update(Imovel imovel) {
        return false;
    }

    @Override
    public Imovel findById(String query) {
        return null;
    }
}
