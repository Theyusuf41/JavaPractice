package Day02;

public class RentApartment {
    private String name;
    private int roomCount;
    private boolean balconyOrNot;
    static int amountOfRent;

    public RentApartment(String name, int roomCount, boolean balconyOrNot) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNot = balconyOrNot;
    }
    public int RoomRent(){ // Oda sayisina gore kira hesaplamasi yapildi...
        if(roomCount==0){
            return amountOfRent=1400;
        }else if(roomCount==1){
            return amountOfRent=1700;
        }else if(roomCount==2){
            return amountOfRent=2200;
        }else if(roomCount==3){
            return amountOfRent=2700;
        }
        return amountOfRent;
    }
    public int isBalcony(){
        if(balconyOrNot==true){
            return amountOfRent+=200;
        }
        return amountOfRent;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNot() {
        return balconyOrNot;
    }

    public void setBalconyOrNot(boolean balconyOrNot) {
        this.balconyOrNot = balconyOrNot;
    }

    @Override
    public String toString() {
        return name+ " has an apartment with " + roomCount + " rooms and a " + "balcony " + balconyOrNot + " total rent: " + RoomRent();
    }
}




class ApartmentRunner{
    public static void main(String[] args) {
        RentApartment person1 = new RentApartment("yusuf", 2,true);
        System.out.println(person1);

    }
}
/*

Task
     Runner ve rentApartments Class'ları create ediniz
    rentApartments Class'ında data hiding
    Bu variable'ları create ediniz
    String name
    int roomCount
    boolean balconyOrNo
    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.
    Runner class  içinde;
    userName rent is amountOfRent(... kiracı nın datalarını -> oda saysı, balkon isteği ,kira miktarı) print eden code create ediniz
 */