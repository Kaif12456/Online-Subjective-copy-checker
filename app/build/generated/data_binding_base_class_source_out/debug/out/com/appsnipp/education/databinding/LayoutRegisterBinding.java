// Generated by view binder compiler. Do not edit!
package com.appsnipp.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public final class LayoutRegisterBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final EditText editEmail;

  @NonNull
  public final EditText editMobile;

  @NonNull
  public final EditText editName;

  @NonNull
  public final EditText editPassword;

  @NonNull
  public final RadioButton student;

  @NonNull
  public final RadioButton teacher;

  @NonNull
  public final TextView textSignIn;

  @NonNull
  public final RadioGroup userType;

  private LayoutRegisterBinding(@NonNull CardView rootView, @NonNull Button btnRegister,
      @NonNull EditText editEmail, @NonNull EditText editMobile, @NonNull EditText editName,
      @NonNull EditText editPassword, @NonNull RadioButton student, @NonNull RadioButton teacher,
      @NonNull TextView textSignIn, @NonNull RadioGroup userType) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.editEmail = editEmail;
    this.editMobile = editMobile;
    this.editName = editName;
    this.editPassword = editPassword;
    this.student = student;
    this.teacher = teacher;
    this.textSignIn = textSignIn;
    this.userType = userType;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRegister;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.editEmail;
      EditText editEmail = ViewBindings.findChildViewById(rootView, id);
      if (editEmail == null) {
        break missingId;
      }

      id = R.id.editMobile;
      EditText editMobile = ViewBindings.findChildViewById(rootView, id);
      if (editMobile == null) {
        break missingId;
      }

      id = R.id.editName;
      EditText editName = ViewBindings.findChildViewById(rootView, id);
      if (editName == null) {
        break missingId;
      }

      id = R.id.editPassword;
      EditText editPassword = ViewBindings.findChildViewById(rootView, id);
      if (editPassword == null) {
        break missingId;
      }

      id = R.id.student;
      RadioButton student = ViewBindings.findChildViewById(rootView, id);
      if (student == null) {
        break missingId;
      }

      id = R.id.teacher;
      RadioButton teacher = ViewBindings.findChildViewById(rootView, id);
      if (teacher == null) {
        break missingId;
      }

      id = R.id.textSignIn;
      TextView textSignIn = ViewBindings.findChildViewById(rootView, id);
      if (textSignIn == null) {
        break missingId;
      }

      id = R.id.userType;
      RadioGroup userType = ViewBindings.findChildViewById(rootView, id);
      if (userType == null) {
        break missingId;
      }

      return new LayoutRegisterBinding((CardView) rootView, btnRegister, editEmail, editMobile,
          editName, editPassword, student, teacher, textSignIn, userType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}