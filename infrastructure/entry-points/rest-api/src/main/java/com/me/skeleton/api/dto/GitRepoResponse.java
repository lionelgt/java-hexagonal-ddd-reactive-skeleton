package com.me.skeleton.api.dto;

import lombok.Data;

@Data
public class GitRepoResponse {
    private String name;
    private String fullName;
    private GitRepoOwnerResponse owner;
}
