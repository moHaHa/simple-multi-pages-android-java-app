package com.example.rmmmdates.ui.postponed;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PostponedViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PostponedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Postponed fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}