public class employee extends Manager implements tempemp, permanentemp {
    employee() {}
    public void details(String name) {
        System.out.println("Name of Employee : " + name);
    }
    public void clientDealt(int numClients) {
        System.out.println("total number of clients dealt : " + numClients);
    }
    public void clientTillNow(int numClients) {
        System.out.println("total number of clients till now : " + numClients);
    }
}