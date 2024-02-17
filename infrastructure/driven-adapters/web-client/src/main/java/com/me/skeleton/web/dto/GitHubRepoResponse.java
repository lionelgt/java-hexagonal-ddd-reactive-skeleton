package com.me.skeleton.web.dto;

import lombok.Data;

@Data
public class GitHubRepoResponse {
    private String name;
    private String fullName;
    private GitHubRepoOwnerResponse owner;
}
