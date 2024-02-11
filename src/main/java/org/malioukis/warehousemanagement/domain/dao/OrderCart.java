package org.malioukis.warehousemanagement.domain.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class OrderCart extends BaseEntity {


    @OneToOne(fetch = FetchType.LAZY)
    private Product product;

    @Column
    private Integer quantity;

}
