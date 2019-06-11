package in.ac.sharda.pizzaapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.Cart;
import in.ac.sharda.pizzaapplication.domain.User;

@RestController
public class CheckOutController {
	@GetMapping("/checkout")
	public boolean checkout() {
		//1.Add items to the order status.
		User.getInstance().addorderStatus(Cart.getInstance().getProducts());
		//2.Remove items from cart-clear the cart.
		Cart.getInstance().clear();
		return true;
	}
}