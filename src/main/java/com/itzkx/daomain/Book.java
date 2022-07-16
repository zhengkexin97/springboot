package com.itzkx.daomain;

import lombok.Data;

//@Data = @Getter+@Setter
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
