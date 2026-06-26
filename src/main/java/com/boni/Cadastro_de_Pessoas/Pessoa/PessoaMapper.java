package com.boni.Cadastro_de_Pessoas.Pessoa;

import org.springframework.stereotype.Component;

@Component
public class PessoaMapper {

    public PessoaModel map(PessoaDTO pessoaDTO) {

        PessoaModel pessoa = new PessoaModel();
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setEmail(pessoaDTO.getEmail());
        pessoa.setCNPJ(pessoaDTO.getCNPJ());

        return pessoa;
    }

    public PessoaDTO map(PessoaModel pessoaModel) {
        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setNome(pessoaModel.getNome());
        pessoaDTO.setEmail(pessoaModel.getEmail());
        pessoaDTO.setCNPJ(pessoaModel.getCNPJ());

        return pessoaDTO;
    }
}



