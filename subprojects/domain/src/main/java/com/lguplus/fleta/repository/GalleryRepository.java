package com.lguplus.fleta.repository;

import com.lguplus.fleta.data.dto.GalleryInfo;
import com.lguplus.fleta.data.entity.Gallery;

import java.util.List;

public interface GalleryRepository {
    List<GalleryInfo> getGalleryCateList(String galleryid);

    Gallery getGalleryById(String galleryid);
}
