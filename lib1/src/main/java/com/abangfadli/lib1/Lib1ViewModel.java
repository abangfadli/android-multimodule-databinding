package com.abangfadli.lib1;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by ahmadfadli on 7/28/2017.
 */

public class Lib1ViewModel extends BaseObservable {
    private String ab;
    private String bc;

    @Bindable
    public String getAb() {
        return ab;
    }

    public Lib1ViewModel setAb(String ab) {
        this.ab = ab;
        notifyPropertyChanged(BR.ab);
        return this;
    }

    @Bindable
    public String getBc() {
        return bc;
    }

    public Lib1ViewModel setBc(String bc) {
        this.bc = bc;
        notifyPropertyChanged(BR.bc);
        return this;
    }
}
