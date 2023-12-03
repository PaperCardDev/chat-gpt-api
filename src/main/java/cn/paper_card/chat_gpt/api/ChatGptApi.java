package cn.paper_card.chat_gpt.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface ChatGptApi {

    @NotNull String requestAnswer(@NotNull String question) throws Exception;

    @NotNull String requestAnswer(@NotNull String question, long id) throws Exception;
}
