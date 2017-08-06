package com.makeramen.nowdothis;

import android.app.Application;

import com.google.gson.Gson;
import com.makeramen.nowdothis.dagger.PerApp;
import com.makeramen.nowdothis.data.DataModule;
import com.makeramen.nowdothis.data.NetworkModule;
import com.makeramen.nowdothis.ui.EditListFragment;
import com.makeramen.nowdothis.ui.NowDoThisActivity;
import com.makeramen.nowdothis.ui.TodoFragment;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.Picasso;

import dagger.Component;

@PerApp
@Component(modules = {NowDoThisModule.class, DataModule.class, NetworkModule.class})
public interface NowDoThisAppComponent {
    
    void inject(NowDoThisActivity nowDoThisActivity);
    
    void inject(EditListFragment editListFragment);
    
    void inject(TodoFragment todoFragment);
    
    Application application();
    
    Picasso picasso();
    
    Gson gson();
    
    OkHttpClient okHttpClient();
}
