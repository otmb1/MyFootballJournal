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

public final class FragmentSearchTeamDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView searchTeamCity;

  @NonNull
  public final ImageView searchTeamImage;

  @NonNull
  public final TextView searchTeamName;

  @NonNull
  public final TextView searchTeamVenue;

  private FragmentSearchTeamDialogBinding(@NonNull LinearLayout rootView,
      @NonNull TextView searchTeamCity, @NonNull ImageView searchTeamImage,
      @NonNull TextView searchTeamName, @NonNull TextView searchTeamVenue) {
    this.rootView = rootView;
    this.searchTeamCity = searchTeamCity;
    this.searchTeamImage = searchTeamImage;
    this.searchTeamName = searchTeamName;
    this.searchTeamVenue = searchTeamVenue;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchTeamDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchTeamDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search_team_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchTeamDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.search_team_city;
      TextView searchTeamCity = ViewBindings.findChildViewById(rootView, id);
      if (searchTeamCity == null) {
        break missingId;
      }

      id = R.id.search_team_image;
      ImageView searchTeamImage = ViewBindings.findChildViewById(rootView, id);
      if (searchTeamImage == null) {
        break missingId;
      }

      id = R.id.search_team_name;
      TextView searchTeamName = ViewBindings.findChildViewById(rootView, id);
      if (searchTeamName == null) {
        break missingId;
      }

      id = R.id.search_team_venue;
      TextView searchTeamVenue = ViewBindings.findChildViewById(rootView, id);
      if (searchTeamVenue == null) {
        break missingId;
      }

      return new FragmentSearchTeamDialogBinding((LinearLayout) rootView, searchTeamCity,
          searchTeamImage, searchTeamName, searchTeamVenue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
