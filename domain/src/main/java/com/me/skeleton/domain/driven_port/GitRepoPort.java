package com.me.skeleton.domain.driven_port;

import com.me.skeleton.domain.model.GitRepo;

import reactor.core.publisher.Mono;

public interface GitRepoPort {
    Mono<GitRepo> info();
}
