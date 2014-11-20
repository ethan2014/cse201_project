if (!(typeof MochaWeb === 'undefined')){
  MochaWeb.testOnly(function(){
    // Tests to run once server is initialized
    describe("Server initialization", function(){
      // This will check if meteor is actually running (it has to be)
      it("should have a Meteor version defined", function(){
        chai.assert(Meteor.release);
      });
      // Checks that our fixture data has been inserted into the database
      it("should insert apps into the database after server start", function() {
        chai.assert(Apps.find().count() > 0);
      });
    });
  });
  // Tests for our Apps database
  describe("Application", function () {
    // Make sure that apps have the correct properties
    it("all apps should have the correct properties", function () {
        var apps = Apps.find().fetch();

        var assert = chai.assert;
        var app;

        for(var i = 0; i < apps.length; i++) {
          app = apps[i];
          assert.property(app, 'title');
          assert.property(app, 'price');
          assert.property(app, 'developer');
          assert.property(app, 'description');
          assert.property(app, 'imageUrl');
          assert.property(app, 'approved');
          assert.property(app, 'url');
          assert.property(app, 'platform');
          assert.property(app, 'version');
        }
    });
  });
}
