package dev.naman.productservicettsevening.clients.authenticationclient.dtos;

import dev.naman.productservicettsevening.models.BaseModel;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Role extends BaseModel {
    private String name;

//    private List<User> users
}
