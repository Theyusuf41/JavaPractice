package StorageManagement;

import java.util.ArrayList;

import static StorageManagement.Islemler.input;

public class Depo implements UrunAlis,UrunSatis,UrunTanimla{

    ArrayList<Urun> urunList = new ArrayList<>(); // urun classtan gelen datalar burada  depolanir
    @Override
    public void urunGir(int urunId, int girilenUrunMiktari) {
        urunList.get(urunId-idAtaIlk).setUrunMiktar(urunList.get(urunId-idAtaIlk).getUrunMiktar()+girilenUrunMiktari);

    }

    @Override
    public void urunSat(int urunId, int satilanUrunMiktari) {
        System.out.println("Depoda su kadar mal var: " + urunList.get(urunId - idAtaIlk).getUrunMiktar() );
        if(urunList.get(urunId - idAtaIlk).getUrunMiktar() >= satilanUrunMiktari) {
            urunList.get(urunId-idAtaIlk).setUrunMiktar(urunList.get(urunId-idAtaIlk).getUrunMiktar()-satilanUrunMiktari);
        }else {
            System.out.println("Fazla istiyorsun \n tekrar dene");
            satilanUrunMiktari = input.nextInt();
            urunSat(urunId,satilanUrunMiktari);
        }



    }

    @Override
    public void urunTanimla(String urunIsmi, String uretici, String birim) {
        Urun fasulye = new Urun(idAtaIlk+urunList.size() ,urunIsmi , uretici , birim);
        urunList.add(fasulye);
        // daha clean yazmak icin  urunList.add(new Urun(idAtaIlk+urunList.size() ,urunIsmi , uretici , birim));

    }

    @Override
    public void urunRafTanimla(int urunId, int urunRafNo) {
        urunList.get(urunId-idAtaIlk).setRafNo(urunRafNo);

    }

    @Override
    public ArrayList<Urun> urunListele() {
        return urunList;
    }
}
