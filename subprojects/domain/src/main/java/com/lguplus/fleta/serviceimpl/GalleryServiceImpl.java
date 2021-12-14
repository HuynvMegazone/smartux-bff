package com.lguplus.fleta.serviceimpl;

import com.lguplus.fleta.data.dto.GalleryInfo;
import com.lguplus.fleta.data.entity.Gallery;
import com.lguplus.fleta.repository.GalleryRepository;
import com.lguplus.fleta.service.GalleryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GalleryServiceImpl implements GalleryService {

    private final GalleryRepository galleryRepository;

    public GalleryServiceImpl(@Qualifier("galleryOracleRepository") GalleryRepository galleryRepository){
        this.galleryRepository = galleryRepository;
    }

    @Override
    public List<GalleryInfo> getGalleryCateList() {
        List<GalleryInfo> ls = galleryRepository.getGalleryCateList();
        return ls;
    }

    @Override
    public Gallery getGalleryById(String galleryid) {
        Gallery g = galleryRepository.getGalleryById(galleryid);
        return g;
    }
}