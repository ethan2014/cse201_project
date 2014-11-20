if (!(typeof MochaWeb === 'undefined')){
  MochaWeb.testOnly(function(){
    describe("Tests", function(){
      it("should respect equality (aka chai should be working)", function(){
        chai.assert.equal(5,5);
      });
    });
  });
}
