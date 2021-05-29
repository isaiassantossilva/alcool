package com.aa.core.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Client {
    private String id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime birthDay;
    private String cpf;
}