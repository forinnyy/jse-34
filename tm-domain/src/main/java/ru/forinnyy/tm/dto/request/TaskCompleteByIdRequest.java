package ru.forinnyy.tm.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class TaskCompleteByIdRequest extends AbstractUserRequest {

    private String id;

    public TaskCompleteByIdRequest(String token) {
        super(token);
    }

}
