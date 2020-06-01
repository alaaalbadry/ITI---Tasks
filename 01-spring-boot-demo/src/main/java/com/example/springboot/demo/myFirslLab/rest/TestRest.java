package com.example.springboot.demo.myFirslLab.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestRest {
    @Value("${team.name}")
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World! From '"+ teamName+"' the time on server "+ LocalDateTime.now();
    }


}
