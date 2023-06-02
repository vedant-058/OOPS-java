interface permanentemp extends permanentManager {
    public void clientTillNow(int numClients);
}
interface tempemp extends Consultant {
    public void salaryIncr(double salary);
    public void clientDealt(int numClients);
}
interface permanentManager {
    public void totalExp(int years);
}
interface Consultant extends ConsultantManager {
    public void clientDealt(int numOfClients);
}
interface ConsultantManager {
    public void salaryIncr(double salary);
}
