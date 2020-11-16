package sr.martodikromo.artivax.app;


import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import sr.martodikromo.artivax.commands.Ping;
import sr.martodikromo.artivax.commands.Trivia;

import javax.security.auth.login.LoginException;

public class Artivax {
    public static void main(String[] args) throws LoginException {
        JDA jda = new JDABuilder("NzYxNDI4MDIzMzA3NDAzMjk1.X3adGw.aQ6dDe1g2PWG9K5DS_6Jj1o2zQc").build();
        //commands
        jda.addEventListener(new Ping());
        jda.addEventListener(new Trivia());

    }
}
