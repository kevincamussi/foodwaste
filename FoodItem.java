
import java.time.LocalDate;

public class FoodItem {
    private String name;
    private LocalDate expiryDate;
    private String donor;

    public FoodItem(String name, LocalDate expiryDate, String donor) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.donor = donor;
    }

    @Override
    public String toString() {
        return String.format("Food Item: %s, Expiry Date: %s, Donor: %s", name, expiryDate, donor);
    }
}
