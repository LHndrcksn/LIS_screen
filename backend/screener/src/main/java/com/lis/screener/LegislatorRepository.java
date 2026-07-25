package com.lis.screener;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LegislatorRepository extends  CrudRepository<Legislator, Long> {

    Legislator findById(long id);
}
