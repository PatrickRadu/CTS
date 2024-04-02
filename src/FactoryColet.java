public class FactoryColet {
    public AColet create(TipColet tipColet,String nume) throws Exception {
        switch (tipColet)
        {
            case coletIntern:
                return new ColetIntern(nume);
            case coletInternational:
                return new ColetInternational(nume);
            case ColetInternRamburs:
                return new ColetInternRamburs(nume);
            default:
                throw new Exception("Nu exista");
        }
    }
}
