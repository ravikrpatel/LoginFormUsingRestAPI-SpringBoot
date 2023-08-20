package com.Loginform.Repository;

import com.Loginform.EntityModel.Registerationformdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterationRepository extends JpaRepository<Registerationformdata, Integer> {
     Registerationformdata findByEmail(String email);
}
