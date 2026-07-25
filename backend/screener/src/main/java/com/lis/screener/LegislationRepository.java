package com.lis.screener;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LegislationRepository extends  CrudRepository<Legislation, Long> {

    Legislation findById(long id);
}
