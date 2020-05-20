package com.baeldung.cloud.openfeign.service;

import com.baeldung.cloud.openfeign.client.JSONPlaceHolderClient;
import com.baeldung.cloud.openfeign.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JSONPlaceHolderService {


    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;


    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }

    public Post getPostById(Long id) {
        return jsonPlaceHolderClient.getPostById(id);
    }
}
