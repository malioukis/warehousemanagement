package org.malioukis.warehousemanagement.domain.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.Objects;


/*
 * Using Lombok @Data and @EqualsAndHashCode for JPA entities is not recommended.
 * It can cause severe performance and memory consumption issues.
 * We should write those manually
 */
@Getter
@Setter
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
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

/*    @OneToMany(mappedBy = "product")
    private List<PurchaseOrder> orders;*/

    @Column
    private LocalDateTime dateAdded;

    @Column
    private LocalDateTime dateUpdated;

    public Product() {

    }

    public Product(String name, String description, Long serialNo, Integer warehouseQuantity, Double price,
                   Boolean active,
                   Boolean deleted, Company company, Supplier supplier, LocalDateTime dateAdded,
                   LocalDateTime dateUpdated) {
        this.name = name;
        this.description = description;
        this.serialNo = serialNo;
        this.warehouseQuantity = warehouseQuantity;
        this.price = price;
        this.active = active;
        this.deleted = deleted;
        this.company = company;
        this.supplier = supplier;
        this.dateAdded = dateAdded;
        this.dateUpdated = dateUpdated;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Product product = (Product) o;
        return getId() != null && Objects.equals(getId(), product.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
