package com.me.skeleton.api.mapper;


import com.me.skeleton.api.dto.GitRepoOwnerResponse;
import com.me.skeleton.api.dto.GitRepoResponse;
import com.me.skeleton.domain.model.GitRepo;
import com.me.skeleton.domain.model.GitRepoOwner;

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
public interface GitRepoMapper {
    GitRepoResponse map(GitRepo gitRepo);
    GitRepoOwnerResponse map(GitRepoOwner gitRepoOwner);
}
