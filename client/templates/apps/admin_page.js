Template.adminPage.helpers({
  unapproved: function() {
    return Apps.find({approved: false});
  }
});
