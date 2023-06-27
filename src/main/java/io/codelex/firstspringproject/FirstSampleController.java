package io.codelex.firstspringproject;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstSampleController {

    private int personRequestCount;

    @GetMapping("/text")
    public String getText(){

        return "============ LOVE IS IN THE AIR =============";
    }

    @GetMapping("/dice")
    public String getNumber() {
        double randomValue = Math.random() * 5;
        long rand =  Math.round(randomValue)+1;
        return "Jūs uzmetāt " + rand;
    }

    @GetMapping("/multiply")
    public int multiplyByTen(@RequestParam("base") int base) {
        return base * 10;
    }

}

