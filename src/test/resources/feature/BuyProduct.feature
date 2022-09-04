@ProductViaSearch
Feature: As Tester feature access a product via Search in www.elevenia.co.id
  As a Tester at https://www.elevenia.co.id/
  I want to access the product with 8 Steps of Scenario Testing
  So that I can buy “Produk terlaris“, access the cart,
  choose ubah kurir and remove the product in the cart
  and the cart is empty


  Scenario: Buy The Product Success of Search Product
    Given I have been on the homepage of elevenia as Tester
    When I have inputed "komputer" at search product
    And I have selected and clicked the 'Produk terlaris' that I need
    And I went to detail Produk terlaris page
    And I have clicked produk paling pertama the product that I bought
    And I have set "3" the mount of product that I bought
    And I clicked 'Tambahkan ke Cart' button in detail page of cart
    And I clicked 'Apakah ingin melihat Cart Anda?' button on pop up box of Tambahkan ke Cart
    And I went to Cart page
    And I clicked 'Ubah Kurir' text to the box
    And I clicked 'Batal' button on pop up box of Cart
    And I clicked 'Hapus' button in Cart Page
    And I Clicked 'OK' button on pop up box of Hapus
    Then I got the Stop Testing of Assessment Based


