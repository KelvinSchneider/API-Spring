package br.com.senai.pessoa.resources;

import br.com.senai.pessoa.model.Pessoa;
import br.com.senai.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/psin") // mapear
@CrossOrigin(value = "*")
public class PessoaResources {

    @Autowired
    PessoaRepository pessoaRepository;

    // GET
    @GetMapping("/pessoas")
    public List<Pessoa> listAllPessoas(){
        return pessoaRepository.findAll();
    }

    // POST
    @PostMapping("/pessoa")
    public Pessoa addPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    // GET (por id)
    @GetMapping("/pessoa/{id}")
    public Pessoa listPessoaById(@PathVariable(value = "id") int id){
        return pessoaRepository.findById(id);
    }

    //PUT
    @PutMapping("/pessoa")
    public Pessoa atualizaDadosDaPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    //DELETE
    @DeleteMapping("/pessoa")
    public void deletePessoa(@RequestBody Pessoa pessoa){
        pessoaRepository.delete(pessoa);
    }
}
