package com.appsnipp.education.ui.student_fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.appsnipp.education.R;
import com.appsnipp.education.ui.model.Pdf;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeCoursesFragmentDirections {
  private HomeCoursesFragmentDirections() {
  }

  @NonNull
  public static ActionStudenthomeToFileViewFragment actionStudenthomeToFileViewFragment(
      @NonNull Pdf pdf) {
    return new ActionStudenthomeToFileViewFragment(pdf);
  }

  public static class ActionStudenthomeToFileViewFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionStudenthomeToFileViewFragment(@NonNull Pdf pdf) {
      if (pdf == null) {
        throw new IllegalArgumentException("Argument \"pdf\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("pdf", pdf);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionStudenthomeToFileViewFragment setPdf(@NonNull Pdf pdf) {
      if (pdf == null) {
        throw new IllegalArgumentException("Argument \"pdf\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("pdf", pdf);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_studenthome_to_fileViewFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Pdf getPdf() {
      return (Pdf) arguments.get("pdf");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionStudenthomeToFileViewFragment that = (ActionStudenthomeToFileViewFragment) object;
      if (arguments.containsKey("pdf") != that.arguments.containsKey("pdf")) {
        return false;
      }
      if (getPdf() != null ? !getPdf().equals(that.getPdf()) : that.getPdf() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPdf() != null ? getPdf().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionStudenthomeToFileViewFragment(actionId=" + getActionId() + "){"
          + "pdf=" + getPdf()
          + "}";
    }
  }
}
