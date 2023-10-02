package edu.wctc.distjavazodiac.service;

import edu.wctc.distjavazodiac.entity.Month;
import edu.wctc.distjavazodiac.repo.MonthRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DBMonthListService implements MonthListService {
    private MonthRepository repo;
    private List<Month> monthList = new ArrayList<>();

    public DBMonthListService(MonthRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Month> getMonths() {
        return monthList;
    }

    @PostConstruct
    public void initMonths() {
        repo.findAll().forEach(monthList::add);
    }
}
