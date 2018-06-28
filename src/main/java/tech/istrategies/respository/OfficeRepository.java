package tech.istrategies.respository;

import org.springframework.data.jpa.repository.JpaRepository;


import tech.istrategies.model.Offices;

public interface OfficeRepository extends JpaRepository<Offices, Integer>{
	
	

}
