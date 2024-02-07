package org.malioukis.warehousemanagement.domain.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseEntity implements EntityWithLongId, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    protected Long id;

    /*public BaseEntity setId(Number id) {
        this.id = id != null ? id.longValue() : null;
        return this;
    }*/

    public BaseEntity setId(Long id) {
        this.id = id;
        return this;
    }
}