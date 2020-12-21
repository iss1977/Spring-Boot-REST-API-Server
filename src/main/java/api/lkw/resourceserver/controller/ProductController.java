package api.lkw.resourceserver.controller;

import api.lkw.resourceserver.entity.Product;
import api.lkw.resourceserver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    //we need the Product Service, so we inject it
    @Autowired
    private ProductService service;


    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){ // this is our PUT method. with @RequestBody we parse the incoming JSON to the Product class
        return service.saveProduct(product);
    }

    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product>  products){ // this is our PUT method. with @RequestBody we parse the incoming JSON to the Product class
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/productbyid/{id}")
    public Product findProductById(@PathVariable int id){ // @RequestParam is also posible here, but you must change :@GetMapping("/product/{id}") or you get 404
        return service.getProductById(id);
    }

    @GetMapping("/productbyname/{name}")
    public Product findProductByName(@PathVariable String  name){
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){ // this is our PUT method. with @RequestBody we parse the incoming JSON to the Product class
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

}
