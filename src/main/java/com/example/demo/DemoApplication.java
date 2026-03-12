
// src/main/java/com/example/demo/DemoApplication.java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Đây là các dòng import đầy đủ bạn cần:
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Thêm cái này để Spring biết class này có chứa API
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // Thêm hàm này để khi vào trang chủ nó hiện chữ
    @GetMapping("/")
    public String hello() {
        return "Chào bạn! API này chạy từ iPhone của bạn thông qua Codespaces nhé!";
    }
}
