package com.lguplus.fleta.basic.service;

import com.lguplus.fleta.basic.entity.CodeEntity;
import com.lguplus.fleta.basic.repository.CodeEntityQueryDslRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicService {
    @Autowired
    private CodeEntityQueryDslRepository codeEntityQueryDslRepository;

    public BasicService(CodeEntityQueryDslRepository codeEntityQueryDslRepository){
        this.codeEntityQueryDslRepository = codeEntityQueryDslRepository;
    }

    public List<CodeEntity> findAll(){
        return codeEntityQueryDslRepository.findAll();
    }
}
