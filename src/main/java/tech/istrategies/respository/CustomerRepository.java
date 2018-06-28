package tech.istrategies.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import tech.istrategies.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{

}
