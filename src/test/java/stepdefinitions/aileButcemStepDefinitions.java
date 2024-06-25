package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Point;
import utils.Driver;

import java.time.Duration;

public class aileButcemStepDefinitions {
    AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();
    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {
   // 975,953   121,953
        Thread.sleep(3000);
        TouchAction action=new TouchAction<>(driver);
        action.
                press(PointOption.point(906,1001))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(750)))
                .moveTo(PointOption.point(139,1001))
                .release()
                .perform();
    }
    @Given("mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin() {

    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {

    }
    @Given("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() {

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin ve değişikleri dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin_ve_değişikleri_dogrulayin() {

    }

}
