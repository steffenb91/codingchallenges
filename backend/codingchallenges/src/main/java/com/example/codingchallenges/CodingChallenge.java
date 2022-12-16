package com.example.codingchallenges;

import org.springframework.data.annotation.Id;

public class CodingChallenge {
  
  @Id
  private Long id;

  private String title;
  private String description;
  private String code;

  public Long getId() {
      return id;
  }

  public void setId(Long id) {
      this.id = id;
  }

  public String getTitle() {
      return title;
  }

  public String getDescription() {
      return description;
  }

  public String getCode() {
      return code;
  }

  public void setTitle(String title) {
      this.title = title;
  }

  public void setDescription(String description) {
      this.description = description;
  }

  public void setCode(String code) {
      this.code = code;
  }
}


