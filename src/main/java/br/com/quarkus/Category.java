package br.com.quarkus;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class Category extends PanacheEntity {

    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> listCategories() {
        return listAll();
    }
}
