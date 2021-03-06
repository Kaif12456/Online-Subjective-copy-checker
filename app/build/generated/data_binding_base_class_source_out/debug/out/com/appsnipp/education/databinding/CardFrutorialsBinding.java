// Generated by view binder compiler. Do not edit!
package com.appsnipp.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.appsnipp.education.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardFrutorialsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView title;

  @NonNull
  public final ImageView youtubeThubnail;

  private CardFrutorialsBinding(@NonNull LinearLayout rootView, @NonNull CardView cardView,
      @NonNull TextView title, @NonNull ImageView youtubeThubnail) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.title = title;
    this.youtubeThubnail = youtubeThubnail;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CardFrutorialsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardFrutorialsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_frutorials, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardFrutorialsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.youtubeThubnail;
      ImageView youtubeThubnail = ViewBindings.findChildViewById(rootView, id);
      if (youtubeThubnail == null) {
        break missingId;
      }

      return new CardFrutorialsBinding((LinearLayout) rootView, cardView, title, youtubeThubnail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
