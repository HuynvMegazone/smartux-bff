package com.lguplus.fleta.hmims.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPanelEntity is a Querydsl query type for PanelEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPanelEntity extends EntityPathBase<PanelEntity> {

    private static final long serialVersionUID = 1485503753L;

    public static final QPanelEntity panelEntity = new QPanelEntity("panelEntity");

    public final DateTimePath<java.util.Date> created = createDateTime("created", java.util.Date.class);

    public final StringPath createId = createString("createId");

    public final StringPath focusType = createString("focusType");

    public final NumberPath<Integer> ord = createNumber("ord", Integer.class);

    public final StringPath panelId = createString("panelId");

    public final StringPath panelImage = createString("panelImage");

    public final StringPath panelNM = createString("panelNM");

    public final StringPath panelUiType = createString("panelUiType");

    public final DateTimePath<java.util.Date> updated = createDateTime("updated", java.util.Date.class);

    public final StringPath updateId = createString("updateId");

    public final StringPath useYN = createString("useYN");

    public final StringPath version = createString("version");

    public QPanelEntity(String variable) {
        super(PanelEntity.class, forVariable(variable));
    }

    public QPanelEntity(Path<? extends PanelEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPanelEntity(PathMetadata metadata) {
        super(PanelEntity.class, metadata);
    }

}

