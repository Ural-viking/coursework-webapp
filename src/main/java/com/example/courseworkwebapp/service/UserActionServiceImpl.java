package com.example.courseworkwebapp.service;

import com.example.courseworkwebapp.entity.UserActions;
import com.example.courseworkwebapp.repository.UserActionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class UserActionServiceImpl implements UserActionService {

    private UserActionsRepository userActionsRepository;

    @Autowired
    public UserActionServiceImpl(UserActionsRepository userActionsRepository){
        this.userActionsRepository = userActionsRepository;
    }

    @Override
    public void savelog(String status){
        Calendar calendar = new GregorianCalendar();
        UserActions userActions = new UserActions();
        userActions.setDate(calendar.getTime().toString());
        userActions.setAction(status);
        userActionsRepository.save(userActions);
    }

}
