package com.abangfadli.lib2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.abangfadli.lib2.BR;

/**
 * Created by ahmadfadli on 7/28/2017.
 */

public class Lib2ViewModel extends BaseObservable {
    private String a;
    private String b;

    @Bindable
    public String getA() {
        return a;
    }

    public Lib2ViewModel setA(String a) {
        this.a = a;
        notifyPropertyChanged(BR.a);
        return this;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public Lib2ViewModel setB(String b) {
        this.b = b;
        notifyPropertyChanged(BR.b);
        return this;
    }
}
