package io.maddennis.grpcscuffhold.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //Read sql script and insert into database
    }
}
