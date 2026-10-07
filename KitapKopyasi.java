import java.util.ArrayList;
import java.util.List;

public class KitapKopyasi {
    private String barkod;
    private Kitap kitap;
    private List<OduncAlma> oduncListesi = new ArrayList<>();

    KitapKopyasi(String barkod, Kitap kitap) {
        this.barkod = barkod;
        this.kitap = kitap;
    }

    public void durumGuncelle(String yeniDurum) {
        kitap.durumGuncelle(yeniDurum);
    }

    public void bilgiGoster() {
        System.out.println("Barkod: " + barkod);
        kitap.bilgiGoster();
    }

    // YENİ
    public void oduncEkle(OduncAlma odunc) {
        oduncListesi.add(odunc);
    }

    // YENİ
    public List<OduncAlma> getOduncListesi() {
        return oduncListesi;
    }
}