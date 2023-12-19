package ru.rusguardian.request.manager.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ru.rusguardian.request.manager.domain.RequestEvent;
import ru.rusguardian.request.manager.service.RequestEventService;

import javax.servlet.http.HttpServlet;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/redirect")
@RequiredArgsConstructor
public class RedirectController {

    private final RequestEventService service;

    @GetMapping
    public ModelAndView redirect(@RequestParam(value = "source", required = false) String source) {
        RequestEvent event = new RequestEvent();
        event.setSource(source);
        event.setEventTime(LocalDateTime.now());

        service.create(event);
        return new ModelAndView("redirect:" + "https://docs.google.com/forms/d/e/1FAIpQLSdNQzqKC3KuFuB6UEWTDKUPpHtyh9Sl7p2aS6zqXJ4jvmxE5Q/viewform?usp=sf_link");
    }


}
