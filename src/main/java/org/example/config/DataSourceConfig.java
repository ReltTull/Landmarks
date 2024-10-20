package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import java.util.logging.Logger;

@Configuration
public class DataSourceConfig {

    private static final Logger logger = Logger.getLogger(DataSourceConfig.class.getName());
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5433/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("1234");
        logger.info("DataSource set up complete");
        return dataSource;
    }
}
