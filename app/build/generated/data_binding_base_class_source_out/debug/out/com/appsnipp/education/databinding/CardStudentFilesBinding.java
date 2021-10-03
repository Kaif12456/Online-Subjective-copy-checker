// Generated by view binder compiler. Do not edit!
package com.appsnipp.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class CardStudentFilesBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView fileMarks;

  @NonNull
  public final TextView fileSubject;

  @NonNull
  public final TextView fileTeacher;

  private CardStudentFilesBinding(@NonNull CardView rootView, @NonNull TextView fileMarks,
      @NonNull TextView fileSubject, @NonNull TextView fileTeacher) {
    this.rootView = rootView;
    this.fileMarks = fileMarks;
    this.fileSubject = fileSubject;
    this.fileTeacher = fileTeacher;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CardStudentFilesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardStudentFilesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_student_files, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardStudentFilesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fileMarks;
      TextView fileMarks = ViewBindings.findChildViewById(rootView, id);
      if (fileMarks == null) {
        break missingId;
      }

      id = R.id.fileSubject;
      TextView fileSubject = ViewBindings.findChildViewById(rootView, id);
      if (fileSubject == null) {
        break missingId;
      }

      id = R.id.fileTeacher;
      TextView fileTeacher = ViewBindings.findChildViewById(rootView, id);
      if (fileTeacher == null) {
        break missingId;
      }

      return new CardStudentFilesBinding((CardView) rootView, fileMarks, fileSubject, fileTeacher);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
