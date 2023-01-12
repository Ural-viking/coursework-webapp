package com.example.courseworkwebapp.repository;

import com.example.courseworkwebapp.entity.UserActions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActionsRepository extends JpaRepository<UserActions,Long> {
}
