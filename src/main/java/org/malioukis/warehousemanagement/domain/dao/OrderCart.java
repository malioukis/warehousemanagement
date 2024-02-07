package org.malioukis.warehousemanagement.domain.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class OrderCart extends BaseEntity {


    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;

    @Column
    private Integer quantity;

}
