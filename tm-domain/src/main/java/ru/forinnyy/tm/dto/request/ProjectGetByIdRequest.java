package ru.forinnyy.tm.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class ProjectGetByIdRequest extends AbstractUserRequest {

    private String id;

    public ProjectGetByIdRequest(String token) {
        super(token);
    }

}
