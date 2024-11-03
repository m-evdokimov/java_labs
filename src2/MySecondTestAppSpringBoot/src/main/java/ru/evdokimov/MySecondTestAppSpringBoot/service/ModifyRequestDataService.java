package ru.evdokimov.MySecondTestAppSpringBoot.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ru.evdokimov.MySecondTestAppSpringBoot.model.Request;
import ru.evdokimov.MySecondTestAppSpringBoot.model.Systems;
import ru.evdokimov.MySecondTestAppSpringBoot.util.DateTimeUtil;

@Service
@Qualifier("ModifyRequestDataService")
public class ModifyRequestDataService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSystemName(Systems.Service1);
        request.setSource("Source1");
        request.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}