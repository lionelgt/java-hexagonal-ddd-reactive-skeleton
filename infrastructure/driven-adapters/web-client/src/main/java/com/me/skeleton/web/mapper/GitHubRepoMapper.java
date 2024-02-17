package com.me.skeleton.web.mapper;

import com.me.skeleton.domain.model.GitRepo;
import com.me.skeleton.domain.model.GitRepoOwner;
import com.me.skeleton.web.dto.GitHubRepoOwnerResponse;
import com.me.skeleton.web.dto.GitHubRepoResponse;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
    componentModel = "spring",
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface GitHubRepoMapper {
    GitRepo map(GitHubRepoResponse gitHubRepoResponse);
    GitRepoOwner map(GitHubRepoOwnerResponse gitHubRepoOwnerResponse);
}
