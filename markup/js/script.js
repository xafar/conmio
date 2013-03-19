(function ($) {
	var flag = false;
	
	$('.open-nav').on('click', function () {
		if (!flag) {
			$('.contents').animate({ left: '0' }, 100, function () {
				flag = true;
			});
		} else {
			$('.contents').animate({ left: '-26%' }, 100, function () {
				flag = false;
			});
		}
	});
})(jQuery);