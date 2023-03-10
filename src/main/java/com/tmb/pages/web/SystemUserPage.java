package com.tmb.pages.web;

import com.tmb.pages.web.pagecomponents.adduserspage.SearchComponent;
import com.tmb.pages.web.pagecomponents.adduserspage.UserListComponent;

public class SystemUserPage {

  private final SearchComponent searchComponent;
  private final UserListComponent userListComponent;

  public SystemUserPage() {
    this.userListComponent = new UserListComponent();
    this.searchComponent = new SearchComponent();
  }

  public UserListComponent getUserListComponent() {
    return userListComponent;
  }


}
