package com.platform.demo.service;

import com.platform.demo.config.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class ArtistService {

    public CustomResponse login(String username , String password ){

return new CustomResponse(HttpStatus.OK , "Login Done"  );
    }
}


