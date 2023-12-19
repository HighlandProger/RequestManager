package ru.rusguardian.request.manager.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rusguardian.request.manager.domain.RequestEvent;
import ru.rusguardian.request.manager.repository.RequestEventRepository;

@Service
@RequiredArgsConstructor
public class RequestEventService {

    private final RequestEventRepository eventRepository;

    public RequestEvent create(RequestEvent requestEvent){
        return eventRepository.save(requestEvent);
    }
}
