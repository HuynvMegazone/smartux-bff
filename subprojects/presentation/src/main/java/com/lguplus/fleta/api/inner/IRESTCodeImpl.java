package com.lguplus.fleta.api.inner;

import com.lguplus.fleta.basic.entity.CodeEntity;
import com.lguplus.fleta.basic.service.BasicService;
import com.lguplus.fleta.util.RequestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Api(value = "GalleryController")
@RestController
@CrossOrigin
@RequestMapping("/code")
public class IRESTCodeImpl {

    @Autowired
    private BasicService basicService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Find all Code")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Ok", response = CodeEntity.class),
            @ApiResponse(code = 303, message = "GalleryID %s is invalid", response = String.class),
            @ApiResponse(code = 311, message = "GalleryID %s already exists", response = String.class),
            @ApiResponse(code = 345, message = "Does not support status %s", response = String.class),
    })
    @RequestMapping(method = RequestMethod.GET, value = "/codelist")
    public RequestResponse findAllCodes() {
        List<CodeEntity> ls = basicService.findAll();
        if (ls != null)
            return new RequestResponse(200, "Success", ls, "");
        else
            return new RequestResponse(303, "Error", null, "Not found");
    }
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @ApiOperation(value = "Create a new role")
//    @ApiResponses({
//            @ApiResponse(code = 200, message = "Ok", response = GalleryInfo.class),
//            @ApiResponse(code = 303, message = "GalleryID %s is invalid", response = String.class),
//            @ApiResponse(code = 311, message = "GalleryID %s already exists", response = String.class),
//            @ApiResponse(code = 345, message = "Does not support status %s", response = String.class),
//    })
//    RequestResponse getGalleryCateList();
}
