<style>
font-family: 'Roboto ', sans-serif ;

body {
	background: #D9B280;
	font-family: "Roboto", sans-serif;
}

.container1 {
	background: #FFFFFF;
	width: 900px;
	height: 650px;
	margin: 5% auto;
	position: relative;
}

.container1 .map {
	width: 45%;
	float: left;
}

.container1 .contact-form {
	width: 53%;
	margin-left: 2%;
	float: left;
}

.container1 .contact-form .title {
	font-size: 2.5em;
	font-family: "Roboto", sans-serif;
	font-weight: 700;
	color: #242424;
	margin: 5% 8%;
}

.container1 .contact-form .subtitle {
	font-size: 1.2em;
	font-weight: 400;
	margin: 0 4% 5% 8%;
}

.container1 .contact-form input, .container1 .contact-form textarea {
	width: 330px;
	padding: 3%;
	margin: 2% 8%;
	color: #242424;
	border: 1px solid #B7B7B7;
}

.container1 .contact-form input::placeholder, .container1 .contact-form textarea::placeholder
	{
	color: #242424;
}

.container1 .contact-form .btn-send {
	background: #fcc99b;
	width: 180px;
	height: 60px;
	color: #FFFFFF;
	font-weight: 700;
	margin: 2% 8%;
	border: none;
}
</style>
<div class="container">
	<div class="container1">
		<div class="map">
			<iframe
				src="https://maps.google.com/maps?width=100%&amp;height=600&amp;hl=en&amp;q=annai%20medical%20oppo%2C7th%20street%2Cgandhipuram%2C%20coimbatore+(Flower%20Paradise)&amp;ie=UTF8&amp;t=&amp;z=16&amp;iwloc=A&amp;output=embed"
				width="100%" height="600px" frameborder="0" style="border: 0"
				allowfullscreen></iframe>
		</div>
		<div class="contact-form">
			<h1 class="title">Contact Us</h1>
			<h2 class="subtitle">We are here assist you.</h2>
			<form action="sendmail" method="post">
				<input type="text" id="name" name="name" placeholder="Your Name" />
				<input type="email" id="e-mail" name="e-mail" placeholder="Your E-mail Adress" />
				<input type="tel" id="phno"
				name="phno" placeholder="Your Phone Number" />
				<textarea id="message" name="message" rows="8" placeholder="Your Message"></textarea>
				<button type="submit" class="btn-send">Get a Call Back</button>
			</form>
		</div>
	</div>
</div>