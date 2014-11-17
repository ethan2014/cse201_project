Template.commentSection.helpers({
  comments: function() {
    return Comments.find({appId: this._id});
  }
});
