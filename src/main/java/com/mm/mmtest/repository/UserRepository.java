package com.mm.mmtest.repository;

import com.mm.mmtest.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{ age: { $gte : 18 } }")
    public List<User> findUserOver18();
}