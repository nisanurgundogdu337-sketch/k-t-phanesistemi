import java.util.ArrayList;
import java.util.List;

public class Uye extends Kullanici {
    private String soyad;
    private String uyeNumarasi;
    private List<OduncAlma> okudugumKitaplar = new ArrayList<>();

    public Uye(int id, String ad, String eposta, String sifre,
               String soyad, String uyeNumarasi) {
        super(id, ad, eposta, sifre);
        this.soyad = soyad;
        this.uyeNumarasi = uyeNumarasi;
    }

    public void bilgiGoster() {
        System.out.println("Üye: " + getAd() + " " + soyad
                + " | Üye No: " + uyeNumarasi);
    }

    public void oduncEkle(OduncAlma odunc) {
        okudugumKitaplar.add(odunc);
    }

    public List<OduncAlma> getOkudugumKitaplar() {
        return okudugumKitaplar;
    }

    public OduncAlma oduncAl(KitapKopyasi kopya, int islemNo,
                             String oduncTarihi, String sonTeslimTarihi) {
        return new OduncAlma(islemNo, oduncTarihi, sonTeslimTarihi,
                "Henüz teslim edilmedi", this, kopya);
    }

    public void sureUzat(OduncAlma odunc, int gun) {
        odunc.sureUzat(gun);
    }

    public void kitapAra(Kitap[] kitaplar, String arananBaslik) {
        boolean bulundu = false;

        for (int i = 0; i < kitaplar.length; i++) {
            if (kitaplar[i].getBaslik().trim()
                    .equalsIgnoreCase(arananBaslik.trim())) {
                System.out.println("Kitap bulundu:");
                kitaplar[i].bilgiGoster();
                bulundu = true;
            }
        }

        if (!bulundu) {
            System.out.println("Kitap bulunamadı.");
        }
    }
}