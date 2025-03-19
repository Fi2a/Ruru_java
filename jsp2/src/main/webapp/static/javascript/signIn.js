/**
 *	signIn.js 
 */

// 로그인을 하기위해 아이디 비밀번호를 입력해야지만 로그인 버튼이 클릭 된다.

window.onload = function(){
	let bt = document.getElementsByClassName("signIn-bt")[0];
	bt.disabled = true; // 로그인 버튼 비활성화
	
	let inputId = document.getElementById("userId");
	let inputPw = document.getElementById("userPw");
	
	inputId.addEventListener("keyup", function(){
		if( inputId.value != '' && inputPw.value != '' ) { 
			bt.disabled = false; // 아이디와 비밀번호 입력됫을떄 로그인 버튼 활성화
		} else {
			bt.disabled = true;
		}
	});
	
	inputPw.addEventListener("keyup", function(){
		if( inputId.value != '' && inputPw.value != '' ) { 
			bt.disabled = false; // 아이디와 비밀번호 입력됫을떄 로그인 버튼 활성화
		} else {
			bt.disabled = true;
		}
	});
	
	document.getElementsByClassName("join")[0]
	.addEventListener("click", function(){
		location.href = "member/signUp.jsp";
	})
		
	
	
	
}