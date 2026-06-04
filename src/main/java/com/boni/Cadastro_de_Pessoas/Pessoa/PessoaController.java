package com.boni.Cadastro_de_Pessoas.Pessoa;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }


    @GetMapping("/Pessoas")
    public List<PessoaModel> listarPessoas(){
       return pessoaService.listarPessoas();
    }

    @GetMapping("/Pessoas/{id}")
    public PessoaModel buscarPessoaPorId(@PathVariable Long id){
        return pessoaService.listarPessoasId(id);
    }

    @PostMapping("/CadastrarPessoas")
    public PessoaModel cadastrarPessoas(@RequestBody PessoaModel pessoa){
        return pessoaService.cadastrarPessoas(pessoa);
    }
}
