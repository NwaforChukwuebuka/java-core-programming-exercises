package weekOne;

public class BackToSenderLogistics {

    private static final int DAILY_QUOTA = 100;
    private static final int BASE_PAY = 5000;

    private static final int AMOUNT_PER_PARCEL_UNDER_50_PERCENT = 160;
    private static final int AMOUNT_PER_PARCEL_50_TO_59_PERCENT = 200;
    private static final int AMOUNT_PER_PARCEL_60_TO_69_PERCENT = 250;
    private static final int AMOUNT_PER_PARCEL_70_PERCENT_AND_ABOVE = 500;

    public int calculateRiderWage(int successfulDeliveries) {
        validateSuccessfulDeliveries(successfulDeliveries);

        int amountPerParcel;
        if (successfulDeliveries < 50) {
            amountPerParcel = AMOUNT_PER_PARCEL_UNDER_50_PERCENT;
        } else if (successfulDeliveries < 60) {
            amountPerParcel = AMOUNT_PER_PARCEL_50_TO_59_PERCENT;
        } else if (successfulDeliveries < 70) {
            amountPerParcel = AMOUNT_PER_PARCEL_60_TO_69_PERCENT;
        } else {
            amountPerParcel = AMOUNT_PER_PARCEL_70_PERCENT_AND_ABOVE;
        }
        return successfulDeliveries * amountPerParcel + BASE_PAY;
    }

    private static void validateSuccessfulDeliveries(int successfulDeliveries) {
        if (successfulDeliveries < 0) {
            throw new IllegalArgumentException("Successful deliveries cannot be negative");
        }
        if (successfulDeliveries > DAILY_QUOTA) {
            throw new IllegalArgumentException(
                    "Successful deliveries cannot exceed the daily quota of 100");
        }
    }
}
