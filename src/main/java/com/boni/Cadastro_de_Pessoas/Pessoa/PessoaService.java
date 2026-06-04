package com.boni.Cadastro_de_Pessoas.Pessoa;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    public PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<PessoaModel> listarPessoas(){
        return pessoaRepository.findAll();
    }

    public PessoaModel listarPessoasId(Long id){
        Optional<PessoaModel> pessoaPorId = pessoaRepository.findById(id);
        return pessoaPorId.orElse(null);
    }

    public PessoaModel cadastrarPessoas(PessoaModel pessoa){
        return pessoaRepository.save(pessoa);
    }


}
