import java.util.Map;
import java.util.ArrayList;

public class UberBlack extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    public UberBlack (String license, Account driver, Integer passenger, Map<String, Map<String, Integer>> typeCarAccepted,  ArrayList<String> seatMaterial){
        super(license,driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }
        
}
