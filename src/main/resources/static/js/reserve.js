function copy() {
	var copyText = document.getElementById("rsCode");
	/* Select the text field */
	copyText.select();
	copyText.setSelectionRange(0, 99999); /* For mobile devices */
	document.execCommand("copy");
	alert("Reservation Code Copied: " + copyText.value);
}

///////////////    Time /////////////////////////////////////
var countDownDate = new Date("Feb 7, 2021 16:00:25").getTime();

// Update the count down every 1 second
var x = setInterval(function() {

  var now = new Date().getTime();

  var distance = countDownDate - now;

  var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
  var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
  var seconds = Math.floor((distance % (1000 * 60)) / 1000);


  document.getElementById("countdown").innerHTML = hours + ":" + minutes + ":" + seconds;

  // If the count down is over, write some text
  if (distance < 0) {
    clearInterval(x);
    document.getElementById("countdown").innerHTML = "EXPIRED";
  }
}, 1000);