package com.qasu.qasunetrunnerdraft;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.qasu.qasushuffler.GenericMainActivity;

/**
 *
 * @author Samuel
 *
 */
public class NetrunnerDraftMainActivity extends GenericMainActivity
{
    // CALLBACKS
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    /**
     *
     * @param v
     */
    public void onClickMainActivity(View v)
    {
        Intent intent = new Intent().setClass(this, NetrunnerDraftTabActivity.class);
        startActivity(intent);
    }

}
