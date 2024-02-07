package org.malioukis.warehousemanagement.domain.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Product extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private Long serialNo;

    @Column(nullable = false)
    private Integer warehouseQuantity;

    @Column
    private Double price;

    @Column(nullable = false)
    private Boolean active;

    // todo check the colDefinition default value
    @Column(nullable = false)
    private Boolean deleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "companyId")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product")
    private Supplier supplier;

    @OneToMany(mappedBy = "product")
    private List<PurchaseOrder> orders;

    @Column
    private LocalDateTime dateAdded;

    @Column
    private LocalDateTime dateUpdated;
}
