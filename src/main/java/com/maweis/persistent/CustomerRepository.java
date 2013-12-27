package com.maweis.persistent;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findById(long id);

    List<Customer> findByLastName(String lastName);

    @Query("from Customer a where a.firstName like %:regex% or a.lastName like %:regex%")
    List<Customer> findByRegex(@Param("regex") String regex);



}