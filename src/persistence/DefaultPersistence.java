package persistence;

import model.Pessoa;

import java.util.ArrayList;

public interface DefaultPersistence<T> {
    ArrayList<T> findAll();
    boolean save(T t);
    boolean update(T t);
    T findById(int id);
    void delete(int id);
}
