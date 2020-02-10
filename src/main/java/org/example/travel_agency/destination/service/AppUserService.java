package org.example.travel_agency.destination.service;


import org.example.travel_agency.destination.entities.AppUser;
import org.example.travel_agency.destination.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {


    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> showAllUser() {
        return appUserRepository.findAll();
    }

    public boolean addAppUser(AppUser appUser) {
        appUserRepository.save(appUser);
        return true;
    }

}

