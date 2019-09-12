package interfaces;

import java.util.List;

public interface Dao<T> {
    public void save(T t);
    public T load(long id);
    public void delete(long id);
    public void update(T t);
    public List<T> loadAll();
}
