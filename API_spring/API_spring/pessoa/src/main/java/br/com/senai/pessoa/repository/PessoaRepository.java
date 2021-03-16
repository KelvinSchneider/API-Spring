package br.com.senai.pessoa.repository;

import br.com.senai.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    //método para buscar pessoa por um ID especifico
    Pessoa findById(int id);

}
