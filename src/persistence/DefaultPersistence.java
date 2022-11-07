package persistence;

import model.Pessoa;

import java.util.ArrayList;

public interface DefaultPersistence<T> {
    public ArrayList<T> findAll();
    public boolean save(T t);
    public boolean update(T t);
    public T findById(String query);
}
