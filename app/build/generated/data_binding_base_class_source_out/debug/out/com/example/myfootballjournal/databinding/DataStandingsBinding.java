// Generated by view binder compiler. Do not edit!
package com.example.myfootballjournal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfootballjournal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DataStandingsBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView teamStandingName;

  @NonNull
  public final TextView teamStandingNo;

  @NonNull
  public final TextView teamStandingPoints;

  private DataStandingsBinding(@NonNull CardView rootView, @NonNull TextView teamStandingName,
      @NonNull TextView teamStandingNo, @NonNull TextView teamStandingPoints) {
    this.rootView = rootView;
    this.teamStandingName = teamStandingName;
    this.teamStandingNo = teamStandingNo;
    this.teamStandingPoints = teamStandingPoints;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DataStandingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DataStandingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.data_standings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DataStandingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.team_standing_name;
      TextView teamStandingName = ViewBindings.findChildViewById(rootView, id);
      if (teamStandingName == null) {
        break missingId;
      }

      id = R.id.team_standing_no;
      TextView teamStandingNo = ViewBindings.findChildViewById(rootView, id);
      if (teamStandingNo == null) {
        break missingId;
      }

      id = R.id.team_standing_points;
      TextView teamStandingPoints = ViewBindings.findChildViewById(rootView, id);
      if (teamStandingPoints == null) {
        break missingId;
      }

      return new DataStandingsBinding((CardView) rootView, teamStandingName, teamStandingNo,
          teamStandingPoints);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
