package com.mangosoft.guestservices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by frankmoley on 5/23/17.
 */
@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{
    Guest findByEmailAddress(String emailAddress);
}
