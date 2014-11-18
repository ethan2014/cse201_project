Template.header.helpers({
  admin: function() {
    if(Meteor.user()) {
      if(Meteor.user().profile.modStatus == 2)
        return true;
      else
        return false;
    }
    else {
      return false;
    }
  }
});
