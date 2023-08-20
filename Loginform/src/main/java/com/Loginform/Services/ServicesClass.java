package com.Loginform.Services;

import com.Loginform.EntityModel.Registerationformdata;
import com.Loginform.Repository.RegisterationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesClass {

    @Autowired
    RegisterationRepository registerationRepository;
    public void saveuserdata(Registerationformdata registerformdata) {
        Registerationformdata emaildata= registerationRepository.findByEmail(registerformdata.getEmail());
        if(emaildata==null){
             registerationRepository.save(registerformdata);
        }  else {
            throw new RuntimeException("email already exist");
        }
    }
}
