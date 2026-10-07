import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OduncAlma {
    private int islemNo;
    private String oduncTarihi;
    private String sonTeslimTarihi;
    private String teslimTarihi;
    private Uye uye;
    private KitapKopyasi kitapKopyasi;

    public OduncAlma(int islemNo, String oduncTarihi,
                     String sonTeslimTarihi, String teslimTarihi,
                     Uye uye, KitapKopyasi kitapKopyasi) {
        this.islemNo = islemNo;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.teslimTarihi = teslimTarihi;
        this.uye = uye;
        this.kitapKopyasi = kitapKopyasi;

        uye.oduncEkle(this);
        kitapKopyasi.oduncEkle(this);
        kitapKopyasi.durumGuncelle("Ödünç Verildi");
    }

    // YENİ: Süre Uzat use case'i
    public void sureUzat(int gun) {
        if (!teslimTarihi.equals("Henüz teslim edilmedi")) {
            System.out.println("Kitap zaten teslim edilmiş, süre uzatılamaz.");
            return;
        }
        DateTimeFormatter bicim = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate yeniTarih = LocalDate.parse(sonTeslimTarihi, bicim).plusDays(gun);
        this.sonTeslimTarihi = yeniTarih.format(bicim);
        System.out.println("Süre " + gun + " gün uzatıldı. Yeni son teslim tarihi: "
                + sonTeslimTarihi);
    }

    public void teslimEt(String tarih) {
        this.teslimTarihi = tarih;
        kitapKopyasi.durumGuncelle("Ödünç Verilebilir");
    }

    public void bilgiGoster() {
        System.out.println("İşlem No: " + islemNo);
        System.out.println("Ödünç Tarihi: " + oduncTarihi);
        System.out.println("Son Teslim Tarihi: " + sonTeslimTarihi);
        System.out.println("Teslim Tarihi: " + teslimTarihi);
        uye.bilgiGoster();
        kitapKopyasi.bilgiGoster();
    }
}
