Template.submit.events({
  'click .submitApp': function(event) {
    var appName = document.getElementById('appName').value;
    var description = document.getElementById('desc').value;
    var price = document.getElementById('price').value;
    var platform = document.getElementById('platform').value;
    var version = document.getElementById('version').value;
    var url = document.getElementById('url').value;

    var imageUrl = Session.get('imageUrl');

    Apps.insert({
      title: appName,
      description: description,
      price: price,
      developer: Meteor.user().username,
      platform: platform,
      version: version,
      reviewScore: null,
      imageUrl: imageUrl,
      url: url,
      approved: false
    });

    Session.set('imageUrl', null);

    Router.go('/');
    return false;
  }
});

Template.submit.rendered = function() {
  var widget = uploadcare.Widget('[role=uploadcare-uploader]');

  widget.onUploadComplete(function(fileInfo) {
    Session.set('imageUrl', fileInfo.originalUrl);
  });
}
