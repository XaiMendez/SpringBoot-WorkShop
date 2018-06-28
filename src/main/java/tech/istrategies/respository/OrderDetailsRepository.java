package tech.istrategies.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.istrategies.model.Offices;
import tech.istrategies.model.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>{

}
