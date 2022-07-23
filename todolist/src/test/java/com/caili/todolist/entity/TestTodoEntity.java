package com.caili.todolist.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTodoEntity {
    @Test
    public void whenGetId_ThenSetId() {
        Todo todo = new Todo();
        todo.setId(1);
        Integer expected = 1;
        Integer actual = todo.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void whenGetTask_ThenSetTask() {
        Todo todo = new Todo();
        todo.setTask("洗衣服");
        String expected = "洗衣服";
        String actual = todo.getTask();

        assertEquals(expected, actual);
    }

    @Test
    public void whenSetTask_ThenGetTask() {
        Todo todo = new Todo();
        todo.setStatus(2);
        Integer expected = 2;
        Integer actual = todo.getStatus();

        assertEquals(expected, actual);
    }
}