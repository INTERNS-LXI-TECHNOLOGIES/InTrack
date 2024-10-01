package com.divisosoft.intrackapp.controller;

import java.io.IOException;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.divisosoft.intrackapp.model.Player;
import com.divisosoft.intrackapp.model.Reward;
import com.divisosoft.intrackapp.repository.PlayerRepository;
import com.divisosoft.intrackapp.repository.RewardRepository;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/createServlet")
public class RewardServlet extends HttpServlet{
    public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException
    {
        ServletContext application = getServletContext();

        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
        RewardRepository rewardrepo = (RewardRepository) context.getBean("rewardRepository");
        PlayerRepository playerrepo = (PlayerRepository) context.getBean("playerRepository");

        Player p1 = new Player();
        p1.setName("vipin");
        Reward reward1 =rewardrepo.findByName("Bonus");
        p1.setReward(reward1);

        playerrepo.save(p1);

        Player p2 = new Player();
        p2.setName("vipi");
        Reward reward2 = rewardrepo.findByName("Ticket");
        p2.setReward(reward2);

        playerrepo.save(p2);
    }
}