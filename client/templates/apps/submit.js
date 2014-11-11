Template.submit.events({
  'click .submitApp': function(event) {
    var appName = document.getElementById('appName').value;
    var description = document.getElementById('desc').value;
    var price = document.getElementById('price').value;
    var platform = document.getElementById('platform').value;
    var version = document.getElementById('version').value;
    var imageUrl = document.getElementById('imageUrl').value;
    var url = document.getElementById('url').value;

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

    Router.go('/');
    return false;
  }
});
