package org.supermarket;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;


public class ShoppingCartTest {

    @Test
    public void shouldAddTheProductInShoppingCart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();

        assertThat(shoppingCart.getTotalNumberOfItems()).isEqualTo(0);

        shoppingCart.add("A");
        assertThat(shoppingCart.getTotalNumberOfItems()).isEqualTo(1);

        shoppingCart.add("B");
        assertThat(shoppingCart.getTotalNumberOfItems()).isEqualTo(2);
    }

    @Test
    public void shouldReturnTheItemsInCart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();

        assertThat(shoppingCart.getItems()).isNull();

        shoppingCart.add("A");
        assertTrue(shoppingCart.getItems().contains("A"));

        shoppingCart.add("B");
        assertTrue(shoppingCart.getItems().contains("B"));

    }
}
