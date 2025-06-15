package ru.forinnyy.tm.command.system;


import lombok.NonNull;
import ru.forinnyy.tm.dto.request.ApplicationAboutRequest;
import ru.forinnyy.tm.dto.response.ApplicationAboutResponse;

public final class ApplicationAboutCommand extends AbstractSystemCommand {

    @NonNull
    private static final String DESCRIPTION = "Show developer info";

    @NonNull
    private static final String NAME = "about";

    @NonNull
    private static final String ARGUMENT = "-a";

    @Override
    public void execute() {
        @NonNull final ApplicationAboutRequest request = new ApplicationAboutRequest();
        @NonNull final ApplicationAboutResponse response = getSystemEndpoint().getAbout(request);

        System.out.println();
        System.out.println("[ABOUT]");
        System.out.println("AUTHOR: " + response.getName());
        System.out.println("E-MAIL: " + response.getEmail());
        System.out.println();

        System.out.println("[GIT]");
        System.out.println("BRANCH: " + response.getGitBranch());
        System.out.println("COMMIT ID: " + response.getGitCommitId());
        System.out.println("COMMITTER: " + response.getGitCommitterName());
        System.out.println("E-MAIL: " + response.getGitCommitterEmail());
        System.out.println("MESSAGE: " + response.getGitCommitMessage());
        System.out.println("TIME: " + response.getGitCommitTime());
    }

    @NonNull
    @Override
    public String getArgument() {
        return ARGUMENT;
    }

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

}
