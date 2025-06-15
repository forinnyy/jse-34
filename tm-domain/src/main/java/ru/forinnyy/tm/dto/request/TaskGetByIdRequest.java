package ru.forinnyy.tm.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class TaskGetByIdRequest extends AbstractUserRequest {

    private String id;

    public TaskGetByIdRequest(String token) {
        super(token);
    }

}
