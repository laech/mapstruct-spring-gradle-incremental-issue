package com.example.demo;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(PersonMapperDecorator.class)
interface PersonMapper {

  PersonDto personToPersonDto(Person person);

}
