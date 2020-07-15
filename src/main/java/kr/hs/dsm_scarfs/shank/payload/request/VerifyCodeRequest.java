package kr.hs.dsm_scarfs.shank.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class VerifyCodeRequest {

    @Email
    private String email;

    @NotBlank
    private String code;

}