package edu.wctc.distjavazodiac.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;

@Entity
@Data
@NoArgsConstructor
@Table(name = "calendar_month")
public class Month {
    @Id
    @Column(name = "num")
    private int number;
    @Column(name = "nm")
    private String name;
}
