package cn.itcast.demo01;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author admin
 * @date 2018/7/9
 */
@RequestMapping("/user")
@ResponseBody
public class getlogin {
    public String showUser(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        System.out.println(userDetails);
        return userDetails.toString();
    }


}
