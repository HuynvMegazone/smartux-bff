package com.lguplus.fleta.api.inner;

import com.lguplus.fleta.data.dto.GalleryInfo;
import com.lguplus.fleta.data.entity.Gallery;
import com.lguplus.fleta.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Api(value = "GalleryController")
@RestController
@CrossOrigin
public class GalleryController {

    @Autowired
    private GalleryService galleryService;

    @RequestMapping(method = RequestMethod.GET, value = "/gallery/catelist")
    public ResponseEntity<List> getGalleryCateList(@Param("galleryid") String galleryid) {
        List<GalleryInfo> ls = galleryService.getGalleryCateList(galleryid);

        if (ls != null) {
            return new ResponseEntity<>(ls, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/gallery/findbyId")
    public ResponseEntity<Object> getGalleryById(@Param("galleryid") String galleryid) {
        Gallery g = galleryService.getGalleryById(galleryid);
        if (g != null) {
            return new ResponseEntity<>(g, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
