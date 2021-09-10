/**
 * AngularJS App 
 */

var app = angular.module('angularBasicsApp', ['ngRoute']); //[] tells angular to create a project with the name passed in
					//not providing the [] will tell angular one already exists


app.config(function($routeProvider){
	
	$routeProvider
		.when('/', {
			templateUrl : 'fragments/home.html'
		})
		
		.when('/about',{
			templateUrl : 'fragments/about.html'
		})
		
		.otherwise({
			redirectTo : '/'
		});
	
})

