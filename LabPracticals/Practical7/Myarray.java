import java.util.Arrays;

class MyArray<T>{
    Object[] array;
    int indx;
    int size;
    MyArray(T obj[]){
        size=5;
        array=obj;
        indx=0;
    }
    MyArray(){
        size=5;
        array = new Object[size];
        indx=0;
    }
    MyArray(int s){
        size=s;
        array = new Object[size];
        indx=0;
    }
    void add(T item){
        if(indx<size){
            array[indx++]=item;
            System.out.println("Item added successfully");
        }else{
            this.grow();
            this.add(item);
        }
    }
    private void grow(){
        size=size+(int)(size*0.5);
        array= Arrays.copyOf(array,size);
    }
    public T get(int i){
        if(i<0 || i>size-1){
            System.out.println("Exeption:Invalid index");
        }
        return (T)array[i];
    }
    public void swap(int i,int j){
        if(i>indx||j>indx){
            System.out.println("Exception:Invalid indices");
        }else{
            Object temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }
}