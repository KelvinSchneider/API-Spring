package br.com.senai.pessoa.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "TB_PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nome;
    String sexo;
    String telefone;
    String email;
    int idade;

}
