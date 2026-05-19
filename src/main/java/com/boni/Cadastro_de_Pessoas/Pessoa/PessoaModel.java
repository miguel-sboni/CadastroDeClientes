package com.boni.Cadastro_de_Pessoas.Pessoa;


import com.boni.Cadastro_de_Pessoas.Pedido.PedidoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "tb_Pessoa")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String CNPJ;
    private String email;

    @OneToMany
    private List<PedidoModel> pedidos;

}
