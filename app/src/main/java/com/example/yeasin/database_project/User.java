package com.example.yeasin.database_project;

import java.util.List;

/**
 * Created by Nayan on 1/24/2017.
 */

public class User {

    private List<UserBean> user;

    public List<UserBean> getUser() {
        return user;
    }

    public void setUser(List<UserBean> user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * title : Json Array
         * time : 4:10 PM
         * des : This is a json array file
         * image : http://microblogging.wingnity.com/JSONParsingTutorial/brad.jpg
         */

        private String title;
        private String time;
        private String des;
        private String image;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
