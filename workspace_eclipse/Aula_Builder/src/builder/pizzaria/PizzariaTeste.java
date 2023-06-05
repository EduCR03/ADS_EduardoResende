package builder.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzariaTeste {

	@Test
	void deveConstruirPizzaValida() {
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();
		
		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
	}
	
	@Test
	void deveInvalidarPizzaComTamanhoErrado() {
		try {
			Pizza pizza = new PizzaBuilder()
					.setSize(4)
					.addCheese()
					.addPepperoni()
					.getPizza();
			
			fail();
		}catch(IllegalStateException e) {
			
		}

	}
	
	@Test
	void deveInvalidarPizzaSemIngrediente() {
		try {
			Pizza pizza = new PizzaBuilder()
					.setSize(2)
					.getPizza();
			
			fail();
		}catch(IllegalStateException e) {
			
		}
		
	}
}
