package com.lguplus.fleta.repositoryimpl;

import com.lguplus.fleta.data.dto.GalleryInfo;
import com.lguplus.fleta.data.entity.Gallery;
import com.lguplus.fleta.repository.GalleryRepository;
import com.lguplus.fleta.util.Key.CacheKey;
import com.lguplus.fleta.util.Key.QueryKey;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GalleryOracleRepository extends GalleryRepository, JpaRepository<Gallery, String> {

    @Query(name = QueryKey.GET_GALLERY_LIST_ALBUM_KEY,
            nativeQuery = true)
    @Cacheable(value = CacheKey.AB_CATEGORY_KEY)
    @Override
    List<GalleryInfo> getGalleryCateList();

    @Query(name = QueryKey.GET_GALLERY_ALBUM_KEY,
            nativeQuery = true)
    @Cacheable(value = CacheKey.AB_CATEGORY_KEY, key = "#galleryid")
    @Override
    Gallery getGalleryById(@Param("galleryid") String galleryid);
}
