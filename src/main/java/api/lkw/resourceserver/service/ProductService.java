package api.lkw.resourceserver.service;

import api.lkw.resourceserver.entity.Product;
import api.lkw.resourceserver.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    // we need to use the ProductRepository repository, so we must inject an instance of it using
    @Autowired
    private ProductRepository repository;

    // for the POST methods, we need the following 2 methods:
    public Product saveProduct(Product product){
        return repository.save(product); // method from JpaRepository
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    //the following 3 methods are for the GET methods
    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    // methods for DELETE method
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product deleted! ID:"+id;
    }

    // method for PUT
    // There is no update Method in Spring Data JPA, we must "play" with the save method
    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}



/**
 *
 * The following is a short example of using a Service.
 * We have annotated it with @Service annotation so that spring context can autodetect it and we can get its instance from the context
 *
 *
 * */

//
//package api.lkw.resourceserver.service;
//
//        import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class SpringMainClass {
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.scan("com.journaldev.spring");
//        context.refresh();
//
//        MathService ms = context.getBean(MathService.class);
//
//        int add = ms.add(1, 2);
//        System.out.println("Addition of 1 and 2 = " + add);
//
//        int subtract = ms.subtract(2, 1);
//        System.out.println("Subtraction of 2 and 1 = " + subtract);
//
//        //close the spring context
//        context.close();
//    }
//
//}
//
//AND :
//
//        package com.journaldev.spring; - correct this
//
//        import org.springframework.stereotype.Service;
//
//@Service("ms")
//public class MathService {
//
//    public int add(int x, int y) {
//        return x + y;
//    }
//
//    public int subtract(int x, int y) {
//        return x - y;
//    }
//}