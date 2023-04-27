package tdd;

public class ParcelDelivery {

    public static int parcelDelivered(int parcel) {
        if (parcel >= 50 & parcel <=59){
        return parcel * 200;}

        else if (parcel >= 60 & parcel <= 69){
           return parcel * 250;}

        else if (parcel >=70){
            return parcel * 500;}

        return parcel;
    }
}
