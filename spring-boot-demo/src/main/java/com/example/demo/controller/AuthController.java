//package com.example.demo.controller;
//
//import com.example.demo.model.User;
//import com.example.demo.security.JwtUtil;
//import com.example.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/auth")
//public class AuthController {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @PostMapping("/login")
//    public Map<String, String> login(@RequestBody User user) {
//        User authenticatedUser = userService.getUserByUsername(user.getUsername());
//
//        if (authenticatedUser != null && authenticatedUser.getPassword().equals(user.getPassword())) {
//            String token = jwtUtil.generateToken(authenticatedUser.getUsername());
//
//            Map<String, String> response = new HashMap<>();
//            response.put("token", token);
//            return response;
//        }
//
//        throw new RuntimeException("Invalid credentials");
//    }
//}