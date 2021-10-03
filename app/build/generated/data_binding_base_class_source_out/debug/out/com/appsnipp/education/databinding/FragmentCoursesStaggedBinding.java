// Generated by view binder compiler. Do not edit!
package com.appsnipp.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.appsnipp.education.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCoursesStaggedBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final RecyclerView rvCourses;

  @NonNull
  public final TextView textSignOutAdmin;

  private FragmentCoursesStaggedBinding(@NonNull FrameLayout rootView,
      @NonNull RecyclerView rvCourses, @NonNull TextView textSignOutAdmin) {
    this.rootView = rootView;
    this.rvCourses = rvCourses;
    this.textSignOutAdmin = textSignOutAdmin;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCoursesStaggedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCoursesStaggedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_courses_stagged, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCoursesStaggedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rv_courses;
      RecyclerView rvCourses = ViewBindings.findChildViewById(rootView, id);
      if (rvCourses == null) {
        break missingId;
      }

      id = R.id.textSignOutAdmin;
      TextView textSignOutAdmin = ViewBindings.findChildViewById(rootView, id);
      if (textSignOutAdmin == null) {
        break missingId;
      }

      return new FragmentCoursesStaggedBinding((FrameLayout) rootView, rvCourses, textSignOutAdmin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
