package ru.forinnyy.tm.command.project;

import lombok.NonNull;
import ru.forinnyy.tm.dto.request.ProjectChangeStatusByIdRequest;
import ru.forinnyy.tm.exception.entity.AbstractEntityException;
import ru.forinnyy.tm.exception.field.AbstractFieldException;
import ru.forinnyy.tm.exception.user.AbstractUserException;
import ru.forinnyy.tm.util.TerminalUtil;

public final class ProjectCompleteByIdCommand extends AbstractProjectCommand {

    @NonNull
    private static final String NAME = "project-complete-by-id";

    @NonNull
    private static final String DESCRIPTION = "Complete project by id.";

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
    public void execute() throws AbstractEntityException, AbstractFieldException, AbstractUserException {
        System.out.println("[COMPLETE PROJECT BY ID]");
        System.out.println("ENTER ID:");
        @NonNull final String id = TerminalUtil.nextLine();

        @NonNull final ProjectChangeStatusByIdRequest request = new ProjectChangeStatusByIdRequest(getToken());
        request.setId(id);
        getProjectEndpointClient().changeProjectStatusById(request);
    }

}
