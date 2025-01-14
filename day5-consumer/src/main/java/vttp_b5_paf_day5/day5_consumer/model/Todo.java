package vttp_b5_paf_day5.day5_consumer.model;

public class Todo {

    private int id;
    private String task;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Todo(int id, String task) {
        this.id = id;
        this.task = task;
    }

    public Todo() {
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", task=" + task + "]";
    }

}
