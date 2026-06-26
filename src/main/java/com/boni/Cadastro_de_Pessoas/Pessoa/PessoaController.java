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
    public List<PessoaDTO> listarPessoas(){
       return pessoaService.listarPessoas();
    }

    @GetMapping("/Pessoas/{id}")
    public PessoaDTO buscarPessoaPorId(@PathVariable Long id){
        return pessoaService.listarPessoasId(id);
    }

    @PostMapping("/CadastrarPessoas")
    public PessoaDTO cadastrarPessoas(@RequestBody PessoaDTO pessoa){
        return pessoaService.cadastrarPessoas(pessoa);
    }

    @DeleteMapping("/Deletar/{id}")
    public void deletarPessoas(@PathVariable Long id){
        pessoaService.deletarPessoas(id);
    }

    @PutMapping("/Atualizar/{id}")
    public PessoaDTO atualizarPessoas(@PathVariable Long id, @RequestBody PessoaDTO pessoa){
        return pessoaService.atualizarPessoas(id, pessoa);
    }
}
