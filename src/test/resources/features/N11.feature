Feature: N11 Web sitesine gitme
  Scenario: N11 Web sitesine gitmek istiyorum
    Given Kullanıcı anasayfaya  gider.
    When Anasayfanın yüklendiğini doğrular.
    And Kullanıcı anasayfada Giriş Yap butonunu bulur ve tıklar.
    And Giriş sayfasının yüklendiğini doğrulanır.
    And Kullanıcı giriş sayfasında kullanıcı adı alanına geçerli bir kullanıcı adı girer.
    And Kullanıcı giriş sayfasında şifre alanına geçerli bir şifre girer.
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcı hesabına başarıyla giriş yapıldığı doğrulanır.
    Then Kullanıcı anasayfada istediği işlemi gerçekleştirir.
    And İşlemin başarıyla tamamlandığı doğrulanır.