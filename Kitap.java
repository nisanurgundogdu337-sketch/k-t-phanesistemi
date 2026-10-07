import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private String ISBN;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String durum;
    private List<KitapKopyasi> fizikselKopyalar = new ArrayList<>();

    public Kitap(String ISBN, String baslik, String yazar,
                 int yayinYili, String durum) {
        this.ISBN = ISBN;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = durum;
    }

    public void bilgiGoster() {
        System.out.println("Kitap: " + baslik
                + " | ISBN: " + ISBN
                + " | Yazar: " + yazar
                + " | Yayın yılı: " + yayinYili
                + " | Durum: " + durum);
    }

    public void durumGuncelle(String yeniDurum) {
        this.durum = yeniDurum;
    }

    public String getBaslik() {
        return baslik;
    }

    public KitapKopyasi kopyaEkle(String barkod) {
        KitapKopyasi kopya = new KitapKopyasi(barkod, this);
        fizikselKopyalar.add(kopya);
        return kopya;
    }

    public List<KitapKopyasi> getFizikselKopyalar() {
        return fizikselKopyalar;
    }
}