package j22_Encapsulation.encapsulation01.task04;

public class RentApartment {
    private String name;
    private int roomCount;
    private boolean balconyOrNot;

    public RentApartment(String name, int roomCount, boolean balconyOrNot) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNot = balconyOrNot;
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
        return "RentApartment{" +
                "name='" + name + '\'' +
                ", roomCount=" + roomCount +
                ", balconyOrNot=" + balconyOrNot +
                '}';
    }
}

class RunnerRentApartment{
    public static void main(String[] args) {

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


       package j24_Encapsulation.Tasks.task04;
​
public class RentApartments {//outher Clas level
    //fields..
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
​
    // constructor..
    public RentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }
    // task methods...
   private int rent;
public  int rentCalculator() {
    if (roomCount == 0) {
       this.rent=1400;
    }else if (roomCount == 1) {
        this.rent=1700;
    }else if (roomCount == 2) {
        this.rent=2200;
    }else if (roomCount == 3) {
        this.rent=2700;
        }
    return this.rent+=getBalconyOrNo();
​
}
public int getBalconyOrNo() {
    if(balconyOrNo ==true) {
        return 200;
    }else  return 0;
}
​
    //getter setter method
​
    public String getName() {
        return name;
    }
​
    public void setName(String name) {
        this.name = name;
    }
​
    public int getRoomCount() {
        return roomCount;
    }
​
    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }
​
    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }
​
    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }
​
    //toString method
​
​
    @Override
    public String toString() {
        return
                "'kiracı adı='" + name + '\'' +
                ", oda sayısı=" + roomCount +
                ", balconyOrNo=" + balconyOrNo +", toplam kiranız : "+
                rentCalculator();
    }
}//outher Clas sonu
​
class RunnerRentApartments {//inner Class level
​
    public static void main(String[] args) {
RentApartments obj1=new RentApartments("QA tester Murat bey",3,true);
        System.out.println("obj1 = " + obj1);//obj1 = 'kiracı adı='QA tester Murat bey', oda sayısı=3, balconyOrNo=true, toplam kiranız : 2900
    }
​
​
}//inner Class sonu








 */
