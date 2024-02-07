package org.malioukis.warehousemanagement.domain.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Company extends BaseEntity{
    @Column(nullable = false)
    private String name;

    /*mappedBy = "company"
    indicates that the relationship is mapped
    by the company field in the Product entity.

    cascade = CascadeType.ALL
    if a Company entity is deleted,
    all associated Product entities will also be deleted due to cascade operations.

    orphanRemoval = true attribute specifies that if a Product entity is removed from the collection
    of products associated with a Company, it should be deleted from the database.
    This ensures that orphaned Product entities (i.e., products that are no longer associated with any company)
    are automatically removed from the database.
    */
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;
}
