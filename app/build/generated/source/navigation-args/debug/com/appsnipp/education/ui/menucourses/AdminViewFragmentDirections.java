package com.appsnipp.education.ui.menucourses;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.appsnipp.education.R;

public class AdminViewFragmentDirections {
  private AdminViewFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAdminViewFragmentToAdminhome() {
    return new ActionOnlyNavDirections(R.id.action_adminViewFragment_to_adminhome);
  }
}
