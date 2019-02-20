package sample.data.rest.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionProfiler {

    // @Value("${version}")
    private String ver = "123";

    @RequestMapping(value="/version")
    public String getVersion(){
        return ver;
    }
}