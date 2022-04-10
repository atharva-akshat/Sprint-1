package com.womenempowerment.dao;

import com.womenempowerment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends JpaRepository<User, Integer> {

    @Query(value = "select * from users where users.user_name like ?1 and users.user_password like ?2",
            nativeQuery = true)
    User authenticateUser(String username, String oldPassword);
}
