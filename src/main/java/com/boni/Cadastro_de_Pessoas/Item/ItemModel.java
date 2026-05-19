package com.boni.Cadastro_de_Pessoas.Item;


import com.boni.Cadastro_de_Pessoas.Pedido.PedidoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_item")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;
    private double preco;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private PedidoModel pedido;

}
