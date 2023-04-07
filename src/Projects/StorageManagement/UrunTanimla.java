package Projects.StorageManagement;

import java.util.ArrayList;

public interface UrunTanimla {
    int idAtaIlk = 1001;

    void urunTanimla(String urunIsmi, String uretici , String birim); // abstract urun tanimlandi
    void urunRafTanimla(int urunId, int urunRafNo); // abstract  tanimlandi

    ArrayList<Urun> urunListele();
}
