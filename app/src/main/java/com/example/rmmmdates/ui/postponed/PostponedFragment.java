package com.example.rmmmdates.ui.postponed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rmmmdates.databinding.FragmentPostponedBinding;

public class PostponedFragment extends Fragment {

    private FragmentPostponedBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PostponedViewModel postponedViewModel =
                new ViewModelProvider(this).get(PostponedViewModel.class);

        binding = FragmentPostponedBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPostponed;
        postponedViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}