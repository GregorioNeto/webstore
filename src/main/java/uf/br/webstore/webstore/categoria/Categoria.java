package uf.br.webstore.webstore.categoria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;


    @NotBlank
    private String nome;

    @Deprecated
    public Categoria(){
    }

    public Categoria(@NotBlank String nome) {
        this.nome = nome;
    }
    
}
