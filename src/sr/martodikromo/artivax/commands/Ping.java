package sr.martodikromo.artivax.commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Ping extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        if(event.getMessage().getContentRaw().equalsIgnoreCase("$ping")){
            event.getChannel().sendMessage("Pong!").queue();
        }
    }
}
