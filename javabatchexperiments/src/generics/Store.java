package generics;

public class Store<T> {
    private  String name;

   private T value;

   public Store(String name,T element){
       this.value =element;
       this.name = name;
   }

   public void setValue(T value){
       this.value=value;
   }

   public T getValue() {
       return value;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
