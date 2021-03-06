package com.flappjaxxx.fjtools;

import java.io.IOException;

import com.flappjaxxx.fjtools.R;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ExtrasActivity extends ScriptedActivity {
	@SuppressWarnings("deprecation")
	public boolean onItemSelected(String itemAction, String itemDescription) {
		ToolsActivity.getInstance().getTabHost().setCurrentTab(ToolsActivity.TAB_CONSOLE);
		return true;
	}
	
	public void onCreate(Bundle savedInstanceState) {		
		this.actions      = getResources().getStringArray(R.array.extras_actions_array);
		this.descriptions = getResources().getStringArray(R.array.extras_descriptions_array);
		super.onCreate(savedInstanceState);	
	}
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
	    if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        // do something on back.
	    	System.exit(0);
	        return true;
	    }

	    return super.onKeyDown(keyCode, event);
	}
}
