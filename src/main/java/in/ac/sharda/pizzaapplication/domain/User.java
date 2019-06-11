package in.ac.sharda.pizzaapplication.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
	
	private Cart cart=Cart.getInstance();
	private List<Set<Product>>orderStatus=new ArrayList<>();	
	private static final User instance=new User();
	private User() {
		
	}
	public List<Set<Product>> getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(List<Set<Product>> orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void addorderStatus(Set<Product> e) {
		this.orderStatus.add(new HashSet<>(e));
	}
	
	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public static User getInstance(){
		return instance;
	}
}
