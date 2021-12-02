package com.woowachallange.server.member.web;

import com.woowachallange.server.member.application.MemberService;
import com.woowachallange.server.member.dto.MemberResponse;
import com.woowachallange.server.web.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/v1/member")
    public ApiResponse<MemberResponse> createMember() {
        return ApiResponse.ok(memberService.saveMembers());
    }

}
