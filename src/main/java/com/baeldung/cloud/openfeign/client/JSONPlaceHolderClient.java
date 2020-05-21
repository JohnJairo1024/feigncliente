package com.baeldung.cloud.openfeign.client;

import com.baeldung.cloud.openfeign.config.ClientConfiguration;
import com.baeldung.cloud.openfeign.hystrix.JSONPlaceHolderFallback;
import com.baeldung.cloud.openfeign.model.ConsultaMatriculaResponse;
import com.baeldung.cloud.openfeign.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "jplaceholder",
        //url = "https://jsonplaceholder.typicode.com/",
        url = "http://pruebasruesapi.rues.org.co/api/consultasRUES",
        configuration = ClientConfiguration.class,
        fallback = JSONPlaceHolderFallback.class)
public interface JSONPlaceHolderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Post> getPosts();

    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
    Post getPostById(@PathVariable("postId") Long postId);

    @RequestMapping(method = RequestMethod.POST, value = "/ConsultaMatricula")
    ConsultaMatriculaResponse getMatriculaResponses(
            @RequestParam(value = "usuario") String usuario,
            @RequestParam(value = "codCam") String codCam,
            @RequestParam(value = "mat") String mat
    );

}
