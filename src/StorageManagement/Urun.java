package StorageManagement;

public class Urun {
    private int urunId;
    private int urunMiktar;
    private String urunIsim;
    private String uretici;
    private String miktarBirimi;
    private int rafNo;

    public Urun(int urunId, String urunIsim, String uretici, String miktarBirimi) {
        this.urunId = urunId;
        this.urunIsim = urunIsim;
        this.uretici = uretici;
        this.miktarBirimi = miktarBirimi;
    }


    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public int getUrunMiktar() {
        return urunMiktar;
    }

    public void setUrunMiktar(int urunMiktar) {
        this.urunMiktar = urunMiktar;
    }

    public String getUrunIsim() {
        return urunIsim;
    }

    public void setUrunIsim(String urunIsim) {
        this.urunIsim = urunIsim;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getMiktarBirimi() {
        return miktarBirimi;
    }

    public void setMiktarBirimi(String miktarBirimi) {
        this.miktarBirimi = miktarBirimi;
    }

    public int getRafNo() {
        return rafNo;
    }

    public void setRafNo(int rafNo) {
        this.rafNo = rafNo;
    }


    @Override
    public String toString() {
        return
                "urunId=" + urunId +
                ", urunMiktar=" + urunMiktar +
                ", urunIsim='" + urunIsim + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktarBirimi='" + miktarBirimi + '\'' +
                ", rafNo=" + rafNo;
    }
}
