// Generated by view binder compiler. Do not edit!
package com.example.myfootballjournal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
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

public final class DataFixturesBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CheckBox bookmarkBtn;

  @NonNull
  public final ImageView imageAwayteam;

  @NonNull
  public final ImageView imageHometeam;

  @NonNull
  public final TextView textAwayteam;

  @NonNull
  public final TextView textDate;

  @NonNull
  public final TextView textHometeam;

  @NonNull
  public final TextView textVenue;

  private DataFixturesBinding(@NonNull CardView rootView, @NonNull CheckBox bookmarkBtn,
      @NonNull ImageView imageAwayteam, @NonNull ImageView imageHometeam,
      @NonNull TextView textAwayteam, @NonNull TextView textDate, @NonNull TextView textHometeam,
      @NonNull TextView textVenue) {
    this.rootView = rootView;
    this.bookmarkBtn = bookmarkBtn;
    this.imageAwayteam = imageAwayteam;
    this.imageHometeam = imageHometeam;
    this.textAwayteam = textAwayteam;
    this.textDate = textDate;
    this.textHometeam = textHometeam;
    this.textVenue = textVenue;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DataFixturesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DataFixturesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.data_fixtures, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DataFixturesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookmark_btn;
      CheckBox bookmarkBtn = ViewBindings.findChildViewById(rootView, id);
      if (bookmarkBtn == null) {
        break missingId;
      }

      id = R.id.image_awayteam;
      ImageView imageAwayteam = ViewBindings.findChildViewById(rootView, id);
      if (imageAwayteam == null) {
        break missingId;
      }

      id = R.id.image_hometeam;
      ImageView imageHometeam = ViewBindings.findChildViewById(rootView, id);
      if (imageHometeam == null) {
        break missingId;
      }

      id = R.id.text_awayteam;
      TextView textAwayteam = ViewBindings.findChildViewById(rootView, id);
      if (textAwayteam == null) {
        break missingId;
      }

      id = R.id.text_date;
      TextView textDate = ViewBindings.findChildViewById(rootView, id);
      if (textDate == null) {
        break missingId;
      }

      id = R.id.text_hometeam;
      TextView textHometeam = ViewBindings.findChildViewById(rootView, id);
      if (textHometeam == null) {
        break missingId;
      }

      id = R.id.text_venue;
      TextView textVenue = ViewBindings.findChildViewById(rootView, id);
      if (textVenue == null) {
        break missingId;
      }

      return new DataFixturesBinding((CardView) rootView, bookmarkBtn, imageAwayteam, imageHometeam,
          textAwayteam, textDate, textHometeam, textVenue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}