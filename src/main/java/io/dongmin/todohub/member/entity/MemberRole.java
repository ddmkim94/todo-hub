package io.dongmin.todohub.member.entity;

import lombok.Getter;

@Getter
public enum MemberRole {
    ADMIN("관리자"), USER("일반유저");

    MemberRole(String role) {
        this.role = role;
    }

    private final String role;
}
