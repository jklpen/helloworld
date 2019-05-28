package ming.cloud.helloworld.service.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ming.knife.Result;

@FeignClient(name = "hello")
public interface HelloFeign {

    // @GetMapping(path = "/hello")
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    Result<String> hello();

    // @GetMapping(path = "/roll")
    @RequestMapping(method = RequestMethod.GET, value = "/roll")
    Result<Integer> roll(@RequestParam(value = "b") Integer b);

}
