package com.pruebaclean.demoCl.auth.domain.repository;

public class RoleDsRequestModel {

    private String id;
    private String name;

    public RoleDsRequestModel() {

    }

    public RoleDsRequestModel(String id, String name) {
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
