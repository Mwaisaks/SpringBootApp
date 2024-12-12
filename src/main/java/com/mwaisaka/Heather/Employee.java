package com.mwaisaka.Heather;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
  public Employee(String name, String email, int phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  private String name;
  private String email;
  private int phoneNumber;

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phoneNumber=" + phoneNumber +
            '}';
  }
}



