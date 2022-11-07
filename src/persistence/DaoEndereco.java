package persistence;

import model.Endereco;

import java.util.ArrayList;

public class DaoEndereco extends DAO implements DefaultPersistence<Endereco>{

    @Override
    public ArrayList<Endereco> findAll() {
        return null;
    }

    @Override
    public boolean save(Endereco endereco) {
        return false;
    }

    @Override
    public boolean update(Endereco endereco) {
        return false;
    }

    @Override
    public Endereco findById(String query) {
        return null;
    }
}
