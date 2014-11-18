Accounts.onCreateUser(function(options, user) {
  if (options.profile) {
    options.profile.modStatus = 0;
    user.profile = options.profile;
  }
  else {
    user.profile.modStatus = 0;
  }
  return user;
});
