package com.io.rest.joblisting.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@Data
@NoArgsConstructor
public class Post {

    private String profile;
    private String desc;
    private int experience;
    private ArrayList<String> techStack = new ArrayList();

}
