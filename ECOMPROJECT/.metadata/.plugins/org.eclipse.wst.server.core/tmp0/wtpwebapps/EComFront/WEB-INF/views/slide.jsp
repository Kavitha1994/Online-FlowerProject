
<script
	src="https://jssors8.azureedge.net/script/jssor.slider-27.5.0.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
        jssor_1_slider_init = function() {

            var jssor_1_SlideshowTransitions = [
              {$Duration:800,y:0.3,$During:{$Top:[0.3,0.7]},$Easing:{$Top:$Jease$.$InCubic,$Opacity:$Jease$.$Linear},$Opacity:2},
              {$Duration:800,y:0.3,$SlideOut:true,$Easing:{$Top:$Jease$.$InCubic,$Opacity:$Jease$.$Linear},$Opacity:2},
              {$Duration:800,y:0.3,$During:{$Top:[0.3,0.7]},$Easing:{$Top:$Jease$.$InCubic,$Opacity:$Jease$.$Linear},$Opacity:2,$Outside:true}
            ];

            var jssor_1_options = {
              $AutoPlay: 1,
              $DragOrientation: 2,
              $PlayOrientation: 2,
              $SlideshowOptions: {
                $Class: $JssorSlideshowRunner$,
                $Transitions: jssor_1_SlideshowTransitions
              },
              $BulletNavigatorOptions: {
                $Class: $JssorBulletNavigator$,
                $Orientation: 2
              }
            };

            var jssor_1_slider = new $JssorSlider$("jssor_1", jssor_1_options);

            /*#region responsive code begin*/

            var MAX_WIDTH = 1600;

            function ScaleSlider() {
                var containerElement = jssor_1_slider.$Elmt.parentNode;
                var containerWidth = containerElement.clientWidth;

                if (containerWidth) {

                    var expectedWidth = Math.min(MAX_WIDTH || containerWidth, containerWidth);

                    jssor_1_slider.$ScaleWidth(expectedWidth);
                }
                else {
                    window.setTimeout(ScaleSlider, 30);
                }
            }

            ScaleSlider();

            $Jssor$.$AddEvent(window, "load", ScaleSlider);
            $Jssor$.$AddEvent(window, "resize", ScaleSlider);
            $Jssor$.$AddEvent(window, "orientationchange", ScaleSlider);
            /*#endregion responsive code end*/
        };
    </script>
<style>
/*jssor slider loading skin spin css*/
.jssorl-009-spin img {
	animation-name: jssorl-009-spin;
	animation-duration: 1.6s;
	animation-iteration-count: infinite;
	animation-timing-function: linear;
}

@
keyframes jssorl-009-spin {from { transform:rotate(0deg);
	
}

to {
	transform: rotate(360deg);
}

}

/*jssor slider bullet skin 031 css*/
.jssorb031 {
	position: absolute;
}

.jssorb031 .i {
	position: absolute;
	cursor: pointer;
}

.jssorb031 .i .b {
	fill: #000;
	fill-opacity: 0.5;
	stroke: #fff;
	stroke-width: 1200;
	stroke-miterlimit: 10;
	stroke-opacity: 0.3;
}

.jssorb031 .i:hover .b {
	fill: #fff;
	fill-opacity: .7;
	stroke: #000;
	stroke-opacity: .5;
}

.jssorb031 .iav .b {
	fill: #fff;
	stroke: #000;
	fill-opacity: 1;
}

.jssorb031 .i.idn {
	opacity: .3;
}
</style>
<div id="jssor_1"
	style="position: relative; margin: 0 auto; top: 0px; left: 0px; width: 1600px; height: 500px; overflow: hidden; visibility: hidden;">
	<!-- Loading Screen -->
	<div data-u="loading" class="jssorl-009-spin"
		style="position: absolute; top: 0px; left: 0px; width: 100%; height: 100%; text-align: center; background-color: rgba(0, 0, 0, 0.7);">
		<img
			style="margin-top: -19px; position: relative; top: 50%; width: 38px; height: 38px;"
			src="//jssorcdn7.azureedge.net/theme/svg/loading/static-svg/spin.svg" />
	</div>
	<div data-u="slides"
		style="cursor: default; position: relative; top: 0px; left: 0px; width: 1600px; height: 500px; overflow: hidden;">
		<div>
			<img data-u="image" src="resources/images/1.jpg" />
		</div>
		<div>
			<img data-u="image" src="resources/images/2.jpg" />
		</div>
		<div>
			<img data-u="image" src="resources/images/4.jpg" />
		</div>
		<div>
			<img data-u="image" src="resources/images/3.jpg" />
		</div>
		<div>
			<img data-u="image" src="resources/images/5.jpg" />
		</div>
	</div>
	<!-- Bullet Navigator -->
	<div data-u="navigator" class="jssorb031"
		style="position: absolute; bottom: 12px; right: 12px;"
		data-autocenter="2" data-scale="0.5" data-scale-right="0.75">
		<div data-u="prototype" class="i" style="width: 12px; height: 12px;">
			<svg viewbox="0 0 16000 16000"
				style="position: absolute; top: 0; left: 0; width: 100%; height: 100%;">
                    <circle class="b" cx="8000" cy="8000" r="5800"></circle>
                </svg>
		</div>
	</div>
</div>
<script type="text/javascript">jssor_1_slider_init();</script>
