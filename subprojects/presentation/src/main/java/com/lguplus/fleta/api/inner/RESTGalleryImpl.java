//package com.lguplus.fleta.api.inner;
//
//import com.lguplus.fleta.data.dto.GalleryInfo;
//import com.lguplus.fleta.data.entity.Gallery;
//import com.lguplus.fleta.exception.APIException;
//import com.lguplus.fleta.service.GalleryService;
//import com.lguplus.fleta.util.RequestResponse;
//import io.swagger.annotations.Api;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@Api(value = "GalleryController")
//@RestController
//@CrossOrigin
//@RequestMapping("/gallery")
//public class RESTGalleryImpl implements IRESTGallery{
//
//    @Autowired
//    private GalleryService galleryService;
//
//    @RequestMapping(method = RequestMethod.GET, value = "/catelist")
//    public RequestResponse getGalleryCateList() {
//        List<GalleryInfo> ls = galleryService.getGalleryCateList();
//
//        if (ls != null) {
//            return new RequestResponse(200, "Success", ls, "");
//        } else {
//            return new RequestResponse(303, "Success", null, "Not found");
//        }
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/findbyId")
//    public RequestResponse getGalleryById(@Param("galleryid") String galleryid) throws APIException {
//        RequestResponse rs;
//        GalleryInfo g = galleryService.getGalleryById(galleryid);
//        if (g != null) {
//            return new RequestResponse(200, "Success", g, "");
//        } else {
//            return new RequestResponse(303, "Success", null, "Not found");
//        }
//    }
//}
