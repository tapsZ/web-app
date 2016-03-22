angular.module( 'App.home', [
  'ui.router',
   'App.account'
])


.config(function config( $stateProvider ) {
  $stateProvider.state( 'home', {
    url: '/home',
    views: {
      "main": {
        controller: 'HomeCtrl',
        templateUrl: '/WEB-INF/views/home.tpl.html'
      }
    },
    data:{ pageTitle: 'Home' }
  });
})

/**
 * And of course we define a controller for our route.
 */
.controller( 'HomeCtrl', function HomeController( $scope, sessionService) {
    $scope.isLoggedIn = sessionService.isLoggedIn;
    $scope.logout = sessionService.logout;
})

;

