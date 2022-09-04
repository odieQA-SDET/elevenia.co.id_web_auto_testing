package starter.Pages_Object;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuySearchProductObject extends PageObject {

  /*  @FindBy(xpath = "//a[@class='btn-close closeBtnMainPromo']")
    WebElement clickNotif;
    public void OpenNotifcation() {
        clickNotif.click();
    }*/

    @FindBy(xpath = "//input[@id='AKCKwd']")
    WebElement inputLaptop;
    public void inputProductLaptop(){
    inputLaptop.sendKeys("komputer");
    inputLaptop.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath= "//a[contains(text(),'Produk terlaris')]")
    WebElement clickProducts;
    public void clickCardsProducts() {
        clickProducts.click();
    }

    @FindBy(xpath = "//img[@alt='JOYSEUS Wireless Mouse 1800DPI USB Computer 2.4GHz Mouse - MS0003']")
    WebElement clickedPertama;
    public void ClickedProdukPalingPertama() {
        clickedPertama.click();
    }

    @FindBy(xpath="//input[@id='optionStock0']")
    WebElement SetInputMount;
    public void setInputadd() {
        SetInputMount.clear();
        SetInputMount.sendKeys("3");
    }

    @FindBy(xpath="//a[normalize-space()='Tambahkan ke Cart']")
    WebElement clickCart;
    public void clickKeranjangTambah() {
        clickCart.click();
    }

    @FindBy(xpath = "//div[@id='mo_lay144']//div[@class='popCon']")
    WebElement popupVisible;
    public void Popupvisible() {
        popupVisible.isDisplayed();
    }

    @FindBy(xpath="//a[@href='http://www.elevenia.co.id/cart/CartAction/getCartList.do']")
    WebElement clickPopupVisible;
    public void clickAlertLanjutKeranjang() {
        clickPopupVisible.click();
    }

    @FindBy(xpath = "//img[@alt='Cart']")
    WebElement cartPages;
    public void CartPages() {
        cartPages.getText();
    }

    @FindBy(xpath = "//a[normalize-space()='Ubah Kurir']")
    WebElement Ubahkurir;
    public void clickUbahKurir() {
        Ubahkurir.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Batal']")
    WebElement ClickBATAL;
    public void ClickBatal() {
       ClickBATAL.click();
    }

    @FindBy(xpath = "//*[contains(@class, 'alignL')]//a[text()='Hapus']")
    WebElement Clickhapus;
    public void clickhapus() {
        Clickhapus.click();
    }

    @FindBy(xpath = "//article[@id='popCon4']")
    WebElement PopupHapus;
    public void PopUpHapus() {
        PopupHapus.isDisplayed();
    }

    @FindBy(xpath = "//a[@id='chkDelPopY']")
    WebElement CLICKok;
    public void ClickOK() {
        CLICKok.click();
    }

    @FindBy(xpath = "//strong[normalize-space()='Tidak ada produk di Shopping Cart.']")
    WebElement EndShoppingTesting;
    public void GetTextEndShopping() {
        EndShoppingTesting.getText();
    }



}





