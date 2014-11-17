Template.addComment.events({
  'click .submitComment': function(event) {
    var title = document.getElementById('title').value;
    var content = document.getElementById('content').value;

    Comments.insert({appId: this._id, title: title, content: content, author: Meteor.user().username});

    document.getElementById('title').value = '';
    document.getElementById('content').value = '';

    return false;
  },
  'click .flip': function(event) {
    $(".flipper").slideToggle("slow");
  }
});
