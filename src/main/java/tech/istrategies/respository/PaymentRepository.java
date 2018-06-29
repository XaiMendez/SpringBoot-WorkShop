package tech.istrategies.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.istrategies.model.Payments;

public interface PaymentRepository extends JpaRepository<Payments, Integer>{

}
