package org.malioukis.warehousemanagement.domain.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Supplier extends BaseEntity {

    @Column
    private String name;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL,
                fetch = FetchType.LAZY , orphanRemoval = true)
    private List<Product> products;
}
