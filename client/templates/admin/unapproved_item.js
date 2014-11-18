Template.unapprovedItem.events({
  'click .approve': function(event) {
    Apps.update({_id: this._id}, {$set: {approved: true}});
    return false;
  },
  'click .deny': function(event) {
    Apps.remove(this._id);
    return false;
  }
});

Template.unapprovedItem.helpers({
  imageIcon: function() {
    if(this.imageUrl === null || this.imageUrl === "") {
      return '/placeholder.jpg';
    }
    else {
      return this.imageUrl;
    }
  }
});
