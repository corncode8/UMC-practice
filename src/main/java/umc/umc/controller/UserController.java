package umc.umc.controller;
import umc.umc.model.User;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private User user;

    private umc.umc.repository.userRepository userRepository;

    @GetMapping({"/get", ""})
    public String get() {
        return "getmapping";
    }


    @PostMapping("/post")
    public String post(@RequestBody User user) {
        System.out.println("postmapping 성공");
        return "Username : " + user.getUsername() + ", email : " + user.getEmail() + ", phone : " + user.getPhone();
    }

    @PutMapping("/put")
    public String put() {
        return "putMethod";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "deleteMethod";
    }

    @PostMapping("/join")
    public void join(User user) {
        System.out.println(user);
        userRepository.save(user);
    }

    @GetMapping("/user/info/{id}")
    public void getUser(@PathVariable("id") Integer id, User user) {
        if (id == userRepository.findById(id).getId()) {
            System.out.println(user);
        }
    }

    @GetMapping("/user/modify/{id}")
    public void userModify(@PathVariable("id") Integer id, String username, String password, String email, String phone) {
        if (id == userRepository.findById(id).getId()) {
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            user.setPhone(phone);
        }
        System.out.println(user);
    }

    @GetMapping("/user/delete/{id}")
    public void userDelete(@PathVariable("id") Integer id) {
        if (id == userRepository.findById(id).getId()) {
           userRepository.deleteByUser(id);
        }
    }


}
