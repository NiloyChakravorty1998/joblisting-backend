package com.io.rest.joblisting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class ApiHealthCheck {

    @GetMapping("")
    public String apiHealth()
    {
        return "<html>\n" +
                "<head>\n" +
                "    <style>\n" +
                "        .center {\n" +
                "            display: flex;\n" +
                "            justify-content: center;\n" +
                "            align-items: center;\n" +
                "            height: 100vh; /* Adjust this value to center vertically */\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"center\">\n" +
                "        <h2>Back-end is up and running!</h2>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>\n" +
                "In this code, I've added a <div> element with the class \"center\" that uses flexbox to center its content horizontally and vertically on the page. The justify-content: center; and align-items: center; properties ensure the text is centered both horizontally and vertically within the <div>.\n" +
                "\n" +
                "You can adjust the height property of the .center class to control how much vertical space the centered content occupies on the page. Setting it to 100vh will make the centered content fill the entire viewport height.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n";
    }
}
