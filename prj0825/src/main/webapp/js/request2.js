

//alert();


function hi() {
	//alert("hi!");
	alert("djdjdjdjd");
	let userNameTag = document.getElementById("userName");
	alert(userNameTag);
	let userName = userNameTag.value;
	alert(userName);
	//
	
	
	window.location.href="/prj0825/hi?name=" + userName;
}