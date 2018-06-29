package tech.istrategies.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.istrategies.model.Payments;
import tech.istrategies.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>{

}
