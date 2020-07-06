package com.auth0.example;

import com.auth0.SessionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
public class LandingPageController {



    @RequestMapping(value = "/test", method = RequestMethod.GET)
    protected String home(final Map<String, Object> model, final HttpServletRequest req) {

        return "test";
    }
}
