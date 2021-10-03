// Generated by view binder compiler. Do not edit!
package com.appsnipp.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.appsnipp.education.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeCoursesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView courseName;

  @NonNull
  public final RecyclerView filesRecycler;

  @NonNull
  public final TextView rollno;

  @NonNull
  public final TextView textSignOut;

  @NonNull
  public final TextView textUsername;

  private FragmentHomeCoursesBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView courseName, @NonNull RecyclerView filesRecycler, @NonNull TextView rollno,
      @NonNull TextView textSignOut, @NonNull TextView textUsername) {
    this.rootView = rootView;
    this.courseName = courseName;
    this.filesRecycler = filesRecycler;
    this.rollno = rollno;
    this.textSignOut = textSignOut;
    this.textUsername = textUsername;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeCoursesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeCoursesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home_courses, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeCoursesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.courseName;
      TextView courseName = ViewBindings.findChildViewById(rootView, id);
      if (courseName == null) {
        break missingId;
      }

      id = R.id.filesRecycler;
      RecyclerView filesRecycler = ViewBindings.findChildViewById(rootView, id);
      if (filesRecycler == null) {
        break missingId;
      }

      id = R.id.rollno;
      TextView rollno = ViewBindings.findChildViewById(rootView, id);
      if (rollno == null) {
        break missingId;
      }

      id = R.id.textSignOut;
      TextView textSignOut = ViewBindings.findChildViewById(rootView, id);
      if (textSignOut == null) {
        break missingId;
      }

      id = R.id.textUsername;
      TextView textUsername = ViewBindings.findChildViewById(rootView, id);
      if (textUsername == null) {
        break missingId;
      }

      return new FragmentHomeCoursesBinding((ConstraintLayout) rootView, courseName, filesRecycler,
          rollno, textSignOut, textUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}