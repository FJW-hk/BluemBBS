package BluemForum.web;

import BluemForum.service.UserService;
import BluemForum.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户注册，待完善
     * @param request
     * @return
     */
    @RequestMapping(value="/register",method = RequestMethod.POST)
    @ResponseBody
    private Map<String ,Object> doRegister(HttpServletRequest request){
        Map<String ,Object> modelMap =new HashMap<String, Object>();
        String username = HttpServletRequestUtil.getString(request, "username");
        String password = HttpServletRequestUtil.getString(request, "password");

        if(username!=null&&password!=null){
            modelMap.put("success", true);
            modelMap.put("msg","注册成功");
        }else {
            modelMap.put("success", false);
            modelMap.put("msg","注册失败");
        }
        return modelMap;
    }

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    private Map<String ,Object> loginUser(HttpServletRequest request){
        Map<String,Object> modelMap =new HashMap<String, Object>();
        String username = HttpServletRequestUtil.getString(request, "username");
        String password = HttpServletRequestUtil.getString(request, "password");
        if(username!=null&&password!=null){
            modelMap.put("success", true);
            modelMap.put("msg","登录成功");
        }else {
            modelMap.put("success", false);
            modelMap.put("msg","登录失败");
        }
        return modelMap;
    }



}
