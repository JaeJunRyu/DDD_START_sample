package ex02.sample5;

public interface SomeRepository {
    void save(Some some);
    Some findById(someId id);
}
