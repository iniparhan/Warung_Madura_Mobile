//package com.example.demo.security;
//
//import com.example.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
//@Component
//public class JwtRequestFilter extends OncePerRequestFilter {
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Autowired
//    private UserService userService;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, javax.servlet.ServletResponse response, FilterChain chain)
//            throws ServletException, IOException {
//
//        String jwtToken = request.getHeader("Authorization");
//
//        if (jwtToken != null && jwtToken.startsWith("Bearer ")) {
//            String username = jwtUtil.extractUsername(jwtToken.substring(7));
//
//            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//                if (jwtUtil.validateToken(jwtToken, username)) {
//                    // You can add an authentication object here if needed
//                }
//            }
//        }
//
//        chain.doFilter(request, response);
//    }
//}