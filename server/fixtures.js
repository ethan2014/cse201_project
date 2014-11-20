if (Apps.find().count() === 0) {
  Apps.insert({
    title: 'Application Title',
    price: '$0.99',
    developer: 'Dustin Riley',
    description: 'A small application made by Dustin Riley',
    imageUrl: null,
    url: 'http://google.com',
    platform: 'Android',
    version: '1.0.0',
    reviewScore: '5',
    approved: true
  });
  Apps.insert({
    title: 'Another Application',
    price: '$0.99',
    developer: 'Apple, Inc.',
    description: 'A small application made by Apple',
    imageUrl: null,
    url: 'http://google.com',
    platform: 'Android',
    version: '1.0.0',
    reviewScore: '4',
    approved: true
  });
  Apps.insert({
    title: 'Sick App, Brah',
    price: '$0.99',
    developer: 'Google, Inc.',
    description: 'A small application made by Google',
    imageUrl: null,
    url: 'http://google.com',
    platform: 'Android',
    version: '1.0.0',
    reviewScore: '3',
    approved: true
  });
}
