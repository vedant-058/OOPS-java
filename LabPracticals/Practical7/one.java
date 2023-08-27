public class one {
    public static void main(String[] args) {
        System.out.println("Integer\n");
        MyArray<Integer> arr = new MyArray<>();
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        System.out.println("\n\n");
        for(int i=0;i<10;i++){
            System.out.println("index:" +(i+1)+" "+arr.get(i));
        }
        System.out.println("\n\nDouble\n");
        MyArray<Double> firstarray = new MyArray<>();
        for(int i=0;i<10;i++){
            firstarray.add((double)i*1.0+1);
        }
        System.out.println("\n\n");
        for(int i=0;i<10;i++){
            System.out.println("index:" +(i+1)+" "+firstarray.get(i));
        }
        firstarray.swap(3,7);
        System.out.println("After swapping\n");
        for(int i=0;i<10;i++){
            System.out.println("index:" +(i+1)+" "+firstarray.get(i));
        }
        System.out.println("\n\nString\n");
        MyArray<String> Secondarray= new MyArray<>();
        for(int i=0;i<10;i++){
            Secondarray.add("String arraylist");
        }
        System.out.println("\n\n");
        for(int i=0;i<10;i++){
            System.out.println("index:" +(i+1)+" "+Secondarray.get(i));
        }
    }
}

