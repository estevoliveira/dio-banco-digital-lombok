package org.example;

import lombok.*;

import java.util.List;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;

}