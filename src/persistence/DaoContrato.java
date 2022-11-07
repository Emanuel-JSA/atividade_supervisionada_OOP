package persistence;

import model.Contrato;

import java.util.ArrayList;

public class DaoContrato extends DAO implements DefaultPersistence<Contrato> {
    @Override
    public ArrayList<Contrato> findAll() {
        return null;
    }

    @Override
    public boolean save(Contrato contrato) {
        return false;
    }

    @Override
    public boolean update(Contrato contrato) {
        return false;
    }

    @Override
    public Contrato findById(String query) {
        return null;
    }
}
