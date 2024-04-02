public abstract class  AColet {
    String nume;
    public abstract void descriere();

    public String getNume() {
        return nume;
    }

    public AColet(String nume) {
        this.nume = nume;
    }
}
