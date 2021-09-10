/**
 *  bubbleVsCapture.js 
 *  	intro to event listeners
 */
//window.onload() <--this onload function will be invoked when the page is done rendering all HTML elements
window.onload = function(){
	console.log('HTML has finished rendering, starting to add event listeners');
	addedListeners();
	
}

function addedListeners(){
	var outerDiv = document.getElementById('outer');
	var innerDiv = document.getElementById('inner');
	var innerMostDiv = document.getElementById('innerMost');
								
							//1st Argument = type of event as a STRING
							//2nd Argument = the Function that will be invoked upon the event triggering
							//3rd Argument = true/false for useCapture
	var useCapture = false;
	outerDiv.addEventListener('click', outerDivTrigger, useCapture);
	innerDiv.addEventListener('click', innnerDivTrigger, useCapture);
	innerMostDiv.addEventListener('click', innerMostDivTrigger, useCapture);
}


function outerDivTrigger(event){
	console.log('1 - outer Div ');
	event.stopPropagation();
}

function innnerDivTrigger(event){
	console.log('2 - inner Div ');
	event.stopPropagation();
}

function innerMostDivTrigger(event){
	console.log('3 - innerMost Div ');
	event.stopPropagation();
}

