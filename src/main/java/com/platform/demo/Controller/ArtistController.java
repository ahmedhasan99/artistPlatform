package com.platform.demo.Controller;

import com.platform.demo.config.CustomResponse;
import com.platform.demo.model.UserLogin;
import com.platform.demo.service.ArtistService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ArtistController {
    private ArtistService artistService;
    @GetMapping("/login")

    public CustomResponse login (@RequestParam UserLogin userLogin){
    return artistService.login(userLogin.getName() , userLogin.getPassword());
    }
}
