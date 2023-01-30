package com.oauth.springbootoauth2authorizationserver.entity;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles",schema = "public")
public class Role {

    private Long id;
    private String role;
}
