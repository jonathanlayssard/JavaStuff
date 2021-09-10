/**
 *  Controller for the About Me page (feature)
 */
app.controller('aboutCtrl', function($scope){
	console.log('About Me controller')
	
	$scope.myVar = 55;
})

	.controller('aboutChildCtrl', function($scope){
		$scope.myVar = "child var";
	})