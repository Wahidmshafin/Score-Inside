package com.example.footballscore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FixturePageAdapter extends FragmentStateAdapter
{
    private int tabNumber;
    private Integer seasonID;
    private Integer countryID;
    public int getTabNumber()
    {
        return tabNumber;
    }

    public FixturePageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int tabNumber)
    {
        super(fragmentManager, lifecycle);
        this.tabNumber=tabNumber;
    }

    public void setID(Integer seasonID,Integer countryID)
    {
        this.seasonID = seasonID;
        this.countryID=countryID;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        Fragment fragment;
        Integer id;
        Bundle bundle=new Bundle();
        bundle.putInt("id",seasonID);
        switch (position)
        {
            case 1:
                fragment= new FixtureFragment();
                bundle.putInt("status",0);
                fragment.setArguments(bundle);
                return fragment;
            case 2:
                fragment= new StandingFragment();
                bundle.putInt("countryId",countryID);
                fragment.setArguments(bundle);
                return fragment;
            default:
                fragment= new ResultFragment();
                bundle.putInt("status",3);
                fragment.setArguments(bundle);
                return fragment;

        }
    }

    @Override
    public int getItemCount()
    {
        return tabNumber;
    }
}
