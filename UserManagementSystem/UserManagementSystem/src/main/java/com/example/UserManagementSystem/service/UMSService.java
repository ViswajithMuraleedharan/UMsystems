package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.model.UMS;
import org.json.JSONObject;
import com.example.UserManagementSystem.dao.UMSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UMSService {

    @Autowired
    UMSRepository umsRepository;

    public List<UMS> findUser(Integer userId){
        List<UMS> allUsers;
        List<UMS> selecteduser;
        if(userId!=null){
            selecteduser=new ArrayList<>();
            selecteduser.add(umsRepository.getById(userId));
        }
        else{
            allUsers=umsRepository.findAll();
            return allUsers;
        }
        return selecteduser;
    }

    public UMS addUser(UMS ums){
        return umsRepository.save(ums);
    }

    public void updateUser(int userId, UMS newums){
        UMS ums=umsRepository.getReferenceById(userId);
        ums.setUserId(newums.getUserId());
        ums.setUserName(newums.getUserName());
        ums.setDob(newums.getDob());
        ums.setEmail(newums.getEmail());
        ums.setPhoneNumber(newums.getPhoneNumber());
        ums.setDate(newums.getDate());
        ums.setTime(newums.getTime());
        umsRepository.save(ums);
    }

    public void deleteUser(int userId){
        umsRepository.deleteById(userId);
    }


}
