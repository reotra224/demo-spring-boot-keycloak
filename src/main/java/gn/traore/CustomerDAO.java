package gn.traore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gn.traore.model.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Long>{

}
