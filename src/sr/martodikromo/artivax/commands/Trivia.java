package sr.martodikromo.artivax.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Trivia extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        if(event.getMessage().getContentRaw().equalsIgnoreCase("$trivia")){
            EmbedBuilder eb = new EmbedBuilder();

        }
    }
}
