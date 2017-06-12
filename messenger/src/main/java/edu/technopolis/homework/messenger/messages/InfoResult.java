package edu.technopolis.homework.messenger.messages;

import java.util.Objects;

public class InfoResult extends Message{
    private String login;
    private String about;

    public InfoResult(long id, long senderId, String login, String about) {
        super(id, senderId, Type.MSG_INFO_RESULT);
        this.login = login;
        this.about = about;
    }

    public String getLogin() {
        return login;
    }

    public String getAbout() {
        return about;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof InfoResult))
            return false;
        if (!super.equals(other))
            return false;
        InfoResult result = (InfoResult) other;
        return Objects.equals(login, result.login) && Objects.equals(about, result.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), login, about);
    }

    @Override
    public String toString() {
        return "InfoResult{" +
                super.toString() + ", " +
                "login=" + login + ", " +
                "about=" + about + "}";
    }
}
