if (Apps.find().count() === 0) {
  Apps.insert({
    title: 'Application Title',
    price: '$0.99',
    developer: 'Dustin Riley',
    description: 'A small application made by Dustin Riley',
    imageUrl: null,
    approved: true
  });
  Apps.insert({
    title: 'Another Application',
    price: '$0.99',
    developer: 'Apple, Inc.',
    description: 'A small application made by Apple',
    imageUrl: null,
    approved: true
  });
  Apps.insert({
    title: 'Sick App, Brah',
    price: '$0.99',
    developer: 'Google, Inc.',
    description: 'A small application made by Google',
    imageUrl: null,
    approved: true
  });
}
