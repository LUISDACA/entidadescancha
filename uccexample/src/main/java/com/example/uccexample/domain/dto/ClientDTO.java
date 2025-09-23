package com.example.uccexample.domain.dto;

public class ClientDTO {

    private Long id; // Siempre primero
    private String name;
    private String identification; // Mejor como String para no perder dígitos
    private String phone;          // Igual, String para teléfonos largos

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
