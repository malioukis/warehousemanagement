package org.malioukis.warehousemanagement.domain.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


/*
 * @NoRepositoryBean This annotation is used to indicate that the interface is not intended
 * to be instantiated directly as a Spring Data repository.
 * Instead, it serves as a base interface for other repository interfaces to inherit from.
 * Repositories annotated with @NoRepositoryBean are not scanned during Spring Data repository scanning.
 * */

/*
 * The JpaRepository interface is a generic interface provided by Spring Data JPA
 * to define common CRUD operations for a JPA entity.
 * T: Represents the type of the entity managed by this repository.
 * CompId: Represents the type of the primary key (ID) of the entity.
 * */
@NoRepositoryBean
public interface BaseRepo<T> extends JpaRepository<T, Long> {
}
