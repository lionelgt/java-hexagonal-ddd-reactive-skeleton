package com.me.skeleton.web.adapter;

import com.me.skeleton.domain.driven_port.GitRepoPort;
import com.me.skeleton.domain.model.GitRepo;
import com.me.skeleton.web.client.GitHubWebClient;
import com.me.skeleton.web.mapper.GitHubRepoMapper;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class GitRepoAdapter implements GitRepoPort {
    
    private final GitHubWebClient gitHubClient;
    private final GitHubRepoMapper gitHubRepoMapper;
    @Override
    public Mono<GitRepo> info() {
       return gitHubClient.info()
                .map(gitHubRepoMapper::map);
    }
}
