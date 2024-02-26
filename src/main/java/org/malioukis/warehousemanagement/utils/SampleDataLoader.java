package org.malioukis.warehousemanagement.utils;

import com.github.javafaker.Faker;
import org.malioukis.warehousemanagement.domain.dao.Company;
import org.malioukis.warehousemanagement.domain.dao.Product;
import org.malioukis.warehousemanagement.domain.dao.Supplier;
import org.malioukis.warehousemanagement.domain.repo.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class SampleDataLoader implements CommandLineRunner {

    private final ProductRepo productRepo;

    private final Faker faker;

    public SampleDataLoader(ProductRepo productRepo, Faker faker) {
        this.productRepo = productRepo;
        this.faker = faker;
    }

    public LocalDateTime now() {
        // Get the current system time as a Date
        Date currentDate = new Date();

        // Convert the Date to LocalDateTime
        return currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    @Override
    public void run(String... args) throws Exception {



        List<Product> productsToImport = IntStream.rangeClosed(1, 500)
                .mapToObj(i -> new Product(
                        faker.commerce().productName(),
                        faker.commerce().material(),
                        faker.number().randomNumber(),
                        faker.number().numberBetween(1,50),
                        faker.number().randomDouble(2,0,1000),
                        faker.bool().bool(),faker.bool().bool(),
                        new Company(

                        ),new Supplier(

                        ),
                        faker.company().name(),
                        faker.company().name(),
                        faker.date().past(2, 365, TimeUnit.DAYS).toInstant(),
                        ZoneId.systemDefault())
                       ))
                .toList();
    }
}
