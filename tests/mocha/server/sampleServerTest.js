if (!(typeof MochaWeb === 'undefined')){
  MochaWeb.testOnly(function(){
    describe("Server initialization", function(){
      it("should have a Meteor version defined", function(){
        chai.assert(Meteor.release);
      });
      it("should insert apps into the database after server start", function() {
        chai.assert(Apps.find().count() > 0);
      });
    });
  });
  describe("Application", function () {
    it("should be created with the correct properties", function () {
        var app = Apps.findOne();

        var assert = chai.assert;

        assert.property(app, 'title');
        assert.property(app, 'price');
        assert.property(app, 'developer');
        assert.property(app, 'description');
        assert.property(app, 'imageUrl');
        assert.property(app, 'approved');
        assert.property(app, 'url');
        assert.property(app, 'platform');
        assert.property(app, 'version');
        assert.property(app, 'reviewScore');
    });
});
}
