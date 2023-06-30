package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.Alein;

public interface aleinrepo extends JpaRepository<Alein,Integer> {

	List<Alein> findByaname(String name);

	List<Alein> findByanoGreaterThan(int string);

	@Query("from Alein where ano=101 order by aname")
	List<Alein> findByanameSorted(String string);
	

}
