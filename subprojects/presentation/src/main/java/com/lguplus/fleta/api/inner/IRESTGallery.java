package com.lguplus.fleta.api.inner;

import com.lguplus.fleta.data.dto.GalleryInfo;
import com.lguplus.fleta.util.RequestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Api("Gallery")
@Path("/gallery")
public interface IRESTGallery {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Create a new role")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Ok", response = GalleryInfo.class),
            @ApiResponse(code = 303, message = "GalleryID %s is invalid", response = String.class),
            @ApiResponse(code = 311, message = "GalleryID %s already exists", response = String.class),
            @ApiResponse(code = 345, message = "Does not support status %s", response = String.class),
    })
    RequestResponse getGalleryCateList();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Create a new role")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Ok", response = GalleryInfo.class),
            @ApiResponse(code = 303, message = "GalleryID %s is invalid", response = String.class),
            @ApiResponse(code = 311, message = "GalleryID %s already exists", response = String.class),
            @ApiResponse(code = 345, message = "Does not support status %s", response = String.class),
    })
    RequestResponse getGalleryById(@Param("galleryid") String galleryid);
}
