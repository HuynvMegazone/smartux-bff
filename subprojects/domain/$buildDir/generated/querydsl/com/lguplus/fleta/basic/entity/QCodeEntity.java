package com.lguplus.fleta.basic.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCodeEntity is a Querydsl query type for CodeEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCodeEntity extends EntityPathBase<CodeEntity> {

    private static final long serialVersionUID = 1630004338L;

    public static final QCodeEntity codeEntity = new QCodeEntity("codeEntity");

    public final StringPath code = createString("code");

    public final StringPath codeNM = createString("codeNM");

    public final DateTimePath<java.util.Date> created = createDateTime("created", java.util.Date.class);

    public final StringPath createId = createString("createId");

    public final DateTimePath<java.util.Date> updated = createDateTime("updated", java.util.Date.class);

    public final StringPath updateId = createString("updateId");

    public QCodeEntity(String variable) {
        super(CodeEntity.class, forVariable(variable));
    }

    public QCodeEntity(Path<? extends CodeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCodeEntity(PathMetadata metadata) {
        super(CodeEntity.class, metadata);
    }

}

