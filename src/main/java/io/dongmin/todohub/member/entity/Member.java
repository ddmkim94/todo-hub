package io.dongmin.todohub.member.entity;

import io.dongmin.todohub.base.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@SuperBuilder
public class Member extends BaseEntity {

    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;

    @Column(unique = true)
    private String email;
    private String profile;

    @Enumerated(EnumType.STRING)
    private MemberRole role;

}
