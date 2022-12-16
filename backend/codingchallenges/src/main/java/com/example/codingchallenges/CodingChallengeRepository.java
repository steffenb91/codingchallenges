package com.example.codingchallenges;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodingChallengeRepository extends MongoRepository<CodingChallenge, String> {
  
}
