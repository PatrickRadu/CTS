public class Colet extends AColet{
    String phonenumber;
    Aviz aviz;
    public Colet(String nume,String phonenumber,String datalimita) {
        super(nume);
        this.phonenumber=phonenumber;
        this.aviz=Aviz.getInstance(datalimita,nume);
    }


    @Override
    public void descriere() {
        System.out.println("Coletul cu numele " + getNume() + " are aviz cu data limita de " + aviz.getDatalimita());
    }
}
