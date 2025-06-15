package ru.forinnyy.tm.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class ProjectUpdateByIndexRequest extends AbstractUserRequest {

    private Integer index;

    private String name;

    private String description;

    public ProjectUpdateByIndexRequest(String token) {
        super(token);
    }

}
