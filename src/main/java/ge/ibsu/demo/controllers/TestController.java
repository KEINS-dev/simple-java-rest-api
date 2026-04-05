package ge.ibsu.demo.controllers;

import ge.ibsu.demo.dto.TestPerson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api/test")
    public class TestController {
        @GetMapping("/hi")
       public String sayHi(){
            return "hello from server";
        }
        @GetMapping("/call")
        public TestPerson call(@RequestBody TestPerson p){
            p.setFirstName(p.getFirstName()+ "from server ");
            return p;
        }
        }