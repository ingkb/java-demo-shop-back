package com.pruebaclean.demoCl.auth.infraestructure.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class RoleDataMapper {
    @Id
    private String id;

    private String name;

    public RoleDataMapper() {

    }

    public RoleDataMapper(String id,String name) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}