package com.helixz.docker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chamith
 */
@RestController
public class DockerDemoController {

    @GetMapping("test")
    public String testDemo(){
        return "Docker App Running....!";
    }
}
