package generics;

public class Store<T> {
    private T value;

    public Store(T element) {
        this.value = element;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
