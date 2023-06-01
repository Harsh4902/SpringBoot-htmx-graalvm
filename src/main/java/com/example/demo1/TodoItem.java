package com.example.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoItem {
  @Id
  @GeneratedValue
  private Long id;
  private String title;

  private boolean completed;
  public TodoItem(String title,
                  boolean completed) {
    this.title = title;
    this.completed = completed;
  }
}
