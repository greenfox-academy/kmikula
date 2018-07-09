package com.greenfoxacademy.rest.models;

import java.time.LocalDateTime;

//@Entity
public class Log {

//    @Id
//    @GeneratedValue
    private Long id;

    private LocalDateTime createdAt;
    private String endpoint;
    private String data;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Log() {
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
