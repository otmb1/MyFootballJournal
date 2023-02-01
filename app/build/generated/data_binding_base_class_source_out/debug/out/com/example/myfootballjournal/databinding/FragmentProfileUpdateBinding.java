// Generated by view binder compiler. Do not edit!
package com.example.myfootballjournal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfootballjournal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileUpdateBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatButton btnUpdate;

  @NonNull
  public final EditText dateOfBirth;

  @NonNull
  public final Spinner favouriteTeamOption;

  @NonNull
  public final EditText username;

  private FragmentProfileUpdateBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatButton btnUpdate, @NonNull EditText dateOfBirth,
      @NonNull Spinner favouriteTeamOption, @NonNull EditText username) {
    this.rootView = rootView;
    this.btnUpdate = btnUpdate;
    this.dateOfBirth = dateOfBirth;
    this.favouriteTeamOption = favouriteTeamOption;
    this.username = username;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileUpdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile_update, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileUpdateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnUpdate;
      AppCompatButton btnUpdate = ViewBindings.findChildViewById(rootView, id);
      if (btnUpdate == null) {
        break missingId;
      }

      id = R.id.dateOfBirth;
      EditText dateOfBirth = ViewBindings.findChildViewById(rootView, id);
      if (dateOfBirth == null) {
        break missingId;
      }

      id = R.id.favouriteTeamOption;
      Spinner favouriteTeamOption = ViewBindings.findChildViewById(rootView, id);
      if (favouriteTeamOption == null) {
        break missingId;
      }

      id = R.id.username;
      EditText username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new FragmentProfileUpdateBinding((RelativeLayout) rootView, btnUpdate, dateOfBirth,
          favouriteTeamOption, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}