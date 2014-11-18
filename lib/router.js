var filters = {
  isAdmin: function() {
    var isAdmin = Meteor.user().profile.modStatus == 2;
    if(!isAdmin) {
      Router.go('/');
    }
    this.next();
  }
};

Router.configure({
  layoutTemplate: 'layout',
  loadingTemplate: 'loading',
  notFoundTemplate: 'notFound',
  waitOn: function() {
    return [Meteor.subscribe('apps'), Meteor.subscribe('comments')];
  }
});

Router.route('/', {
  name: 'appsList'
});

Router.route('/apps/:_id', {
  name: 'appPage',
  data: function() {
    return Apps.findOne(this.params._id);
  }
});

Router.route('/submit', {
  name: 'submit'
});

Router.route('/admin', {
  name: 'adminPage'
});

Router.onBeforeAction('dataNotFound', {
  only: 'appPage'
});

Router.onBeforeAction(filters.isAdmin, {
  only: 'adminPage'
});
