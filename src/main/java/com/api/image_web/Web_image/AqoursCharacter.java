package com.api.image_web.Web_image;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AqoursCharacter {
    @GetMapping("/ShowImage")
    public String showImage(@RequestParam(value="nama") String nama, @RequestParam(value="clothes") String clothes, Model model) {
        String namaImage="";

        switch (nama) {
            case "chika-chan" -> {
                switch (clothes) {
                    case "winter-uniform" -> namaImage = "/Image/Chika-chan (Winter Uniform).png";
                    case "summer-uniform" -> namaImage = "/Image/Chika-chan (Summer Uniform).png";
                    case "practice-winter" -> namaImage = "/Image/Chika-chan (Winter Practice).png";
                    case "practice-summer" -> namaImage = "/Image/Chika-chan (Summer Practice).png";
                    case "private-winter" -> namaImage = "/Image/Chika-chan (Private Winter Clothes).png";
                    case "private-summer" -> namaImage = "/Image/Chika-chan (Private Summer Clothes).png";
                    case "nightwear" -> namaImage = "/Image/Chika-chan (nightwear).png";
                    case "idol-uniform" -> namaImage = "/Image/Chika-chan (Idol Uniform).png";
                }
            }

            case "you-chan" -> {
                switch (clothes) {
                    case "winter-uniform" -> namaImage = "/Image/You-chan (Winter Uniform).png";
                    case "summer-uniform" -> namaImage = "/Image/You-chan (Summer Uniform).png";
                    case "practice-winter" -> namaImage = "/Image/You-chan (Winter Practice).png";
                    case "practice-summer" -> namaImage = "/Image/You-chan (Summer Practice).png";
                    case "private-winter" -> namaImage = "/Image/You-chan (Private Winter Clothes).png";
                    case "private-summer" -> namaImage = "/Image/You-chan (Private Summer Clothes).png";
                    case "nightwear" -> namaImage = "/Image/You-chan (nightwear).png";
                    case "idol-uniform" -> namaImage = "/Image/You-chan (Idol Uniform).png";
                }
            }

            case "riko-chan" -> {
                switch (clothes) {
                    case "winter-uniform" -> namaImage = "/Image/Riko-chan (Winter Uniform).png";
                    case "summer-uniform" -> namaImage = "/Image/Riko-chan (Summer Uniform).png";
                    case "practice-winter" -> namaImage = "/Image/Riko-chan (Winter Practice).png";
                    case "practice-summer" -> namaImage = "/Image/Riko-chan (Summer Practice).png";
                    case "private-winter" -> namaImage = "/Image/Riko-chan (Private Winter Clothes).png";
                    case "private-summer" -> namaImage = "/Image/Riko-chan (Private Summer Clothes).png";
                    case "nightwear" -> namaImage = "/Image/Riko-chan (nightwear).png";
                    case "idol-uniform" -> namaImage = "/Image/Riko-chan (Idol Uniform).png";
                }
            }

            case "hanamaru-chan" -> {
                switch (clothes) {
                    case "winter-uniform" -> namaImage = "/Image/Hanamaru-chan (Winter Uniform).png";
                    case "summer-uniform" -> namaImage = "/Image/Hanamaru-chan (Summer Uniform).png";
                    case "practice-winter" -> namaImage = "/Image/Hanamaru-chan (Winter Practice).png";
                    case "practice-summer" -> namaImage = "/Image/Hanamaru-chan (Summer Practice).png";
                    case "private-winter" -> namaImage = "/Image/Hanamaru-chan (Private Winter Clothes).png";
                    case "private-summer" -> namaImage = "/Image/Hanamaru-chan (Private Summer Clothes).png";
                    case "nightwear" -> namaImage = "/Image/Hanamaru-chan (nightwear).png";
                    case "idol-uniform" -> namaImage = "/Image/Hanamaru-chan (Idol Uniform).png";
                }
            }

            case "ruby-chan" -> {
                switch (clothes) {
                    case "winter-uniform" -> namaImage = "/Image/Ruby-chan (Winter Uniform).png";
                    case "summer-uniform" -> namaImage = "/Image/Ruby-chan (Summer Uniform).png";
                    case "practice-winter" -> namaImage = "/Image/Ruby-chan (Winter Practice).png";
                    case "practice-summer" -> namaImage = "/Image/Ruby-chan (Summer Practice).png";
                    case "private-winter" -> namaImage = "/Image/Ruby-chan (Private Winter Clothes).png";
                    case "private-summer" -> namaImage = "/Image/Ruby-chan (Private Summer Clothes).png";
                    case "nightwear" -> namaImage = "/Image/Ruby-chan (nightwear).png";
                    case "idol-uniform" -> namaImage = "/Image/Ruby-chan (Idol Uniform).png";
                }
            }

            case "yoshiko-chan" -> {
                switch (clothes) {
                    case "winter-uniform" -> namaImage = "/Image/Yoshiko-chan (Winter Uniform).png";
                    case "summer-uniform" -> namaImage = "/Image/Yoshiko-chan (Summer Uniform).png";
                    case "practice-winter" -> namaImage = "/Image/Yoshiko-chan (Winter Practice).png";
                    case "practice-summer" -> namaImage = "/Image/Yoshiko-chan (Summer Practice).png";
                    case "private-winter" -> namaImage = "/Image/Yoshiko-chan (Private Winter Clothes).png";
                    case "private-summer" -> namaImage = "/Image/Yoshiko-chan (Private Summer Clothes).png";
                    case "nightwear" -> namaImage = "/Image/Yoshiko-chan (nightwear).png";
                    case "idol-uniform" -> namaImage = "/Image/Yoshiko-chan (Idol Uniform).png";
                }
            }
        }

        model.addAttribute("nama", nama);
        model.addAttribute("namaImage", namaImage);

        return "hasilGambar";
    }
}
