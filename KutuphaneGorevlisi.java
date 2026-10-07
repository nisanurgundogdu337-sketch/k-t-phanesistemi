public class KutuphaneGorevlisi extends Kullanici {
    public KutuphaneGorevlisi(int id, String ad, String eposta, String sifre) {
        super(id, ad, eposta, sifre);
    }

    public Kitap kitapEkle(String ISBN, String baslik, String yazar, int yayinYili) {
        Kitap kitap = new Kitap(ISBN, baslik, yazar, yayinYili, "Ödünç Verilebilir");
        System.out.println("Kitap eklendi: " + baslik);
        return kitap;
    }

    public void kitapGuncelle(Kitap kitap, String yeniDurum) {
        kitap.durumGuncelle(yeniDurum);
        System.out.println("Kitap güncellendi: " + kitap.getBaslik()
                + " | Yeni durum: " + yeniDurum);
    }

    public void oduncOnayla(OduncAlma odunc) {
        System.out.println("Ödünç talebi onaylandı (görevli: " + getAd() + "):");
        odunc.bilgiGoster();
    }
}