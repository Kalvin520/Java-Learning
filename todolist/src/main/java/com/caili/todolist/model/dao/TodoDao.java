package com.caili.todolist.model.dao;
import com.caili.todolist.model.entity.Todo;
import org.springframework.data.repository.CrudRepository;

// 第一個參數為訪問的實體，第二參數是這個Entity ID的資料型態
public interface TodoDao extends CrudRepository<Todo, Integer> {

}
