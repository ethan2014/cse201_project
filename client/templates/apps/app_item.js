Template.appItem.helpers({
  imageIcon: function() {
    if(this.imageUrl === null || this.imageUrl === "") {
      return 'placeholder.jpg';
    }
    else {
      return this.imageUrl;
    }
  }
});
