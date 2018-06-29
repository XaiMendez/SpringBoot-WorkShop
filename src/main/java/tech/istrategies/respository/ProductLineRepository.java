package tech.istrategies.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.istrategies.model.ProductLines;

public interface ProductLineRepository extends JpaRepository<ProductLines, Integer>{

}
