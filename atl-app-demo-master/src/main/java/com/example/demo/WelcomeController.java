package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Controller
public class WelcomeController {

    private UsersService usersService;
    @Autowired private ApplicationContext applicationContext;

    @PostConstruct
    public void inited() {
        usersService = (UsersService) applicationContext.getBean("usersService");
        Assert.notNull(usersService);
    }

    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        List<User> users = usersService.getUsers();
        model.put("users", users);
        return "main";
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@RequestParam(value = "newUserName") String userName ) {
        usersService.addUser(userName);
        return "forward:/";
    }

    @RequestMapping(value = "/removeUser")
    public String removeUser(@RequestParam(value = "userId") String userId ) {
        usersService.removeUser(Integer.parseInt(userId));
        return "forward:/";
    }
}
