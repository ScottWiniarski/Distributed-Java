package edu.wctc.distjavazodiac.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.distjavazodiac.entity.Month;
import edu.wctc.distjavazodiac.repos.MonthCrudRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BasicMonthListService implements MonthListService {

    private final MonthCrudRepo monthRepo;
    @Autowired
    public BasicMonthListService (MonthCrudRepo monthRepo){
        // Break point on this.monthRepo = monthRepo
        this.monthRepo = monthRepo;
    }
//    @Value("classpath:months.json")
//    private Resource months;
    private List<Month> monthList = new ArrayList<>();

    @Override
    public List<Month> getMonths() {
        return monthList;
    }

    @PostConstruct
    public void initMonths() {
        monthRepo.findAll().forEach(monthList::add);
        //System.out.println(monthList);
    }
}
