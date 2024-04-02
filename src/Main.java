public class Main {
    public static void main(String[] args) throws Exception {
//        Colet colet1 = new Colet("Colet1", "1234567890", "2024-01-01");
//        Colet colet2 = new Colet("Colet2", "0987654321", "2024-01-02");
//        Colet colet3 = new Colet("Colet3", "1122334455", "2024-01-03");
//        Colet colet4 = new Colet("Colet4", "2233445566", "2024-01-04");
//
//        // Describe each parcel
//        colet1.descriere();
//        colet1=new Colet("Colet1","1234567890","Data noua");
//        colet1.descriere();
//        colet3.descriere();
//        colet4.descriere();
        AColet coletintern=new FactoryColet().create(TipColet.coletIntern,"Colet Intern");
        coletintern.descriere();
        AColet coletInternational=new FactoryColet().create(TipColet.coletInternational,"Colet International");
        coletInternational.descriere();
    }
}