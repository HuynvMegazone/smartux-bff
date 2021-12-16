package com.lguplus.fleta.config.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
        entityManagerFactoryRef = "hmimsEntityManagerFactory",
        transactionManagerRef = "hmimsTransactionManager",
        basePackages = {"com.lguplus.fleta.hmims.repository"}
)
public class HmimsDatasourceConfig {
    @Bean
    @ConfigurationProperties("hmims.datasource")
    public DataSourceProperties hmimsDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("hmims.datasource.configuration")
    public DataSource hmimsDataSource(@Qualifier("hmimsDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean hmimsEntityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                              @Qualifier("hmimsDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.lguplus.fleta.hmims.entity")
                .persistenceUnit("hmimsEntityManager")
                .build();
    }

    @Bean
    public PlatformTransactionManager hmimsTransactionManager(@Qualifier("hmimsEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
