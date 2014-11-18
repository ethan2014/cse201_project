Template.appHeader.helpers({
  imageIcon: function() {
    if(this.imageUrl === null || this.imageUrl === "") {
      return '/placeholder.jpg';
    }
    else {
      return this.imageUrl;
    }
  },
  blurImage: function() {
    if(this.imageUrl === null || this.imageUrl === "") {
      return '/placeholder.jpg';
    }
    else {
      console.log(this.imageUrl);
      return this.imageUrl + '-/blur/100/-/grayscale/';
    }
  }
});
