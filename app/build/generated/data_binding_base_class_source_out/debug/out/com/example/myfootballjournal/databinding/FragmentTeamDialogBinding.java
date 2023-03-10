// Generated by view binder compiler. Do not edit!
package com.example.myfootballjournal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfootballjournal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTeamDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView teamCity;

  @NonNull
  public final ImageView teamImage;

  @NonNull
  public final TextView teamName;

  @NonNull
  public final TextView teamVenue;

  private FragmentTeamDialogBinding(@NonNull LinearLayout rootView, @NonNull TextView teamCity,
      @NonNull ImageView teamImage, @NonNull TextView teamName, @NonNull TextView teamVenue) {
    this.rootView = rootView;
    this.teamCity = teamCity;
    this.teamImage = teamImage;
    this.teamName = teamName;
    this.teamVenue = teamVenue;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTeamDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTeamDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_team_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTeamDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.team_city;
      TextView teamCity = ViewBindings.findChildViewById(rootView, id);
      if (teamCity == null) {
        break missingId;
      }

      id = R.id.team_image;
      ImageView teamImage = ViewBindings.findChildViewById(rootView, id);
      if (teamImage == null) {
        break missingId;
      }

      id = R.id.team_name;
      TextView teamName = ViewBindings.findChildViewById(rootView, id);
      if (teamName == null) {
        break missingId;
      }

      id = R.id.team_venue;
      TextView teamVenue = ViewBindings.findChildViewById(rootView, id);
      if (teamVenue == null) {
        break missingId;
      }

      return new FragmentTeamDialogBinding((LinearLayout) rootView, teamCity, teamImage, teamName,
          teamVenue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
