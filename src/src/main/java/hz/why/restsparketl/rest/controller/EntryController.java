package hz.why.restsparketl.rest.controller;

import hz.why.restsparketl.core.PlatformManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuheyi on 2018/5/6.
 */

@RestController
public class EntryController {
    @RequestMapping("/entry")
    public String test(@RequestParam(value="name", defaultValue="World") String name) {
        Long rdd_count = PlatformManager.start_simple_application();
        return "rdd count :" + rdd_count;
    }
}
