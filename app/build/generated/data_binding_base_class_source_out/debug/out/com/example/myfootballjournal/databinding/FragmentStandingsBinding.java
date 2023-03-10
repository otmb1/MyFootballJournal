// Generated by view binder compiler. Do not edit!
package com.example.myfootballjournal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfootballjournal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStandingsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final RecyclerView recyclerStandings;

  private FragmentStandingsBinding(@NonNull ScrollView rootView,
      @NonNull RecyclerView recyclerStandings) {
    this.rootView = rootView;
    this.recyclerStandings = recyclerStandings;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStandingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStandingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_standings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStandingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recycler_standings;
      RecyclerView recyclerStandings = ViewBindings.findChildViewById(rootView, id);
      if (recyclerStandings == null) {
        break missingId;
      }

      return new FragmentStandingsBinding((ScrollView) rootView, recyclerStandings);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
