/**
 * 
 */

const baseUrl = getbaseUrl(); //baseUrl 함수 저장

function fetchMessage() {
	const loading = document.getElementById("loading_id");
	const messageList = document.getElementById("messageList_id");
	const error = document.getElementById("error_id");

	loading.style.display = "block";
	error.style.display = "none";
	messageList.innerHtml = "";	
	
	fetch(baseUrl+"/messages/api") //데이터 요청
	.then(response => {
		if (!response.ok) {
			throw new Error("응답 실패");
		}
		return response.json(); //json 문자열 형태로 변환.
	})
	.then(messages => {
		loading.style.display = "none";
		messages.forEach(msg => {
			const li = document.createElement("li");
			li.innerHTML = `<a href="/messages/${msg.id}">${msg.message} - ${msg.id}</a>`;
			messageList.appendChild(li);
		})
	})
	.catch(error => {
		console.error("Fetch error: ", err);
		loading.style.display = "none";
		error.style.display = "block";
	})
}

document.addEventListener("DOMContentLoaded", fetchMessage);