package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Hello Controller 클래스가 컨트롤러의 기능을 수행함을 알려줌
public class HelloController {
    @GetMapping("/jump")
    // CLI의 요청으로 메서드가 실행됨을 알려줌
    @ResponseBody
    // 메서드 출력값 그대로 리턴할 것임을 알려줌
    public String hello() {
        return "점프 투 스프링부트";
    }
}
