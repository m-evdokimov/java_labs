package ru.evdokimov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.evdokimov.MySecondTestAppSpringBoot.model.Positions;


@Service
public interface BonusService {
    double calculateAnnualBonus(Positions positions, double salary, double bonus, int workDays);
    double calculateQuarterlyBonus(Positions positions, double salary, double bonus, int workDays);
}