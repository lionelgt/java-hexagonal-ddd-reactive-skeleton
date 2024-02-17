package com.me.skeleton.domain.model;

import lombok.Data;

@Data
public class GitRepo {
    private String name;
    private String fullName;
    private GitRepoOwner owner;
}
