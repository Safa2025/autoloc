package com.serinity.autoloc.entities;


import com.serinity.autoloc.entities.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEmploye;
    String nom;
    String prenom ;
    String adresse ;

    @Enumerated(EnumType.STRING)
    Role role;
}
