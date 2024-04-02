import java.util.HashMap;
import java.util.Map;

public class Aviz {
    private String datalimita;
    private static final Map<String,Aviz> instances=new HashMap<>();
    private Aviz(String datalimita) {
        this.datalimita = datalimita;
    }

    public String getDatalimita() {
        return datalimita;
    }

    public static   Aviz getInstance(String datalimita, String nume)
    {
        if(!instances.containsKey(nume)) {
            instances.put(nume, new Aviz(datalimita));
        }
        // Return the existing instance for this "nume"
        return instances.get(nume);
    }
}
