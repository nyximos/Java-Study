package week4;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dashboard {

    public static void main(String[] args) throws IOException {
        GitHub github = new GitHubBuilder().withOAuthToken("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").build();

        final GHRepository repo = github.getRepository("whiteship/live-study");
        final List<GHIssue> issues = repo.getIssues(GHIssueState.ALL);

        Map<String, Double> users = new HashMap<>();

        for (GHIssue issue : issues) {
            final List<GHIssueComment> comments = issue.getComments();
            for(GHIssueComment comment : comments) {
                final String login = comment.getUser().getLogin();
                users.put(login, users.getOrDefault(login, 0.0)+ 1);
            }
        }

        for (String user : users.keySet()) {
            final double percent = users.get(user) / 18 * 100;
            System.out.printf("%20s : %3.2f%%%n", user, percent);
        }
    }
}
