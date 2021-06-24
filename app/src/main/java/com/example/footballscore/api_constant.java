package com.example.footballscore;

public enum api_constant
{
    BaseUrl ("https://app.sportdataapi.com/api/v1/soccer/"),
    apikey ("1520a8c0-bf98-11eb-9d17-f3f565699f08");
    private final String value;

    private api_constant(String label)
    {
        this.value = label;
    }

    public String getValue()
    {
        return value;
    }
}
