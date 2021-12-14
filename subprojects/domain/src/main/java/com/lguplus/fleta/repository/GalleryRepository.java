package com.lguplus.fleta.repository;

import com.lguplus.fleta.data.dto.GalleryInfo;
import com.lguplus.fleta.data.entity.Gallery;

import java.util.List;

public interface GalleryRepository {
    List<GalleryInfo> getGalleryCateList();

    Gallery getGalleryById(String galleryid);
}
