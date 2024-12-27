package Trip.Planner.demo_DEEPAK.Services;

import Trip.Planner.demo_DEEPAK.Persistences.Products;
import Trip.Planner.demo_DEEPAK.Persistences.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    ProductsRepo productsRepo;
    @Override
    public void run(String... args) throws Exception {

        Products product = new Products();
        product.setTitle("Kids_Talking_Laptop");
        product.setPrice(10000);
        product.setDescription("This is a laptop");
        product.setCategory("Electronics");
        product.setImage("https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
        productsRepo.save(product);
    }
}
