package AccessModifier;

public class CalisanBilgi { // Pojo
    @Override
    public String toString() {
        return "CalisanBilgi{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public CalisanBilgi(String name, int id, String occupation) {
        this.name = name;
        this.id = id;
        this.occupation = occupation;
    }

    public String name = "Yusuf";
    private int id      = 100;

    protected String occupation = "QA Tester";
}
// Access Modifiers' lar nelerdir :
// Default -> Otomatik yazar. Package ve Class'tan erisilir
// Public -> Her yerden erisilir
// Protected -> Child'lardan erisilir
// Private -> ( En kisitli erisim ) Sadece ayni sinif ici

// Classlar icin sadece public veya default kullanilir !!
