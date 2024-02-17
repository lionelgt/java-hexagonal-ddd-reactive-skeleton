package com.me.skeleton.web.client;


import com.me.skeleton.web.dto.GitHubRepoResponse;
import com.me.skeleton.web.property.WebClientProperties;
import com.me.skeleton.web.property.WebClientProperty;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class GitHubWebClient {
    private final WebClient webClient;
    private final WebClientProperty gitHubProperties;

    public GitHubWebClient(WebClient.Builder webClientBuilder, WebClientProperties webClientProperties) {
        this.gitHubProperties = webClientProperties.getClients().get("git-hub");
        this.webClient = webClientBuilder
                .baseUrl(gitHubProperties.getUrl())
                .build();
    }

    public Mono<GitHubRepoResponse> info(){
        return webClient.get()
                    .uri(gitHubProperties.getServices().get("info"))
                    .retrieve()
                    .bodyToMono(GitHubRepoResponse.class);
    }
}
