package ming.cloud.helloworld.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import ming.knife.Result;
import ming.knife.ResultBuilder;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result<Object> defaultErrorHandler(HttpServletRequest request, Exception e) {
        log.error("api error: " + e.getMessage(), e);
        return ResultBuilder.error(-1, e.getMessage());
    }
}
