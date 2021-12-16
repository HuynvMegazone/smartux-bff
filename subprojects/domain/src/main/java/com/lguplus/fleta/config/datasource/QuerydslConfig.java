package com.lguplus.fleta.config.datasource;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class QuerydslConfig {
    @PersistenceContext(unitName = "basicEntityManager")
    EntityManager entityManager1;

    @PersistenceContext(unitName = "hmimsEntityManager")
    EntityManager entityManager2;

    @Bean
    public JPAQueryFactory basicQueryFactory() {
        return new JPAQueryFactory(entityManager1);
    }

    @Bean(name="hmimsQueryFactory")
    public JPAQueryFactory hmimsQueryFactory() {
        return new JPAQueryFactory(entityManager2);
    }
}
