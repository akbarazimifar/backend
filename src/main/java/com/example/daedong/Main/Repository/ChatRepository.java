package com.example.daedong.Main.Repository;

import com.example.daedong.Dto.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<User, String> {
}
