public class Kullanici {
    private int id;
    private String ad;
    private String eposta;
    private String sifre;

    public Kullanici(int id, String ad, String eposta, String sifre) {
        this.id = id;
        this.ad = ad;
        this.eposta = eposta;
        this.sifre = sifre;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getEposta() {
        return eposta;
    }

    public String getSifre() {
        return sifre;
    }
    public boolean girisYap(String girilenEposta, String girilenSifre) {
    return eposta.equals(girilenEposta) && sifre.equals(girilenSifre);
}
}
