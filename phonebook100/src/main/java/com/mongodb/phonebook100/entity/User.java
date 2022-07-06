package com.mongodb.phonebook100.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data  //lombok
@AllArgsConstructor
@NoArgsConstructor
@Document //to create user collection ->table

public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String telephoneNumber;

}
