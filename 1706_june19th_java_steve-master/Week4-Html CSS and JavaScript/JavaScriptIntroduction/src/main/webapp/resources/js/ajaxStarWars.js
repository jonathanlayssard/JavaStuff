/**
 *  
 */

window.onload = function(){
	console.log('HMTL loaded');
	addEventListeners();
}

function addEventListeners(){
	document.getElementById('requestBtn').addEventListener("click", getStarWarsCharacter, false);
}

var starWarChar;
function getStarWarsCharacter(){
	console.log('About to do an AJAX request');
	var charId = document.getElementById('charId').value;
	console.log('CharId: ' + charId);
	
	//AJAX Request!
	var xhr = new XMLHttpRequest();
	//provide the code for what happens when we receive the response
	xhr.onreadystatechange = function(){
		//readyState has a value of 1 thru 4
//		console.log('readyState value: ' + xhr.readyState);
		/**
		 * readyState 1 = Request is send
		 * readyState 2 = Request has been received by Server
		 * readyState 3 = Server Processing Request
		 * readyState 4 = Response received and ready to handle 
		 */
		
		if(xhr.readyState == 4 && xhr.status == 200){
			 starWarChar = JSON.parse(xhr.responseText); 
								//xhr.responseText is a JSON object, we need to convert it to a JavaScript Object
			 document.getElementById('swCharacter').innerHTML = "<h1>" + starWarChar.name + "</h1>";
		}
		
	}
					
			/*
			 * open arguments 
			 * 	1. HttpRequest type -GET/POST etc
			 *  2. URL
			 *  3. use Ayschronize? true
			 */
	xhr.open("GET", "http://swapi.co/api/people/" + charId + "/", true);
	xhr.send();
	
	
	
	
}

