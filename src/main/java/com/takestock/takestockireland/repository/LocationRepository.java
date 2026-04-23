package com.takestock.takestockireland.repository;

import com.takestock.takestockireland.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer> {
//JpaRepository<Entity,ID_Type>
    //Inherits: findAll, findById, save, delete, count etc
}
