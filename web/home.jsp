<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html lang="en-gb" class="no-js"><head>
    <meta charset="utf-8">
    <title>GrooveList - Convocatorias para bandas</title>
    <meta name="keywords" content="convocatorias bandas, bandas convocatorias, convocatoria bandas, convocatoria para bandas, convocatoria para músicos, convocatoria musicales, convocatorias musicos, convocatorias para bandas, industria musical, convocatoria, convocatoria festival, convocatorias, convocatorias festivales, festival, festivales, proyecto musical, feria musical, feria de industria musical, bar, pub, radio, bandas, banda, músico,
		músicos, music industry, convocatoria de artistas, artista, artistas, necesito bandas, canal de recepción de bandas, line-up, showcases, trabajo para músicos, trabajo para bandas, oportunidades proyectos musicales">
    <meta name="author" content="GrooveList Team">
    <meta name="viewport" content="width=device-width, initial-scale=0.80">
    <meta name="description" content="Red social de músicos, managers y bandas para postular a convocatorias de festivales, mercados y más!">
    <meta name="google-site-verification" content="8WSwi0JADUwaddQgoEI1Ck74lH7evKkJsWlNoZ13H94">

    <meta property="og:title" content="GrooveList - Convocatorias para bandas">
    <meta property="og:url" content="http://www.groovelist.co">
    <meta property="og:image" content="http://www.groovelist.co/assets/img/facebook_groovelist_new.png">
    <meta property="og:description" content="Postula con tu proyecto musical en las diferentes convocatorias para bandas en Festivales, Ferias musicales y otros.">

    <!-- CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link media="all" type="text/css" rel="stylesheet" href="css/bootstrap-select.min.css">

    <link media="all" type="text/css" rel="stylesheet" href="css/linearicons.css">

    <link media="all" type="text/css" rel="stylesheet" href="css/font-awesome.min.css">

    <link media="all" type="text/css" rel="stylesheet" href="css/groovelistUI.css">

    <link media="all" type="text/css" rel="stylesheet" href="css/glyphicons.css">

    <link media="all" type="text/css" rel="stylesheet" href="css/FX.css">

    <link media="all" type="text/css" rel="stylesheet" href="css/notifIt.css">

    <link media="all" type="text/css" rel="stylesheet" href="css/style.css">

    <link media="all" type="text/css" rel="stylesheet" href="css/footer.css">

    <link media="all" type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i">

    <link rel="shortcut icon" href="http://www.groovelist.co/favicon.ico">

    <style type="text/css">
        a{
            color: white;
        }
        .carousel-indicators{
            position: inherit;
            bottom: -20px;
            margin: 20px auto;
            width: 100%;
            left: 0;
        }
        .carousel-indicators li{
            border-color: #FA8800;
        }
        .carousel-indicators .active{
            background-color: #FA8800;
        }
    </style>
    <!-- Incluye los estilos solicitados desde las vistas -->

    <!-- Favicon -->
    <link rel="shortcut icon" href="/favicon.ico">
    <style type="text/css">.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:"lucida grande", tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}.fb_link img{border:none}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}
    .fb_dialog{background:rgba(82, 82, 82, .7);position:absolute;top:-10000px;z-index:10001}.fb_reset .fb_dialog_legacy{overflow:visible}.fb_dialog_advanced{padding:10px;-moz-border-radius:8px;-webkit-border-radius:8px;border-radius:8px}.fb_dialog_content{background:#fff;color:#333}.fb_dialog_close_icon{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 0 transparent;cursor:pointer;display:block;height:15px;position:absolute;right:18px;top:17px;width:15px}.fb_dialog_mobile .fb_dialog_close_icon{top:5px;left:5px;right:auto}.fb_dialog_padding{background-color:transparent;position:absolute;width:1px;z-index:-1}.fb_dialog_close_icon:hover{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -15px transparent}.fb_dialog_close_icon:active{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -30px transparent}.fb_dialog_loader{background-color:#f6f7f9;border:1px solid #606060;font-size:24px;padding:20px}.fb_dialog_top_left,.fb_dialog_top_right,.fb_dialog_bottom_left,.fb_dialog_bottom_right{height:10px;width:10px;overflow:hidden;position:absolute}.fb_dialog_top_left{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 0;left:-10px;top:-10px}.fb_dialog_top_right{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -10px;right:-10px;top:-10px}.fb_dialog_bottom_left{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -20px;bottom:-10px;left:-10px}.fb_dialog_bottom_right{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -30px;right:-10px;bottom:-10px}.fb_dialog_vert_left,.fb_dialog_vert_right,.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{position:absolute;background:#525252;filter:alpha(opacity=70);opacity:.7}.fb_dialog_vert_left,.fb_dialog_vert_right{width:10px;height:100%}.fb_dialog_vert_left{margin-left:-10px}.fb_dialog_vert_right{right:0;margin-right:-10px}.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{width:100%;height:10px}.fb_dialog_horiz_top{margin-top:-10px}.fb_dialog_horiz_bottom{bottom:0;margin-bottom:-10px}.fb_dialog_iframe{line-height:0}.fb_dialog_content .dialog_title{background:#6d84b4;border:1px solid #365899;color:#fff;font-size:14px;font-weight:bold;margin:0}.fb_dialog_content .dialog_title>span{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/yd/r/Cou7n-nqK52.gif) no-repeat 5px 50%;float:left;padding:5px 0 7px 26px}body.fb_hidden{-webkit-transform:none;height:100%;margin:0;overflow:visible;position:absolute;top:-10000px;left:0;width:100%}.fb_dialog.fb_dialog_mobile.loading{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/ya/r/3rhSv5V8j3o.gif) white no-repeat 50% 50%;min-height:100%;min-width:100%;overflow:hidden;position:absolute;top:0;z-index:10001}.fb_dialog.fb_dialog_mobile.loading.centered{width:auto;height:auto;min-height:initial;min-width:initial;background:none}.fb_dialog.fb_dialog_mobile.loading.centered #fb_dialog_loader_spinner{width:100%}.fb_dialog.fb_dialog_mobile.loading.centered .fb_dialog_content{background:none}.loading.centered #fb_dialog_loader_close{color:#fff;display:block;padding-top:20px;clear:both;font-size:18px}#fb-root #fb_dialog_ipad_overlay{background:rgba(0, 0, 0, .45);position:absolute;bottom:0;left:0;right:0;top:0;width:100%;min-height:100%;z-index:10000}#fb-root #fb_dialog_ipad_overlay.hidden{display:none}.fb_dialog.fb_dialog_mobile.loading iframe{visibility:hidden}.fb_dialog_content .dialog_header{-webkit-box-shadow:white 0 1px 1px -1px inset;background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#738ABA), to(#2C4987));border-bottom:1px solid;border-color:#1d4088;color:#fff;font:14px Helvetica, sans-serif;font-weight:bold;text-overflow:ellipsis;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0;vertical-align:middle;white-space:nowrap}.fb_dialog_content .dialog_header table{-webkit-font-smoothing:subpixel-antialiased;height:43px;width:100%}.fb_dialog_content .dialog_header td.header_left{font-size:12px;padding-left:5px;vertical-align:middle;width:60px}.fb_dialog_content .dialog_header td.header_right{font-size:12px;padding-right:5px;vertical-align:middle;width:60px}.fb_dialog_content .touchable_button{background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#4966A6), color-stop(.5, #355492), to(#2A4887));border:1px solid #29487d;-webkit-background-clip:padding-box;-webkit-border-radius:3px;-webkit-box-shadow:rgba(0, 0, 0, .117188) 0 1px 1px inset, rgba(255, 255, 255, .167969) 0 1px 0;display:inline-block;margin-top:3px;max-width:85px;line-height:18px;padding:4px 12px;position:relative}.fb_dialog_content .dialog_header .touchable_button input{border:none;background:none;color:#fff;font:12px Helvetica, sans-serif;font-weight:bold;margin:2px -12px;padding:2px 6px 3px 6px;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog_content .dialog_header .header_center{color:#fff;font-size:16px;font-weight:bold;line-height:18px;text-align:center;vertical-align:middle}.fb_dialog_content .dialog_content{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat 50% 50%;border:1px solid #555;border-bottom:0;border-top:0;height:150px}.fb_dialog_content .dialog_footer{background:#f6f7f9;border:1px solid #555;border-top-color:#ccc;height:40px}#fb_dialog_loader_close{float:left}.fb_dialog.fb_dialog_mobile .fb_dialog_close_button{text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog.fb_dialog_mobile .fb_dialog_close_icon{visibility:hidden}#fb_dialog_loader_spinner{animation:rotateSpinner 1.2s linear infinite;background-color:transparent;background-image:url(http://static.xx.fbcdn.net/rsrc.php/v3/yD/r/t-wz8gw1xG1.png);background-repeat:no-repeat;background-position:50% 50%;height:24px;width:24px}@keyframes rotateSpinner{0%{transform:rotate(0deg)}100%{transform:rotate(360deg)}}
    .fb_iframe_widget{display:inline-block;position:relative}.fb_iframe_widget span{display:inline-block;position:relative;text-align:justify}.fb_iframe_widget iframe{position:absolute}.fb_iframe_widget_fluid_desktop,.fb_iframe_widget_fluid_desktop span,.fb_iframe_widget_fluid_desktop iframe{max-width:100%}.fb_iframe_widget_fluid_desktop iframe{min-width:220px;position:relative}.fb_iframe_widget_lift{z-index:1}.fb_hide_iframes iframe{position:relative;left:-10000px}.fb_iframe_widget_loader{position:relative;display:inline-block}.fb_iframe_widget_fluid{display:inline}.fb_iframe_widget_fluid span{width:100%}.fb_iframe_widget_loader iframe{min-height:32px;z-index:2;zoom:1}.fb_iframe_widget_loader .FB_Loader{background:url(http://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat;height:32px;width:32px;margin-left:-16px;position:absolute;left:50%;z-index:4}
    .fb_invisible_flow{display:inherit;height:0;overflow-x:hidden;width:0}.fb_mobile_overlay_active{height:100%;overflow:hidden;position:fixed;width:100%}.fb_shrink_active{opacity:1;transform:scale(1, 1);transition-duration:200ms;transition-timing-function:ease-out}.fb_shrink_active:active{opacity:.5;transform:scale(.75, .75)}</style></head>

<body>

<div class="signup-header">
    <div class="signup-header-content">
        <span>Crea oportunidades para encontrar músicos, proyectos musicales y empresas.</span>
        <ul>
            <li>
                <a href="#signup">Comienza Ahora</a>
            </li>
        </ul>
    </div>
</div>

<div class="slide-1" id="signup">

    <div class="header sticky">

        <div id="mySidenav" class="sidenav fixed-top">
            <li style="display:flex;justify-content:center;">
                <a href="http://www.groovelist.co" style="margin: 0 auto">
                    <img src="http://www.groovelist.co/assets/img/logos/logoMain.png" alt="groovelist-logo">
                </a>
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">
                    <i class="lnr lnr-cross"></i>
                </a>
            </li>
            <li>
                <form method="POST" action="http://www.groovelist.co/lang" accept-charset="UTF-8"><input name="_token" type="hidden" value="nLPrBTOZpeESdfrVFVtUChMSK7lcBFjfxura7Uit">
                    <div class="btn-group bootstrap-select"><button type="button" class="btn dropdown-toggle btn-default" data-toggle="dropdown" title="Español"><span class="filter-option pull-left">Español</span>&nbsp;<span class="bs-caret"><span class="caret"></span></span></button><div class="dropdown-menu open"><ul class="dropdown-menu inner" role="menu"><li data-original-index="0" class="selected"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">Español</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="1"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">English</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="2"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">Português</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li></ul></div><select onchange="submit()" class="selectpicker" name="lang" tabindex="-98"><option value="es">Español</option><option value="en">English</option><option value="por">Português</option></select></div>
                </form>
            </li>
            <li>
                <a class="BtnGeneral BtnAnchor orangeBtn btn-block" href="http://www.groovelist.co/servicios">Crear una convocatoria</a>
            </li>
            <li>
                <button class="btn BtnGeneral orangeBtn" onclick="closeNav();showSignSection(1);changeSection(1);window.location.href='#signup'">Ingresar</button>
            </li>
        </div>

        <div class="header-content">
            <a href="http://www.fueradelgarage.com.pe">
                <img src="images/logo.png" alt="logo">
            </a>
            <span class="mobile-nav" onclick="openNav()">
					<i class="fa fa-bars"></i>
				</span>
            <ul>
                <li>
                    <img src="images/logo.png" alt="groovelist-logo">
                    <span>
							<i class="fa fa-close" onclick="mobileMenu(2)"></i>
						</span>
                </li>
                <li>

                </li>
                <li>
                    <a class="BtnGeneral BtnAnchor orangeBtn btn-block" href="http://www.groovelist.co/servicios">Crear una convocatoria</a>
                </li>
                <li>
                    <a href="#signup" class="border-button" onclick="showSignSection(1);changeSection(1)">Ingresar</a>
                </li>
            </ul>
        </div>
    </div>

    <div class="elements">
        <div class="title">
            <br>
            <h3>La red de negocios de la industria musical</h3>
            <h4 style="margin-bottom: 0px">Conéctate con músicos, festivales, bares, radios y mucho más!</h4>
            <h4 style="margin-top: 5px;">Haz crecer tu carrera y aumenta tus expectativas de éxito.</h4>
        </div>
        <div class="benefits">
            <div class="user-box space">
                <div class="user-box-header">
                    <h3>Soy músico o manager</h3>
                    <!--<p>Tengo o represento una banda</p>-->
                </div>
                <br>
                <ul>
                    <li>
                        <p>Quiero tocar en vivo y mostrar mi banda o la que represento</p>
                    </li>
                    <li>
                        <p>Necesito músicos para mi proyecto</p>
                    </li>
                    <li>
                        <p>Necesito más exposición para mi banda</p>
                    </li>
                </ul>
                <div class="call-to-action">
                    <a class="BtnGeneral btnAnchor orangeBtn BtnFullWidth" href="http://www.groovelist.co/signup/musician"><b>Comenzar</b></a>
                    <a class="BtnGeneral btnAnchor orangeBtn BtnFullWidth" href="http://www.groovelist.co/epkgratis"><b>Más información</b></a>
                </div>

            </div>
            <div class="user-box">
                <div class="user-box-header">
                    <h3>Soy promotor o tengo una empresa</h3>
                </div>
                <br>
                <ul>
                    <li>
                        <p>Necesito bandas para mi festival, club o radio</p>
                    </li>
                    <li>
                        <p>Necesito revisar y seleccionar bandas de forma simple y fácil</p>
                    </li>
                    <li>
                        <p>Necesito promover mi festival, club o radio</p>
                    </li>
                </ul>
                <div class="call-to-action">
                    <a class="BtnGeneral btnAnchor orangeBtn BtnFullWidth" href="http://www.groovelist.co/signup/organization"><b>Comenzar</b></a>
                    <a class="BtnGeneral btnAnchor orangeBtn BtnFullWidth" href="http://www.groovelist.co/servicios"><b>Más información</b></a>
                </div>
            </div>
            <div class="user-box" id="mobile-signup">
                <div class="user-box-header">
                    <h3>¡Regístrate aquí en GrooveList!</h3>
                </div>
                <br>
                <ul>
                    <li>
                        <p>Necesito revisar y seleccionar bandas de forma simple y fácil</p>
                        <a class="BtnGeneral btnAnchor orangeBtn btn-block" href="http://www.groovelist.co/signup/organization"><b>Registrarme como actor de industria</b></a>
                    </li>
                    <br>
                    <li>
                        <p>Quiero tocar en vivo y mostrar mi banda o la que represento</p>
                        <a class="BtnGeneral btnAnchor orangeBtn btn-block" href="http://www.groovelist.co/signup/musician"><b>Registrarme como músico o manager</b></a>
                    </li>
                    <br>
                    <li>
                        <p>¿Tienes una cuenta? ¡Ingresa aquí!</p>
                        <a href="#signup" class="BtnGeneral btnAnchor orangeBtn btn-block" onclick="showSignSection(1);changeSection(1)"><b>Ingresar</b></a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="sign-user-box" id="industry-actor-sign">
            <div class="user-menu">
                <ul>
                    <li onclick="changeSection(1)" class="active">
                        <i class="glyphicon glyphicon-user space"></i>
                        <h6>Ingresar</h6>
                    </li>
                    <span onclick="changeSection(2)">
							<i class="lnr lnr-cross"></i>
						</span>
                </ul>
            </div>

            <div id="divLogin">
                <form method="POST" action="http://www.groovelist.co/login" accept-charset="UTF-8" id="sigin-form" novalidate="novalidate"><input name="_token" type="hidden" value="nLPrBTOZpeESdfrVFVtUChMSK7lcBFjfxura7Uit">

                    <div class="form-group">
                        <div class="input-group">
			<span class="input-group-addon">
				<i class="glyphicon glyphicon-user"></i>
			</span>
                            <input class="form-control input-lg" placeholder="Correo" required="true" name="username" type="text" value="" aria-required="true">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="input-group">
			<span class="input-group-addon">
				<i class="fa fa-key"></i>
			</span>
                            <input type="password" class="form-control input-lg" id="login-input" name="password" placeholder="Contraseña" required="true" aria-required="true">
                        </div>
                    </div>

                    <button class="BtnGeneral orangeBtn BtnFullWidth" type="submit" id="btnLoginLanding">Ingresar</button>
                    <div id="status"></div>

                </form>

                <button id="Face-btn" class="BtnGeneral faceBtn BtnFullWidth form-group" onclick="logInWithFacebook()">
                    <i class="fa fa-facebook" style="margin-right:10px"></i>Ingresa con tu cuenta de Facebook
                </button>
                <a class="passwordForgot" onclick="passwordRecovery(1);">¿Perdiste tu contrasña?</a>

            </div>

            <div id="divPassword" style="display: none;">
                <div class="form-group">
                    <div class="input-group">
			<span class="input-group-addon">
				<i class="fa fa-envelope-o"></i>
			</span>
                        <input type="email" class="form-control input-lg" id="emailPassword" name="emaiml" placeholder="Ingresa tu correo para recibir una nueva contraseña" required="true">
                    </div>
                </div>

                <button id="btn-restorePassword" class="BtnGeneral greenBtn BtnFullWidth" onclick="sendRestorePassword();">Enviar</button>

                <div class="passwordForgot" onclick="passwordRecovery(2);" style="cursor:pointer">
                    Atrás
                </div>
            </div>

        </div>
    </div>
    <!-- <a class="BtnGeneral orangeBtn learnMore" href="#about">Saber más</a> -->
</div>

<div class="footer" id="footer">
    <div class="elements">
        <ul>
            <li>
                <a href="#">Términos y condiciones</a>
            </li>
        </ul>
        <ul>
            <li>
                ¿Necesitas artistas para tu venue, radio o festival?
            </li>
            <li>
                Comunicate a: maximiliano@groovelist.co
            </li>
            <!-- <li>
                <p>GrooveList 2017 ®</p>
            </li> -->
        </ul>
        <ul>
            <li>
                Redes Sociales
            </li>
            <li class="brands">
                <a href="https://www.facebook.com/ifideasfactory/" target="_blank"><img src="https://cdn1.iconfinder.com/data/icons/iconza-circle-social/64/697057-facebook-512.png" alt="iF"></a>
                <a href="https://www.facebook.com/ImagineLabCL/" target="_blank"><img src="https://images.vexels.com/media/users/3/132820/isolated/preview/d11844f41c096089bcb8e83414111313-youtube-bubble-icon-by-vexels.png" alt="imaginelab"></a>
                <a href="https://www.facebook.com/consejodelacultura/" target="_blank"><img src="http://icons.iconarchive.com/icons/sicons/basic-round-social/512/twitter-icon.png" alt="cnca"></a>
            </li>
        </ul>
    </div>
</div>



<!-- Javascript -->
<script id="facebook-jssdk" src="//connect.facebook.net/en_US/sdk.js"></script><script type="text/javascript" async="" src="http://stats.g.doubleclick.net/dc.js"></script><script async="" src="//www.google-analytics.com/analytics.js"></script><script type="text/javascript" async="" src="http://cdn.mxpnl.com/libs/mixpanel-2.2.min.js"></script><script src="http://www.groovelist.co/assets/js/jquery-2.1.0.min.js"></script>

<script src="http://www.groovelist.co/assets/js/bootstrap.min.js"></script>

<script src="http://www.groovelist.co/assets/js/jquery.toastmessage.js"></script>

<script src="http://www.groovelist.co/assets/js/jquery.validate.min.js"></script>

<script src="http://www.groovelist.co/assets/js/notifIt.min.js"></script>


<script src="http://www.groovelist.co/assets/js/validateFormHome.js"></script>

<script src="http://www.groovelist.co/assets/js/bootstrap-select.min.js"></script>

<!-- Analytics -->
<script src="http://www.groovelist.co/assets/js/mixpanel.js"></script>

<script src="http://www.groovelist.co/assets/js/googleAnalytics.js"></script>



<script type="text/javascript">
    $(document).ready(function() {

        logInWithFacebook = function() {
            FB.login(function(response) {
                if (response.authResponse) {
                    window.location = "http://www.groovelist.co/facebook/login"
                } else {
                    alert('User cancelled login or did not fully authorize.');
                }
            },{scope: 'public_profile, email'});
            return false;
        };

        window.fbAsyncInit = function() {
            FB.init({
                appId		: '572125409553496',
                xfbml		: false,
                cookie		: true,
                version		: 'v2.8'
            });
        };

        (function(d, s, id){
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) {return;}
            js = d.createElement(s); js.id = id;
            js.src = "//connect.facebook.net/en_US/sdk.js";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));

    });
</script>


<script type="text/javascript">

    // ====================================================================
    // SignIn & SignUp Forms
    // ====================================================================

    function showSignSection(nType) {

        switch(nType) {
            case 1:
                $('#industry-actor-sign').removeClass('fadeOut').addClass('fadeInFast').css('display','flex');
                // $('.slide-1 .elements .title').hide();
                $('.benefits').hide();
                break;
            case 2:
                $('#industry-actor-sign').hide();
                $('.benefits').removeClass('fadeOut').addClass('fadeInFast').css('display','flex');
                break;
        }

    }

    function changeSection(ntype) {

        switch(ntype) {
            case 1:
                $('#divLogin').removeClass('fadeOut').addClass('fadeInFast').css('display','flex');
                $('#divPassword').hide();
                $('.user-menu ul li').removeClass('active');
                $('.user-menu ul li:last-child').addClass('active');
                break;
            case 2:
                $('.sign-user-box').addClass('fadeOut').removeClass('fadeInFast').css('display','none');
                $('#divPassword').hide();
                $('.slide-1 .title').fadeIn();
                $('.slide-1 .benefits').fadeIn();
                break;
        }

    }

    function passwordRecovery(nType) {
        switch(nType) {
            case 1:
                $('#divPassword').removeClass('fadeOut').addClass('fadeInFast').css('display','flex');
                $('#divLogin').hide();
                break;
            case 2:
                $('#divLogin').removeClass('fadeOut').addClass('fadeInFast').css('display','flex');
                $('#divPassword').hide();
                break;
        }
    }

    function mobileMenu(nType) {
        switch (nType) {
            case 1:
                $('.header-content ul').css('margin', '-10px calc(-100% + 40px)');
                break;
            case 2:
                $('.header-content ul').css({marginLeft: 'calc(100% + 40px)'});
                break;
        }
    }

    $(document).ready(function(){

        $('.carousel').carousel();

        var mediaquery = window.matchMedia("(max-width: 710px)");
        if (mediaquery.matches) {
            $('.header-content ul li a').click(function(){
                $('.header-content ul').css({marginLeft: 'calc(100% + 40px)'});
            });
        }

        $('.user-menu ul li').click(function(){
            $('.user-menu ul li').removeClass('active');
            $(this).addClass('active');
        });

        $('#changeLanguage').on('change', function(e){
            $(this).closest('form').submit();
        });

        $('a').click(function(){
            $('html, body').animate({
                scrollTop: $( $(this).attr('href') ).offset().top
            }, 500);
            return false;
        });

        $(window).on("scroll", function () {
            if ($(this).scrollTop() > 200) {
                $('.header').addClass('sticky');
            } else {
                $('.header').removeClass('sticky');
            }
        });

        $(window).on("scroll", function () {
            if ($(this).scrollTop() > 500) {
                $('.signup-header').css('display','flex');
            } else {
                $('.signup-header').css('display','none');
            }
        });

        $(window).on("scroll", function () {
            if ($(this).scrollTop() > 700) {
                $('.signup-header').css('top','130px');
            } else {
                $('.signup-header').css('top','-50px');
            }
        });

        $('.how-it-works').find('.step').mouseover(function(){
            $('.step').css({opacity:'.5'});
            $(this).css({opacity:'1'});
        })
            .mouseout(function(){
                $('.step').css({opacity:'1'});
            });


    });

    function sendRestorePassword() {
        sMail = $('#emailPassword').val();
        $('#btn-restorePassword').prop('disabled', true);

        $('#modalLogin').modal('hide');

        $.ajax({
            url: "/sendrestorepassword",
            type: "POST",
            data: 'emailPassword=' + sMail,
            success: function(result) {
                if (result==0) {
                    notif({
                        type: "success",
                        msg: "<b>Datos Correctos:</b> Pronto recibiras un correo."
                    });
                    setTimeout(function(){
                        location.reload();
                    }, 3000);
                }else{
                    notif({
                        type: "error",
                        msg: "<b>Error:</b> No se encontró el correo especificado."
                    });
                    $('#btn-restorePassword').prop('disabled', false);
                }
                //location.reload();
            }
        });
    }

    //---> Indentify
    sMPIdentify = '$this->Session->read("Mixpanel.identify")';

    if(sMPIdentify !== ''){
        mixpanel.identify(sMPIdentify);
    }

    //---> Track
    sMPTrack = '$this->Session->read("Mixpanel.track")';
    sMPTrack = sMPTrack.split('|');

    for (nItem = 0; nItem < sMPTrack.length; nItem++) {
        if (sMPTrack[nItem] !== '') {
            mixpanel.track(sMPTrack[nItem]);
        }
    }

    function openNav() {
        document.getElementById("mySidenav").style.width = "100%";
    }

    function closeNav() {
        document.getElementById("mySidenav").style.width = "0";
    }

</script>
</body>
</html>