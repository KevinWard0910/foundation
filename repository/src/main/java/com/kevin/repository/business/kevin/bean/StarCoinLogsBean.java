package com.kevin.repository.business.kevin.bean;

/**
 * Created by wujie.yan on 2017/9/1.
 */

public class StarCoinLogsBean extends BaseListBean<StarCoinLogsBean.StarCoinLogBean> {

    public class StarCoinLogBean {
        private int taskType;
        private int score;
        private String taskName;
        private Long accomplishedTime;

        public int getTaskType() {
            return taskType;
        }

        public void setTaskType(int taskType) {
            this.taskType = taskType;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public Long getAccomplishedTime() {
            return accomplishedTime;
        }

        public void setAccomplishedTime(Long accomplishedTime) {
            this.accomplishedTime = accomplishedTime;
        }
    }
}
