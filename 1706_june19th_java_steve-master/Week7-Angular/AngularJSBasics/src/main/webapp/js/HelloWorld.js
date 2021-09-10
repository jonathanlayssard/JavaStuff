/**
 * Example to create our own Custom Directive! 
 */
angular.module('angularBasicsApp')
				//The directive is camel case then it turns into an HTML element separated by a -
				//HTML is case sensitive and by convention we use lower case tags
		.directive('helloWorld', function(){
			console.log('hello world');
			//Must Return an Object
			return {
				template: '<h1>Hello world - my first directive!</h1>',
				restrict: "A"
			}
		})
