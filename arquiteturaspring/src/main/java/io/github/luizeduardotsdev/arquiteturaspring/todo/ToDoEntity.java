package io.github.luizeduardotsdev.arquiteturaspring.todo;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todo")
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private Boolean conluido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConluido() {
        return conluido;
    }

    public void setConluido(Boolean conluido) {
        this.conluido = conluido;
    }
}
