package starter.Test_Class;

import starter.Pages_Object.BuySearchProductObject;

public class BuyProduct_Test {
    BuySearchProductObject HomeProductPages;

    public void openHomePage() {
       HomeProductPages.open();
    }
    /*
    public void opennotification() {
    HomeProductPages.OpenNotifcation();}*/

    public void inputProduct() {
        HomeProductPages.inputProductLaptop();
    }
    public void openDetailProductPage() {
        HomeProductPages.clickCardsProducts();
    }
    public void clickedProdukPalingPertama() {
        HomeProductPages.ClickedProdukPalingPertama();
    }
    public void setProduct() {
        HomeProductPages.setInputadd();
    }
    public void clickTambahKeranjangbutton() {
        HomeProductPages.clickKeranjangTambah();
    }
    public void popupberhasiltambahkeranjang() {
        HomeProductPages.Popupvisible();
    }
    public void clickLanjutkeKeranjang() {
        HomeProductPages.clickAlertLanjutKeranjang();
    }
    public void CartKeranjangBelanja() {
        HomeProductPages.CartPages();
    }
    public void clickubahkurir() {
        HomeProductPages.clickUbahKurir();
    }
    public void clickbatal() {
        HomeProductPages.ClickBatal();
       }
    public void clickHapus() {
        HomeProductPages.clickhapus();
    }
    public void popupHapus() {
        HomeProductPages.PopUpHapus();
    }
    public void clickOK() {
        HomeProductPages.ClickOK();
    }
    public void gettext() {
        HomeProductPages.GetTextEndShopping();
    }
}
