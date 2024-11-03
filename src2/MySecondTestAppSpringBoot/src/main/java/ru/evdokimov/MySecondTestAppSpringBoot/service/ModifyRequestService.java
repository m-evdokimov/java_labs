package ru.evdokimov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.evdokimov.MySecondTestAppSpringBoot.model.Request;


@Service
public interface ModifyRequestService {
    void modify(Request request);
}