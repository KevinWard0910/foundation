package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by wujie.yan on 2017/9/1.
 */

public class StarCoinTaskBean {
    private int hadScore;
    private int orderToScore;
    private List<StarCoinTask> taskList;

    public static class StarCoinTask{
        private int taskType;
        private int taskStatus;
        private int taskScore;
        private String taskName;

        public int getTaskType() {
            return taskType;
        }

        public void setTaskType(int taskType) {
            this.taskType = taskType;
        }

        public int getTaskStatus() {
            return taskStatus;
        }

        public void setTaskStatus(int taskStatus) {
            this.taskStatus = taskStatus;
        }

        public int getTaskScore() {
            return taskScore;
        }

        public void setTaskScore(int taskScore) {
            this.taskScore = taskScore;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }
    }

    public int getHadScore() {
        return hadScore;
    }

    public void setHadScore(int hadScore) {
        this.hadScore = hadScore;
    }

    public int getOrderToScore() {
        return orderToScore;
    }

    public void setOrderToScore(int orderToScore) {
        this.orderToScore = orderToScore;
    }

    public List<StarCoinTask> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<StarCoinTask> taskList) {
        this.taskList = taskList;
    }
}
