package org.malioukis.warehousemanagement.domain.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class User extends BaseEntity {

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String role;

    @Column
    private Boolean active;

    @Column
    private Boolean deleted;

    @Column
    private LocalDateTime dateAdded;

    @Column
    private LocalDateTime dateUpdated;
}
