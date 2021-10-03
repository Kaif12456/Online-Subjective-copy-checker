// Generated by view binder compiler. Do not edit!
package com.appsnipp.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.appsnipp.education.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDashboardCourseBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ImageView cardViewImage;

  @NonNull
  public final LinearLayout llFirstcoureses;

  @NonNull
  public final LinearLayout llSecondcoureses;

  private ActivityDashboardCourseBinding(@NonNull NestedScrollView rootView,
      @NonNull ImageView cardViewImage, @NonNull LinearLayout llFirstcoureses,
      @NonNull LinearLayout llSecondcoureses) {
    this.rootView = rootView;
    this.cardViewImage = cardViewImage;
    this.llFirstcoureses = llFirstcoureses;
    this.llSecondcoureses = llSecondcoureses;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDashboardCourseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDashboardCourseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dashboard_course, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDashboardCourseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_view_image;
      ImageView cardViewImage = ViewBindings.findChildViewById(rootView, id);
      if (cardViewImage == null) {
        break missingId;
      }

      id = R.id.ll_firstcoureses;
      LinearLayout llFirstcoureses = ViewBindings.findChildViewById(rootView, id);
      if (llFirstcoureses == null) {
        break missingId;
      }

      id = R.id.ll_secondcoureses;
      LinearLayout llSecondcoureses = ViewBindings.findChildViewById(rootView, id);
      if (llSecondcoureses == null) {
        break missingId;
      }

      return new ActivityDashboardCourseBinding((NestedScrollView) rootView, cardViewImage,
          llFirstcoureses, llSecondcoureses);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
