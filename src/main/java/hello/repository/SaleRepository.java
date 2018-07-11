package hello.repository;

import org.springframework.data.repository.CrudRepository;

import hello.entity.Sale;

public interface SaleRepository extends CrudRepository<Sale, Long>{

	
}
