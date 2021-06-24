package com.example.footballscore;

import android.graphics.drawable.Drawable;

public class league_list
{
    private String name;
    private Integer id;
    private Integer leagueID;

    public league_list(String name, Integer id, Integer leagueID)
    {
        this.name = name;
        this.id = id;
        this.leagueID = leagueID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getLeagueID()
    {
        return leagueID;
    }

    public void setLeagueID(Integer leagueID)
    {
        this.leagueID = leagueID;
    }

}
