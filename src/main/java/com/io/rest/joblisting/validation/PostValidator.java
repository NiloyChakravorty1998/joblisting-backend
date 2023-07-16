package com.io.rest.joblisting.validation;

import com.io.rest.joblisting.model.Post;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

public class PostValidator {

    private static final int PROFILE_MIN_LENGTH = 5;
    private static final int PROFILE_MAX_LENGTH = 80;
    private static final int DESC_MIN_LENGTH = 20;
    private static final int DESC_MAX_LENGTH = 500;
    private static final int EXPERIENCE_MIN = 0;
    private static final int EXPERIENCE_MAX = 20;

    public static boolean isValidPost(Post post) {
        return isValidProfile(post.getProfile()) &&
                isValidDesc(post.getDesc()) &&
                isValidExperience(post.getExperience()) &&
                isValidTechStack(post.getTechStack());
    }

    private static boolean isValidProfile(String profile) {
        return !StringUtils.isEmpty(profile) && profile.length() >= PROFILE_MIN_LENGTH && profile.length() <= PROFILE_MAX_LENGTH;
    }

    private static boolean isValidDesc(String desc) {
        return !StringUtils.isEmpty(desc) && desc.length() >= DESC_MIN_LENGTH && desc.length() <= DESC_MAX_LENGTH;
    }

    private static boolean isValidExperience(int experience) {
        return experience >= EXPERIENCE_MIN && experience <= EXPERIENCE_MAX;
    }

    private static boolean isValidTechStack(ArrayList<String> techStack) {
        return techStack != null && !techStack.isEmpty();
    }
}
