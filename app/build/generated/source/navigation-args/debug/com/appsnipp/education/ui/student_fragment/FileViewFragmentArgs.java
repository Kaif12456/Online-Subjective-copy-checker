package com.appsnipp.education.ui.student_fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.appsnipp.education.ui.model.Pdf;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FileViewFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private FileViewFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private FileViewFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static FileViewFragmentArgs fromBundle(@NonNull Bundle bundle) {
    FileViewFragmentArgs __result = new FileViewFragmentArgs();
    bundle.setClassLoader(FileViewFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("pdf")) {
      Pdf pdf;
      if (Parcelable.class.isAssignableFrom(Pdf.class) || Serializable.class.isAssignableFrom(Pdf.class)) {
        pdf = (Pdf) bundle.get("pdf");
      } else {
        throw new UnsupportedOperationException(Pdf.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (pdf == null) {
        throw new IllegalArgumentException("Argument \"pdf\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("pdf", pdf);
    } else {
      throw new IllegalArgumentException("Required argument \"pdf\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Pdf getPdf() {
    return (Pdf) arguments.get("pdf");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("pdf")) {
      Pdf pdf = (Pdf) arguments.get("pdf");
      if (Parcelable.class.isAssignableFrom(Pdf.class) || pdf == null) {
        __result.putParcelable("pdf", Parcelable.class.cast(pdf));
      } else if (Serializable.class.isAssignableFrom(Pdf.class)) {
        __result.putSerializable("pdf", Serializable.class.cast(pdf));
      } else {
        throw new UnsupportedOperationException(Pdf.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    FileViewFragmentArgs that = (FileViewFragmentArgs) object;
    if (arguments.containsKey("pdf") != that.arguments.containsKey("pdf")) {
      return false;
    }
    if (getPdf() != null ? !getPdf().equals(that.getPdf()) : that.getPdf() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getPdf() != null ? getPdf().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "FileViewFragmentArgs{"
        + "pdf=" + getPdf()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(FileViewFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Pdf pdf) {
      if (pdf == null) {
        throw new IllegalArgumentException("Argument \"pdf\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("pdf", pdf);
    }

    @NonNull
    public FileViewFragmentArgs build() {
      FileViewFragmentArgs result = new FileViewFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPdf(@NonNull Pdf pdf) {
      if (pdf == null) {
        throw new IllegalArgumentException("Argument \"pdf\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("pdf", pdf);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Pdf getPdf() {
      return (Pdf) arguments.get("pdf");
    }
  }
}
