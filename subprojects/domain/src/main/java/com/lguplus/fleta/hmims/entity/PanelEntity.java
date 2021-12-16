package com.lguplus.fleta.hmims.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PT_UX_CODE", schema = "SMARTUX")
public class PanelEntity {

    @Id
    @Column(name = "PANNEL_ID")
    private String panelId;

    @Column(name = "PANNEL_NM")
    private  String panelNM;

    @Column(name = "USE_YN")
    private String useYN;

    @Column(name = "VERSION")
    private String version;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "UPDATED")
    private Date updated;

    @Column(name = "CREATE_ID")
    private String createId;

    @Column(name = "UPDATE_ID")
    private String updateId;

    @Column(name = "PANEL_UI_TYPE")
    private String panelUiType;

    @Column(name = "PANEL_IMAGE")
    private String panelImage;

    @Column(name = "FOCUS_TYPE")
    private String focusType;

    @Column(name = "ORD")
    private int ord;
}
