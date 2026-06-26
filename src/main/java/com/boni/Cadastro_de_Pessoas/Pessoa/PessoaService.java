package com.boni.Cadastro_de_Pessoas.Pessoa;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    public PessoaRepository pessoaRepository;
    public PessoaMapper pessoaMapper;

    public PessoaService(PessoaRepository pessoaRepository, PessoaMapper pessoaMapper) {
        this.pessoaRepository = pessoaRepository;
        this.pessoaMapper = pessoaMapper;
    }

    public List<PessoaDTO> listarPessoas(){
        List<PessoaModel> pessoa = pessoaRepository.findAll();
        return pessoa.stream()
                .map(pessoaMapper::map)
                .collect(Collectors.toList());
    }

    public PessoaDTO listarPessoasId(Long id){
        Optional<PessoaModel> pessoaPorId = pessoaRepository.findById(id);
        return pessoaPorId.map(pessoaMapper::map).orElse(null);
    }

    public PessoaDTO cadastrarPessoas(PessoaDTO pessoa){
        PessoaModel pessoaModel = pessoaMapper.map(pessoa);
        pessoaRepository.save(pessoaModel);
        return pessoaMapper.map(pessoaModel);
    }

    public void deletarPessoas(Long id){
        pessoaRepository.deleteById(id);
    }

    public PessoaDTO atualizarPessoas(Long id, PessoaDTO pessoa){
        Optional<PessoaModel> pessoaPorId = pessoaRepository.findById(id);
        if(pessoaPorId.isPresent()){
        PessoaModel pessoaAtualizado = pessoaMapper.map(pessoa);
        pessoaAtualizado.setId(id);
        PessoaModel pessoaSalva = pessoaRepository.save(pessoaAtualizado);
        return pessoaMapper.map(pessoaSalva);
        }
        return null;
    }


}
