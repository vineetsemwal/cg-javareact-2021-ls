package generics;

public class Store {
   private Object value;

   public Store(Object element){
       this.value =element;
   }

   public void setValue(Object value){
       this.value = value;
   }

   public Object getValue() {
       return value;
   }

}
