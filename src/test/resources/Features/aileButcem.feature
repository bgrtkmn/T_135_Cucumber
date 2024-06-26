Feature: Kullanici aile Butcem uygulamasindaki gorevleri yerine getirir

    Background: Uygulamaya herkesce giris yapilabilmesi icin bu adimlardan gecmek zorunludur!!!!!!
      * ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
      * "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
      * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  @ab
  Scenario Outline: Kullanici uygulamada kullanici bilgilerini degistirir ve degistirildigini dogrular

  * sol kisimdaki menuden "Hesabım" bolumune gidin
  * hesabim sayfasindaki bilgileri degistirerek "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" degisikleri kaydedin ve değişikleri dogrulayin
    * uygulamayi kapatir
    Examples:
      | isim   |soyisim |sehir |yas |meslek |
      | isim1  |soyisim1|sehir1|yas1|meslek1|
      | isim2  |soyisim2|sehir2|yas2|meslek2|


  Scenario: Kullanici uygulamada ayarlar bolumune gider ve fonksiyonlari test eder

     * sol kisimdaki menuden "Ayarlar" bolumune gidin


   Scenario:  Kullanici bize ulasin kismindaki fonksiyonlari test eder

     * sol kisimdaki menuden "Bize Ulasin" bolumune gidin