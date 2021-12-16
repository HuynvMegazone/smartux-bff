package com.lguplus.fleta.basic.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PT_UX_CODE", schema = "SMARTUX")
public class CodeEntity {

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "CODE_NM")
    private  String codeNM;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "UPDATED")
    private Date updated;

    @Column(name = "CREATE_ID")
    private String createId;

    @Column(name = "UPDATE_ID")
    private String updateId;
}
