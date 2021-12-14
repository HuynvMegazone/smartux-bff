package com.lguplus.fleta.service;

import com.lguplus.fleta.data.dto.GalleryInfo;
import com.lguplus.fleta.data.entity.Gallery;

import java.util.List;

public interface GalleryService {
    List<GalleryInfo> getGalleryCateList();

    Gallery getGalleryById(String galleryid);
}

