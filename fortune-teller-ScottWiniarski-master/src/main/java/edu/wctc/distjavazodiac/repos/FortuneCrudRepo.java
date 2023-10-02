package edu.wctc.distjavazodiac.repos;

import edu.wctc.distjavazodiac.entity.Fortune;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FortuneCrudRepo extends CrudRepository<Fortune, Integer> {
}
