package com.zh.web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.zh.model.User;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Scope("prototype")
public class UserAction implements Action, ModelDriven<User> {

    @Autowired
    private UserService userService;
    private User user = new User();
    private List<User> list;

    public String login(){
        System.out.println("进入login"+user);
        User login = userService.login(user);

        if (login != null){
            return "findAll";
        }else {
            return "index";
        }

    }

    public String findAll(){
        System.out.println("进入findAction");
        list = userService.findAll();
        System.out.println(list);
        return "main";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        return null;
    }

    @Override
    public User getModel() {
        return user;
    }
}
