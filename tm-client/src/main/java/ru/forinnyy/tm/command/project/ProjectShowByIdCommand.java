package ru.forinnyy.tm.command.project;

import lombok.NonNull;
import ru.forinnyy.tm.dto.request.ProjectGetByIdRequest;
import ru.forinnyy.tm.dto.response.ProjectGetByIdResponse;
import ru.forinnyy.tm.exception.field.AbstractFieldException;
import ru.forinnyy.tm.exception.user.AbstractUserException;
import ru.forinnyy.tm.util.TerminalUtil;

public final class ProjectShowByIdCommand extends AbstractProjectCommand {

    @NonNull
    private static final String NAME = "project-show-by-id";

    @NonNull
    private static final String DESCRIPTION = "Show project by id.";

    @NonNull
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @NonNull
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void execute() throws AbstractFieldException, AbstractUserException {
        System.out.println("[SHOW PROJECT BY ID]");
        System.out.println("ENTER ID:");
        @NonNull final String id = TerminalUtil.nextLine();

        @NonNull final ProjectGetByIdRequest request = new ProjectGetByIdRequest(getToken());
        request.setId(id);
        final ProjectGetByIdResponse response = getProjectEndpointClient().getProjectById(request);
        renderProject(response.getProject());
    }

}
