Template.appsList.helpers({
  apps: function() {
    return Apps.find({approved: true});
  }
});
