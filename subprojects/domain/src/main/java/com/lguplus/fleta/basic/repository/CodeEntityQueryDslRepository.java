package com.lguplus.fleta.basic.repository;

import com.lguplus.fleta.basic.entity.CodeEntity;
import com.lguplus.fleta.basic.entity.QCodeEntity;
import com.lguplus.fleta.config.querydsl.BasicQuerydslRepositorySupport;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CodeEntityQueryDslRepository extends BasicQuerydslRepositorySupport {

    private final JPAQueryFactory basicQueryFactory;

    public CodeEntityQueryDslRepository(JPAQueryFactory basicQueryFactory) {
        super(CodeEntity.class);
        this.basicQueryFactory = basicQueryFactory;
    }

    public List<CodeEntity> findAll(){
        QCodeEntity codeEntity = QCodeEntity.codeEntity;
        return basicQueryFactory.select(Projections.fields(
                        CodeEntity.class,
                        codeEntity.code,
                        codeEntity.codeNM,
                        codeEntity.created
                ))
                .from(codeEntity).fetch();
    }
}
