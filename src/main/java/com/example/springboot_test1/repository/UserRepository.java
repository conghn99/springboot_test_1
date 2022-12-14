package com.example.springboot_test1.repository;

import com.example.springboot_test1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> userList = new ArrayList<>(List.of(
            new User(1, "user1", "user1@gmail.com", "0987654321", "Thành phố Hà Nội", "avatar1", "password1"),
            new User(2, "user2", "user2@gmail.com", "0912345678", "Thành phố Hồ Chí Minh", "avatar2", "password2"),
            new User(3, "user3", "user3@gmail.com", "0949948170", "Thành phố Hải Phòng", "avatar3", "password3"),
            new User(4, "user4", "user4@gmail.com", "0914342225", "Thành phố Đà Nẵng", "avatar4", "password4"),
            new User(5, "user5", "user5@gmail.com", "0912354734", "Tỉnh Thanh Hóa", "avatar5", "password5")
    ));

    public List<User> getUserList() {
        return userList;
    }
}
