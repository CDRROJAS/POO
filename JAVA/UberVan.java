import java.util.Map;
import java.util.ArrayList;

public class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    public UberVan (String license, Account driver, Integer passenger, Map<String, Map<String, Integer>> typeCarAccepted,  ArrayList<String> seatMaterial){
        super(license,driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }

  @Override
  public void setPassenger(Integer passenger) {
        if (passenger == 6)
            this.passenger=passenger;
        else
            System.out.println("Asignar 6 pasajeros");
  }

}
