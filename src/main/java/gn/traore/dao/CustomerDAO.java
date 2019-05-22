package gn.traore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gn.traore.model.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Long>{

}
