package starter.Steps_Methods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Test_Class.BuyProduct_Test;

public class BuyProduct_Steps {
    @Steps
    BuyProduct_Test buySteps;

    @Given("I have been on the homepage of elevenia as Tester")
    public void iHaveBeenOnTheHomepageOfWwwEleveniaCoIdAsTester() {
          buySteps.openHomePage();
       //   buySteps.opennotification();
    }

    @When("I have inputed {string} at search product")
    public void iHaveInputedAtSearchProduct(String string) {
         buySteps.inputProduct();
    }

    @When("I have selected and clicked the {string} that I need")
    public void i_have_selected_and_clicked_the_product_terlaris_that_I_need(String string) {
          buySteps.openDetailProductPage();

    }
    @When("I went to detail Produk terlaris page")
    public void iWentToDetailProdukTerlarisPage() {

    }
    @When("I have clicked produk paling pertama the product that I bought")
    public void iHaveClickedProdukPalingPertamaTheProductThatIBought() {
       buySteps.clickedProdukPalingPertama();
    }

    @When("I have set {string} the mount of product that I bought")
    public void iHaveSetTheMountOfProductThatIBought(String string) {
        buySteps.setProduct();
    }


    @When("I clicked {string} button in detail page of cart")
    public void i_clicked_button_in_detail_page_of_cart(String string) {
        buySteps.clickTambahKeranjangbutton();

    }

    @When("I clicked {string} button on pop up box of Tambahkan ke Cart")
    public void i_Clicked_button_on_pop_up_box_of_Tambahkan_ke_Cart(String string) {
        buySteps.popupberhasiltambahkeranjang();
        buySteps.clickLanjutkeKeranjang();
    }

    @When("I went to Cart page")
    public void iWentToCartPage() {
        buySteps.CartKeranjangBelanja();
    }

    @When("I clicked {string} text to the box")
    public void iClickedUbahKurirTextToTheBox(String string) {
        buySteps.clickubahkurir();

    }
    @When("I clicked {string} button on pop up box of Cart")
    public void iClickedBatalButtonOnPopUpBoxOfCart(String string) {
        buySteps.clickbatal();
    }

    @When("I clicked {string} button in Cart Page")
    public void iClickedHapusButtonInCartPage(String string) {
        buySteps.clickHapus();
    }

    @When("I Clicked {string} button on pop up box of Hapus")
    public void iClickedOKButtonOnPopUpBoxOfHapus(String string) {
        buySteps.popupHapus();
        buySteps.clickOK();
    }

   @Then("I got the Stop Testing of Assessment Based")
    public void iGotTheStopTestingOfAssessmentBased() {
        buySteps.gettext();
    }


}
