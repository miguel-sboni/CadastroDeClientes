package com.boni.Cadastro_de_Pessoas.Pedido;

import com.boni.Cadastro_de_Pessoas.Item.ItemModel;
import com.boni.Cadastro_de_Pessoas.Pessoa.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_pedidos")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departamento;

    @ManyToOne
    @JoinColumn(name = "id_Pessoa")
    private PessoaModel pessoa;

    @OneToMany
    private List<ItemModel> item;
}
