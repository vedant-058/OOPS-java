public class director {
    String name;
    director() {}
    protected director(String name) {
        this.name = name;
    }
    public void details(String name) {
        System.out.println("Name of Director : " + name);
    }
}
