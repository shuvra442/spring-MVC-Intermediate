package DoingSomething.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcController {

    @ResponseBody
    @RequestMapping(value = "/sample")
    public String simpleTest(){
        return "Hello is working";
    }

    @RequestMapping(value = "/testing")
    public String testingJsp(){
        return "hello";
    }

}
