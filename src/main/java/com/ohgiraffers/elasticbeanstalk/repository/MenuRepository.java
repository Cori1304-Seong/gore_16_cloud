package com.ohgiraffers.elasticbeanstalk.repository;

import com.ohgiraffers.elasticbeanstalk.entity.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer> {

  Menu findById(int menuCode);
}
