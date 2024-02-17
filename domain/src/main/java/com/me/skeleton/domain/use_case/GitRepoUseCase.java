package com.me.skeleton.domain.use_case;

import com.me.skeleton.domain.model.GitRepo;

import reactor.core.publisher.Mono;

public interface GitRepoUseCase {
    Mono<GitRepo> info();
}
