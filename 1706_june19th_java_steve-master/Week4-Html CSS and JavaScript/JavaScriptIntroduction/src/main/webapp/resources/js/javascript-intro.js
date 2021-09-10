/**
 *  javascript-intro.js
 *  
 *  Loosely Type: Don't declare the datatype, use var
 *  	vs Strong/Strictly Type: must declare like String foo;
 *  
 *  No Function Overloading: the last supplied method is replaces the previous
 *  
 *  JavaScript is not compiled, it is interpreted
 *  Functions can be passed as arguments
 *  2 Scopes in JS: Global and Function
 *  truthy & falsy
 *  Hoisting: bring varable declarations to the top of the scope it is in 
 *  semicolon injection, javascript tried to be a semicolonless language and FAILED! 
 *  
 *  Functions vs Methods?
 *  	Methods belong to an Object, functions don't
 *  
 *  Functions are given an implicit argruments[] that holds all the arguments
 *  
 *  Closures: javascript form of encapsulation
 *  
 *  Inheritance: prototypical
 *  
 */

var a, b, c, d, e, f, g, h, i;

a = 10;		//number, there is not any other type like int or float
			//JavaScript Numbers are 64 bit floating point decimals
b = "10";	//String
c = true;	//boolean
d = {};		//Object
e = null;	//null
//f			//undefine, not even null, never initialized
g = (0/0);	//NaN: Not A Number
h = [];		//Array




//function i(){
//	console.log('I am i');
//}


/*
 *  == vs ===
 */
function isEqual(x, y){
	return x == y; //The double equals == performs type coercion, 
					//changes one datatype to match the other,
					//then tries to compare the values
}


function isEqualx3(x,y){
	return x === y;
}


//String assignments
function stringConcat(foo, bar, hello){
	console.log('stringConcat 3 parameters');
	var x = foo + bar + hello;
	return x;
}


function stringConcat(x, y){
	console.log('stringConcat 2 parameters');
	return x + y;
}


//The cooler way: both i are the same
i = function(){
	console.log('I am i');
	return 'end of i';
}
//function i(){
//	console.log('I am i');
//	return 'end of i';
//}
//Functions can be passed as an Argument
function iTakeFunctionAsAnArgument(x){
	
	var fnReturned = x;
	
	console.log("fnReturned: " + fnReturned());
	
	return "end of function";
}

/*
 *  Scopes in JS
 *  	Global
 *  	Function
 *  		-no local
 *  
 */

function incrementA(){
	a++;
	var helloFoo = 10;
}


/*
 *  if statements
 *  	truthy & falsy
 */
function testingIf(x){
	//what is truthy?
		//any other number than 0, [], {}, fn
	//What is falsy?
		//0, undefine, null, NaN, "", false,
	if( x ){
		console.log("true");
	}else{
		console.log("false");
	}
}

/*
 * Hoisting: bring variables to top of the scope, regardless of where is it declared
 */

function hoisted(num){
//	var xyz; brought to the top of the function scope
	xyz = num;
	
	return xyz;
	
	var xyz;//this var declaration is "hoisted" to the top of the scope
}



/*
 * 	Semicolon Injection
 */
function semicolonInjection(){
	var x = true;
	return; //semicolon injection, javascript tried to be a semicolonless language and FAILED! 
			x;
}


function gaurdOperator(myVar){
	return myVar && "2nd";
			//shorthand if statement
					//if the first statement is true, return the 2nd
}

function defaultOperator(myVar){
	return myVar || "2nd";
			//shorthand if statement
					//if the first statement is true, return 1st
}

function singleAn(myVar){
//	if(true & false){
//		console.log(true);
//	}
}


var book = {
		key: "value",
		title: "Lord of the Ring",
		
		author: {
			name:"jk",
			dob: 1965,
			hobbies: "lord of the rings books, never wrote harry potter"
		},

		foo: function(){
			console.log('I am a METHOD of book');
		}
}


function iTakeNoArgs(){
	//return the sum of the arguments past without adding parameters to get them
	
//	implicit argruments array, given all the arguments passed to the function
	
	var sum = 0;
	for(var i = 0; i < arguments.length; i++){
		sum += arguments[i];
	}
		
	return sum;
}

/*
 * 	Invoke a function?
 * 		1. function invocation
 * 		2. method invocation
 * 		3. constructor
 * 		4. Apply form
 */

//1. function invoke: foo("hello");
function foo(myVar, otherVar){
	return "I am invoked " + myVar + otherVar;
}

//2. method invoke: 
//			car.name()
//			car["name"]();
var car = {
		name: function(){
			console.log("car invoked!");
		}
}


//3. Constructor: new Person('steve', 'k') 
function Person(firstName, lastName){
	this.firstName = firstName;
	this.lastName = lastName;
}

//4. Apply form
//foo.apply(object, agrumentsArray);



/*
 * 	JavaScript Encapsulation
 * 
 * 		JavaScript Closures!
 * 			function within another function holds it own state
 * 
 */
var countBird = 0;
var countCar = 0;

function countBirds(){
	count +=1;
	return "Count of birds " + count;
}

function countCars(){
	count +=1;
	return "Count of cars" + count;
}


function makeBirdCounter(){
	var birds = 0;
	
	function addBird(){
		birds += 1;
		return "I have " + birds + " birds";
	}
	
	return addBird;
}

function makeCarCounter(){
	var cars = 0;
	
	function addCars(){
		cars += 1;
		return "I have " + cars + " cars";
	}
	
	return addCars;
}


function makeCounter(noun){
	var count = 0;
	
	return function(){
		count += 1;
		return "I have " + count + " " + noun + "s. SHAPES";
	};
	
}


function SuperPerson(firstName, lastName, strength, ability){
	Person.call(this, firstName,lastName);
	this.strength = strength;
	this.ability = ability;
	
}


SuperPerson.prototype.liftCar = function(){
	console.log('adding lift function');
}

String.prototype.reverse = function(){
	return this.split('').reverse().join('');
}








