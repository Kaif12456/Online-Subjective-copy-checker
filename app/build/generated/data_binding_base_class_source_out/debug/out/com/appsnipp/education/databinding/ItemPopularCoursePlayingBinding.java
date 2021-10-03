// Generated by view binder compiler. Do not edit!
package com.appsnipp.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.appsnipp.education.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPopularCoursePlayingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnUpload;

  @NonNull
  public final EditText editRollNo;

  @NonNull
  public final EditText editSubjectName;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final TextView upload;

  @NonNull
  public final TextView uploadtext;

  private ItemPopularCoursePlayingBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView btnUpload, @NonNull EditText editRollNo, @NonNull EditText editSubjectName,
      @NonNull ConstraintLayout linearLayout, @NonNull TextView upload,
      @NonNull TextView uploadtext) {
    this.rootView = rootView;
    this.btnUpload = btnUpload;
    this.editRollNo = editRollNo;
    this.editSubjectName = editSubjectName;
    this.linearLayout = linearLayout;
    this.upload = upload;
    this.uploadtext = uploadtext;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPopularCoursePlayingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPopularCoursePlayingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_popular_course_playing, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPopularCoursePlayingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnUpload;
      ImageView btnUpload = ViewBindings.findChildViewById(rootView, id);
      if (btnUpload == null) {
        break missingId;
      }

      id = R.id.editRollNo;
      EditText editRollNo = ViewBindings.findChildViewById(rootView, id);
      if (editRollNo == null) {
        break missingId;
      }

      id = R.id.editSubjectName;
      EditText editSubjectName = ViewBindings.findChildViewById(rootView, id);
      if (editSubjectName == null) {
        break missingId;
      }

      ConstraintLayout linearLayout = (ConstraintLayout) rootView;

      id = R.id.upload;
      TextView upload = ViewBindings.findChildViewById(rootView, id);
      if (upload == null) {
        break missingId;
      }

      id = R.id.uploadtext;
      TextView uploadtext = ViewBindings.findChildViewById(rootView, id);
      if (uploadtext == null) {
        break missingId;
      }

      return new ItemPopularCoursePlayingBinding((ConstraintLayout) rootView, btnUpload, editRollNo,
          editSubjectName, linearLayout, upload, uploadtext);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}