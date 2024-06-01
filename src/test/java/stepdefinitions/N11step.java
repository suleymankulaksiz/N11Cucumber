package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.N11page;
import utilities.ConfigReader;
import utilities.Driver;
import org.openqa.selenium.interactions.Actions;

import static javax.swing.UIManager.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class N11step {


    N11page n11page = new N11page();
    Actions actions = new Actions(driver);


    @Given("Kullanıcı anasayfaya  gider.")
    public void kullanıcı_anasayfaya_gider() {

    }

    @When("Anasayfanın yüklendiğini doğrular.")
    public void anasayfanınYuklendiginiDogrular() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        assertEquals(expectedTitle, actualTitle);
    }

    @And("Kullanıcı anasayfada Giriş Yap butonunu bulur ve tıklar.")
    public void kullanıcıAnasayfadaGirisYapButonunuBulurVeTıklar() {
        n11page.btnGirisYap.click();

    }

    @And("Giriş sayfasının yüklendiğini doğrulanır.")
    public void girisSayfasınınYuklendiginiDogrulanır() {
        String actualUrl = getDriver().getCurrentUrl();
        System.out.println("Gerçekleşen url= "+actualUrl);
        String expectedUrl = "https://www.n11.com/giris-yap";
        assertEquals(expectedUrl, actualUrl);
    }

    @And("Kullanıcı giriş sayfasında kullanıcı adı alanına geçerli bir kullanıcı adı girer.")
    public void kullanıcıGirisSayfasındaKullanıcıAdıAlanınaGecerliBirKullanıcıAdıGirer() {
        n11page.btnEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Kullanıcı giriş sayfasında şifre alanına geçerli bir şifre girer.")
    public void kullanıcıGirisSayfasındaSifreAlanınaGecerliBirSifreGirer() {
        n11page.btnPassword.sendKeys(ConfigReader.getProperty("sifre"));
    }

    @And("Kullanıcı Giriş Yap butonuna tıklar")
    public void kullanıcıGirisYapButonunaTıklar() {
        n11page.LoginButton.click();
    }

    @And("Kullanıcı hesabına başarıyla giriş yapıldığı doğrulanır.")
    public void kullanıcıHesabınaBasarıylaGirisYapıldıgıDogrulanır() throws InterruptedException {
        actions.moveToElement(n11page.btnHesabim).perform();
        assertTrue(n11page.btnCikisYap.isEnabled());
    }

    @Then("Kullanıcı anasayfada istediği işlemi gerçekleştirir.")
    public void kullanıcıAnasayfadaIstedigiIslemiGerceklestirir() {
        actions.moveToElement(n11page.btnHesabim).perform();
        n11page.btnCikisYap.click();
    }

    @And("İşlemin başarıyla tamamlandığı doğrulanır.")
    public void ısleminBasarıylaTamamlandıgıDogrulanır() {
        String actualUrl = getDriver().getCurrentUrl();
        System.out.println("Gerçekleşen url= "+actualUrl);
        String expectedUrl = "https://www.n11.com/";
        assertEquals(expectedUrl, actualUrl);
    }
}