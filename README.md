# k-t-phanesistemi
# OKYS - Online Kütüphane Yönetim Sistemi

Bu proje, YBS203 Nesne Yönelimli Programlama dersi Uygulama #2 ödevi kapsamında hazırlanmıştır.

OKYS (Online Kütüphane Yönetim Sistemi), kütüphanedeki kitap, üye ve ödünç alma işlemlerini yönetmek amacıyla geliştirilmiştir.

Projede Java programlama dili kullanılmıştır. Nesne yönelimli programlamanın temel konularından olan sınıf, nesne ve kalıtım yapıları kullanılarak proje oluşturulmuştur.

## Projenin Amacı

Projenin amacı, kütüphanede bulunan kitapların ve kitap kopyalarının yönetilmesini, üyelerin kitap arayabilmesini ve kitap ödünç alma işlemlerinin takip edilebilmesini sağlamaktır.

Ayrıca kütüphane görevlisinin kitap ekleme, kitap güncelleme ve ödünç alma taleplerini onaylama gibi işlemleri yapabilmesi amaçlanmıştır.

## Kullanılan Sınıflar

Projede aşağıdaki sınıflar bulunmaktadır:

- **Kullanici:** Kullanıcıların ortak bilgilerini tutar. ID, ad, e-posta ve şifre gibi bilgiler bulunmaktadır.
- **Uye:** Üyelerin kitap arama, kitap ödünç alma ve ödünç alma süresini uzatma işlemlerini yapmasını sağlar.
- **KutuphaneGorevlisi:** Kitap ekleme, kitap güncelleme ve ödünç alma taleplerini onaylama işlemlerini yapar.
- **Kitap:** Kitabın ISBN, başlık, yazar, yayın yılı ve durum bilgilerini tutar.
- **KitapKopyasi:** Kitapların barkod bilgilerini tutar.
- **OduncAlma:** Ödünç alma işlemiyle ilgili tarih ve işlem bilgilerini tutar.
- **Main:** Programın çalıştırıldığı ve işlemlerin başlatıldığı ana sınıftır.

## Kalıtım

Projede `Kullanici` sınıfından `Uye` ve `KutuphaneGorevlisi` sınıfları türetilmiştir.

Bu şekilde kalıtım konusu projede uygulanmıştır.

## Klasör Yapısı

```text
OKYS
│
├── README.md
│
├── doc
│   └── okys-DESIGN.drawio
│
└── src
    ├── Main.java
    ├── Kullanici.java
    ├── Uye.java
    ├── KutuphaneGorevlisi.java
    ├── Kitap.java
    ├── KitapKopyasi.java
    └── OduncAlma.java
