package com.arr.string;



public class CheckoutId {
  private final String value;

  private CheckoutId(final String value) {
    this.value = value;
  }

  // public CheckoutId(UUID randomUUID) {
  //   this.value = value;

  // }

  static CheckoutId create() {
    return new CheckoutId(UUID.randomUUID());
  }

  public String toString() {
    return this.value;
  }

  public static void main(String[] args) {
    CheckoutId checkoutId = new CheckoutId(UUID.randomUUID());
    System.out.println(checkoutId.toString());
  }
}