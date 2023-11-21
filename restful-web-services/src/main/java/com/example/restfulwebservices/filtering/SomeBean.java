package com.example.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonFilter("SomeBeanFilter")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SomeBean {
    private String field1;
    private String field2;
    private String field3;

}
