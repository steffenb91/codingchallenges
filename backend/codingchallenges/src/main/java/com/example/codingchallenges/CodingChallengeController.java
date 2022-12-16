package com.example.codingchallenges;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/challenges")
public class CodingChallengeController {
  
  private final CodingChallengeRepository repository;
  private final List<CodingChallenge> codingChallenges = new ArrayList<>();

  public CodingChallengeController(CodingChallengeRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<CodingChallenge> getAllChallenges() {
    return codingChallenges;
    //return repository.findAll();
  }

  @PostMapping
  public CodingChallenge createChallenge(@RequestBody CodingChallenge challenge) {
    codingChallenges.add(challenge);
    return challenge;
    //return repository.save(challenge);
  }
}
