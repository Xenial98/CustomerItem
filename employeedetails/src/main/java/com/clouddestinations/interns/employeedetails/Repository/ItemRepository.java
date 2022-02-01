package com.clouddestinations.interns.employeedetails.Repository;

import com.clouddestinations.interns.employeedetails.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    Optional<Item> findByCustomerId(Integer integer);
}
