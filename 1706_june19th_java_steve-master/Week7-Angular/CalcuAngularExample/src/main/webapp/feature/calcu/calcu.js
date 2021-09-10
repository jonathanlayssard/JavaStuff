/**
 *  Calc feature
 */

calcApp.controller('calcCtrl', function(){
	console.log('loading calcCtrl');
	
/*
 * The ng-controller is using "controller as syntax", so we don't
 * 		need to past the $scope anymore and just use the alias instead
 * $scope.testValue = 123;
 * 
 */
	
	var calc = this;
	
	calc.testValue = 555;
	
	calc.calcuObj = {
			num1 : 0,
			num2 : 0,
			op : "",
			result : 0
	}
	
	calc.results = []; //loop this array and display it in the table
	
	calc.doAdd = function(){
		console.log('doAdd Fn clicked');
		calc.calcuObj.result = calc.calcuObj.num1 + calc.calcuObj.num2;
		calc.calcuObj.op = 'Addition';
		calc.results.push(calc.calcuObj);
		calc.calcuObj = {};
	}
	calc.doSub = function() {
		calc.calcuObj.result = calc.calcuObj.num1 - calc.calcuObj.num2;
		calc.calcuObj.op = "Subtraction";
		calc.results.push(calc.calcuObj);
		calc.calcuObj = {};
	};

	calc.doMul = function() {
		calc.calcuObj.result = calc.calcuObj.num1 * calc.calcuObj.num2;
		calc.calcuObj.op = "Multiplication";
		calc.results.push(calc.calcuObj);
		calc.calcuObj = {};
	};

	calc.doDiv = function() {
		calc.calcuObj.result = calc.calcuObj.num1 / calc.calcuObj.num2;
		calc.calcuObj.op = "Division";
		calc.results.push(calc.calcuObj);
		calc.calcuObj = {};
	};
})
