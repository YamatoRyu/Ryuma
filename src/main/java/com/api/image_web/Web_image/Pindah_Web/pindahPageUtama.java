package com.api.image_web.Web_image.Pindah_Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pindahPageUtama {
    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
}
