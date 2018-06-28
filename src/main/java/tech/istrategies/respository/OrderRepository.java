package tech.istrategies.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.istrategies.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer>{

}
