package com.example.demo.controller;

import com.example.demo.config.JwtUtil;
import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserService userService,
                          JwtUtil jwtUtil,
                          PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {

        User user = userService.findByEmail(request.getEmail());

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("invalid credentials");
        }

        String token = jwtUtil.generateToken(
                user.getId(),
                user.getEmail(),
                user.getRole()
        );

        return new AuthResponse(
                token,
                user.getId(),
                user.getEmail(),
                user.getRole()
        );
    }
}






























// package com.example.demo.controller;

// import com.example.demo.config.JwtUtil;
// import com.example.demo.model.User;
// import com.example.demo.service.UserService;
// import com.example.demo.util.PasswordUtil;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.HashMap;
// import java.util.Map;

// @RestController
// @RequestMapping("/auth")
// @Tag(name = "Authentication")
// public class AuthController {
//     private final UserService userService;
//     private final JwtUtil jwtUtil;

//     public AuthController(UserService userService, JwtUtil jwtUtil) {
//         this.userService = userService;
//         this.jwtUtil = jwtUtil;
//     }

//     @PostMapping("/register")
//     public ResponseEntity<?> register(@RequestBody User user) {
//         try {
//             User registered = userService.register(user);
//             return ResponseEntity.ok(registered);
//         } catch (Exception e) {
//             return ResponseEntity.badRequest().body(e.getMessage());
//         }
//     }

//     @PostMapping("/login")
//     public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
//         try {
//             String email = credentials.get("email");
//             String password = credentials.get("password");
            
//             User user = userService.findByEmail(email);
//             if (!PasswordUtil.verifyPassword(password, user.getPassword())) {
//                 return ResponseEntity.status(401).body("Invalid credentials");
//             }
            
//             String token = jwtUtil.generateToken(user.getId(), user.getEmail(), user.getRole());
//             Map<String, Object> response = new HashMap<>();
//             response.put("token", token);
//             response.put("userId", user.getId());
//             response.put("email", user.getEmail());
//             response.put("role", user.getRole());
            
//             return ResponseEntity.ok(response);
//         } catch (Exception e) {
//             return ResponseEntity.status(401).body("Unauthorized");
//         }
//     }
// }