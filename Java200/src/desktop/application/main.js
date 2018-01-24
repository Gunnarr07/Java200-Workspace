
$(document).ready(function () {
	$('#button-1').on('click', (event) => {
		$('#content-1').text('Button 1 clicked');
	});
	
	$('#button-2').on('click', (event) => {
		$('#content-2').text('Button 2 clicked');
	})
});