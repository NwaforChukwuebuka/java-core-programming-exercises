package zone;

public class ZoneChecker {
    public String getZone(String state) {
        if (state.equalsIgnoreCase("Kano")) {return  "North West";}
        if (state.equalsIgnoreCase("Enugu")) {return  "South East";}
        return null;
    }
}
