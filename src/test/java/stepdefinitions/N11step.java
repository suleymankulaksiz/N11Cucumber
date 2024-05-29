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

import static javax.swing.UIManager.get;
import static org.junit.Assert.assertEquals;
import static utilities.Driver.getDriver;

public class N11step {


    N11page n11page = new N11page();


    @Given("Kullanıcı anasayfaya  gider.")
    public void kullanıcı_anasayfaya_gider() {
        getDriver().get(ConfigReader.getProperty("urlN11"));
    }

    @When("Anasayfanın yüklendiğini doğrular.")
    public void anasayfanınYuklendiginiDogrular() {
        String actualTitle = getDriver().getTitle();
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
    }

    @And("Kullanıcı giriş sayfasında şifre alanına geçerli bir şifre girer.")
    public void kullanıcıGirisSayfasındaSifreAlanınaGecerliBirSifreGirer() {
    }

    @And("Kullanıcı Giriş Yap butonuna tıklar")
    public void kullanıcıGirisYapButonunaTıklar() {
    }

    @And("Kullanıcı hesabına başarıyla giriş yapıldığı doğrulanır.")
    public void kullanıcıHesabınaBasarıylaGirisYapıldıgıDogrulanır() {
    }

    @Then("Kullanıcı anasayfada istediği işlemi gerçekleştirir.")
    public void kullanıcıAnasayfadaIstedigiIslemiGerceklestirir() {
    }

    @And("İşlemin başarıyla tamamlandığı doğrulanır.")
    public void ısleminBasarıylaTamamlandıgıDogrulanır() {
    }
}