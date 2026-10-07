import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Online Kütüphane Yönetim Sistemi Başlatıldı!");
        Scanner scanner = new Scanner(System.in, "Cp857");

        Uye uye1 = new Uye(1, "Ayşe", "ayse@mail.com", "1234",
                "Yılmaz", "U001");

        System.out.print("E-posta: ");
        String girilenEposta = scanner.nextLine();

        System.out.print("Şifre: ");
        String girilenSifre = scanner.nextLine();

        if (uye1.girisYap(girilenEposta, girilenSifre)) {
            System.out.println("Üye girişi başarılı.");
        } else {
            System.out.println("E-posta veya şifre hatalı.");
            return;
        }

        KutuphaneGorevlisi gorevli1 = new KutuphaneGorevlisi(
                2, "Mehmet", "mehmet@mail.com", "1234");
        System.out.println("Görevli: " + gorevli1.getAd());

        Kitap kitap1 = gorevli1.kitapEkle("9780000000001",
                "Kürk Mantolu Madonna", "Sabahattin Ali", 1943);
        Kitap kitap2 = gorevli1.kitapEkle("9780000000002",
                "Java'ya Giriş", "Örnek Yazar", 2024);

        Kitap[] kitaplar = {kitap1, kitap2};

        System.out.print("Aranacak kitap adı: ");
        String arananBaslik = scanner.nextLine();
        uye1.kitapAra(kitaplar, arananBaslik);

        KitapKopyasi kopya1 = kitap1.kopyaEkle("BK001");
        KitapKopyasi kopya2 = kitap2.kopyaEkle("BK002");

        OduncAlma odunc1 = uye1.oduncAl(kopya1, 1, "05.10.2026", "19.10.2026");
        OduncAlma odunc2 = uye1.oduncAl(kopya2, 2, "05.10.2026", "19.10.2026");

        gorevli1.oduncOnayla(odunc1);

        System.out.println("--- Süre uzatma ---");
        uye1.sureUzat(odunc1, 7);
        odunc1.bilgiGoster();

        odunc1.teslimEt("26.10.2026");

        System.out.println("Kitap teslim edildikten sonra:");
        odunc1.bilgiGoster();

        gorevli1.kitapGuncelle(kitap2, "Ödünç Verilebilir");

        System.out.println("Üyenin ödünç kayıt sayısı: " + uye1.getOkudugumKitaplar().size());
        System.out.println("Kopya1'in ödünç kayıt sayısı: " + kopya1.getOduncListesi().size());
        System.out.println("Kitap1'in kopya sayısı: " + kitap1.getFizikselKopyalar().size());

        scanner.close();
    }
}
