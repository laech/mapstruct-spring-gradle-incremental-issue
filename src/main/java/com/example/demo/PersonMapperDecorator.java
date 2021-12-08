package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

abstract class PersonMapperDecorator implements PersonMapper {

  @Autowired
  @Qualifier("delegate")
  private PersonMapper delegate;

  @Override
  public PersonDto personToPersonDto(Person person) {
    PersonDto dto = delegate.personToPersonDto(person);
    dto.name += "!!";
    return dto;
  }
}
