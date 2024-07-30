package edu.dio.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.dio.web.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
	
    boolean existsByAccountNumber(String accountNumber);


}
