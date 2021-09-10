package com.revature.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.TodoUser;

@Repository(value="todoRepoImpl")
public interface TodoUserRepo extends CrudRepository<TodoUser,Integer>{

	TodoUser findByUsername(String username);
}
