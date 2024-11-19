package org.example.sqlitebasicapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER")
public class User {
    @Id
//    @GeneratedValue
    @Column
    Long id;

    @Column
    String name;

    @Column
    Boolean isActive;
}
