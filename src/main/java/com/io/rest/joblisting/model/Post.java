    package com.io.rest.joblisting.model;

    import lombok.Data;
    import lombok.NoArgsConstructor;
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.data.annotation.Id;
    import org.springframework.data.mongodb.core.mapping.Document;

    import java.util.ArrayList;

    @Document
    @Data
    @NoArgsConstructor
    public class Post {


        @Id
        private String id;
        private String profile;
        private String desc;
        private String location;
        private String imageUrl;
        private int experience;
        private ArrayList<String> techStack = new ArrayList();

    }
