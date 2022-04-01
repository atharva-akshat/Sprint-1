package com.womenempowerment.dao;


import com.womenempowerment.entity.NGO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface INGODao extends JpaRepository<NGO, Integer>{
    @Query("select n from NGO n where n.ngoMotive = ?1")
    List<NGO> findByNgoMotive(String ngoMotive);

    @Query("select n from NGO n where n.ngoLocation = ?1")
    List<NGO> findByNgoLocation(String ngoLocation);

}