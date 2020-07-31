package controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDao {

@Autowired(required=false)
public SqlSessionTemplate sqlSessionTemplate = null;

public String current_time() {
	String time = sqlSessionTemplate.selectOne("current_time");
	return time;
 
}

}
