package com.appsnipp.education.ui.student_fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.appsnipp.education.R;

public class FileViewFragmentDirections {
  private FileViewFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFileViewFragmentToStudenthome() {
    return new ActionOnlyNavDirections(R.id.action_fileViewFragment_to_studenthome);
  }
}
