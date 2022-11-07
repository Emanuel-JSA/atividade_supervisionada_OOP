package persistence;

import model.Pessoa;
import model.Vendedor;

import java.util.ArrayList;

public class DaoVendedor extends DAO implements DefaultPersistence<Vendedor>{
    @Override
    public ArrayList<Vendedor> findAll() {
        return null;
    }

    @Override
    public boolean save(Vendedor vendedor) {
        return false;
    }

    @Override
    public boolean update(Vendedor vendedor) {
        return false;
    }

    @Override
    public Vendedor findById(String query) {
        return null;
    }
}
