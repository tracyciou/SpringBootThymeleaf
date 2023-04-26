package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// 這裡要加的是 @Controller 註解，而不是 @RestController 註解
public class ThymeleafController {
    @GetMapping("/home")
    public String home(Model model) {
    // 返回類型一定要是 String

        Student student = new Student();
        student.setId(1);
        student.setName("Judy");

        model.addAttribute("myStudent", student);
        // 將 Java 中的 student 變數存放在 Thymeleaf 的 myStudent 變數裡
        // 將變數傳遞到 Html 頁面

        return "index";
    }

    // 跳轉頁面
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/login")
    public String login(String userName,
                        String userPassword) {

        System.out.println("userName 為： " + userName);
        System.out.println("userPassword 為： " + userPassword);

        return "login";
    }
}