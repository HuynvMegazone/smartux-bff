package com.lguplus.fleta.config.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "basicEntityManagerFactory",
        transactionManagerRef = "basicTransactionManager",
        basePackages = {"com.lguplus.fleta.basic.repository"}
)
public class BasicDataSourceConfig {
    @Primary
    @Bean
    @ConfigurationProperties("basic.datasource")
    public DataSourceProperties basicDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean
    @ConfigurationProperties("basic.datasource.configuration")
    public DataSource basicDataSource(@Qualifier("basicDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean basicEntityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                              @Qualifier("basicDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.lguplus.fleta.basic.entity")
                .persistenceUnit("basicEntityManager")
                .build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager basicTransactionManager(@Qualifier("basicEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
