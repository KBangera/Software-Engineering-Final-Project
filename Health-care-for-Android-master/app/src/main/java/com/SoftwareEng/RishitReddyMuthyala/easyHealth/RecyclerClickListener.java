package com.SoftwareEng.RishitReddyMuthyala.easyHealth;

import android.view.View;



public interface RecyclerClickListener {

    public void onItemClick(int position);
    public void onItemLongClick(View v, int position);
    public void onOverFlowMenuClick(View v, int position);
}
