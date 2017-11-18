
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><head>
    <meta charset="utf-8">
    <title>Fuera del Garage</title>

    <!-- CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/linearicons.css">


    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/font-awesome.min.css">

    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/groovelistUI.css">

    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/glyphicons.css">

    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/notifIt.css">

    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/switchRadio/switchRadio.css">

    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/landing/style.css">

    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/signup.css">

    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/landing/footer.css">

    <link media="all" type="text/css" rel="stylesheet" href="http://www.groovelist.co/assets/css/bootstrap-select.min.css">

    <link media="all" type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i">


    <style type="text/css">
        .switch-field label{
            width: 50px
        }
        .switch-field input:checked + #switchoff {
            background-color: #CD6155;
            -webkit-box-shadow: none;
            box-shadow: none;
        }
    </style>

    <!-- Favicon -->
    <script id="facebook-jssdk" src="//connect.facebook.net/en_US/sdk.js"></script><script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.26/lang/es.js"></script><style type="text/css">.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:"lucida grande", tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}.fb_link img{border:none}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}
.fb_dialog{background:rgba(82, 82, 82, .7);position:absolute;top:-10000px;z-index:10001}.fb_reset .fb_dialog_legacy{overflow:visible}.fb_dialog_advanced{padding:10px;-moz-border-radius:8px;-webkit-border-radius:8px;border-radius:8px}.fb_dialog_content{background:#fff;color:#333}.fb_dialog_close_icon{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 0 transparent;cursor:pointer;display:block;height:15px;position:absolute;right:18px;top:17px;width:15px}.fb_dialog_mobile .fb_dialog_close_icon{top:5px;left:5px;right:auto}.fb_dialog_padding{background-color:transparent;position:absolute;width:1px;z-index:-1}.fb_dialog_close_icon:hover{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -15px transparent}.fb_dialog_close_icon:active{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -30px transparent}.fb_dialog_loader{background-color:#f6f7f9;border:1px solid #606060;font-size:24px;padding:20px}.fb_dialog_top_left,.fb_dialog_top_right,.fb_dialog_bottom_left,.fb_dialog_bottom_right{height:10px;width:10px;overflow:hidden;position:absolute}.fb_dialog_top_left{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 0;left:-10px;top:-10px}.fb_dialog_top_right{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -10px;right:-10px;top:-10px}.fb_dialog_bottom_left{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -20px;bottom:-10px;left:-10px}.fb_dialog_bottom_right{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -30px;right:-10px;bottom:-10px}.fb_dialog_vert_left,.fb_dialog_vert_right,.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{position:absolute;background:#525252;filter:alpha(opacity=70);opacity:.7}.fb_dialog_vert_left,.fb_dialog_vert_right{width:10px;height:100%}.fb_dialog_vert_left{margin-left:-10px}.fb_dialog_vert_right{right:0;margin-right:-10px}.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{width:100%;height:10px}.fb_dialog_horiz_top{margin-top:-10px}.fb_dialog_horiz_bottom{bottom:0;margin-bottom:-10px}.fb_dialog_iframe{line-height:0}.fb_dialog_content .dialog_title{background:#6d84b4;border:1px solid #365899;color:#fff;font-size:14px;font-weight:bold;margin:0}.fb_dialog_content .dialog_title>span{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yd/r/Cou7n-nqK52.gif) no-repeat 5px 50%;float:left;padding:5px 0 7px 26px}body.fb_hidden{-webkit-transform:none;height:100%;margin:0;overflow:visible;position:absolute;top:-10000px;left:0;width:100%}.fb_dialog.fb_dialog_mobile.loading{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ya/r/3rhSv5V8j3o.gif) white no-repeat 50% 50%;min-height:100%;min-width:100%;overflow:hidden;position:absolute;top:0;z-index:10001}.fb_dialog.fb_dialog_mobile.loading.centered{width:auto;height:auto;min-height:initial;min-width:initial;background:none}.fb_dialog.fb_dialog_mobile.loading.centered #fb_dialog_loader_spinner{width:100%}.fb_dialog.fb_dialog_mobile.loading.centered .fb_dialog_content{background:none}.loading.centered #fb_dialog_loader_close{color:#fff;display:block;padding-top:20px;clear:both;font-size:18px}#fb-root #fb_dialog_ipad_overlay{background:rgba(0, 0, 0, .45);position:absolute;bottom:0;left:0;right:0;top:0;width:100%;min-height:100%;z-index:10000}#fb-root #fb_dialog_ipad_overlay.hidden{display:none}.fb_dialog.fb_dialog_mobile.loading iframe{visibility:hidden}.fb_dialog_content .dialog_header{-webkit-box-shadow:white 0 1px 1px -1px inset;background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#738ABA), to(#2C4987));border-bottom:1px solid;border-color:#1d4088;color:#fff;font:14px Helvetica, sans-serif;font-weight:bold;text-overflow:ellipsis;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0;vertical-align:middle;white-space:nowrap}.fb_dialog_content .dialog_header table{-webkit-font-smoothing:subpixel-antialiased;height:43px;width:100%}.fb_dialog_content .dialog_header td.header_left{font-size:12px;padding-left:5px;vertical-align:middle;width:60px}.fb_dialog_content .dialog_header td.header_right{font-size:12px;padding-right:5px;vertical-align:middle;width:60px}.fb_dialog_content .touchable_button{background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#4966A6), color-stop(.5, #355492), to(#2A4887));border:1px solid #29487d;-webkit-background-clip:padding-box;-webkit-border-radius:3px;-webkit-box-shadow:rgba(0, 0, 0, .117188) 0 1px 1px inset, rgba(255, 255, 255, .167969) 0 1px 0;display:inline-block;margin-top:3px;max-width:85px;line-height:18px;padding:4px 12px;position:relative}.fb_dialog_content .dialog_header .touchable_button input{border:none;background:none;color:#fff;font:12px Helvetica, sans-serif;font-weight:bold;margin:2px -12px;padding:2px 6px 3px 6px;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog_content .dialog_header .header_center{color:#fff;font-size:16px;font-weight:bold;line-height:18px;text-align:center;vertical-align:middle}.fb_dialog_content .dialog_content{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat 50% 50%;border:1px solid #555;border-bottom:0;border-top:0;height:150px}.fb_dialog_content .dialog_footer{background:#f6f7f9;border:1px solid #555;border-top-color:#ccc;height:40px}#fb_dialog_loader_close{float:left}.fb_dialog.fb_dialog_mobile .fb_dialog_close_button{text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog.fb_dialog_mobile .fb_dialog_close_icon{visibility:hidden}#fb_dialog_loader_spinner{animation:rotateSpinner 1.2s linear infinite;background-color:transparent;background-image:url(https://static.xx.fbcdn.net/rsrc.php/v3/yD/r/t-wz8gw1xG1.png);background-repeat:no-repeat;background-position:50% 50%;height:24px;width:24px}@keyframes rotateSpinner{0%{transform:rotate(0deg)}100%{transform:rotate(360deg)}}
.fb_iframe_widget{display:inline-block;position:relative}.fb_iframe_widget span{display:inline-block;position:relative;text-align:justify}.fb_iframe_widget iframe{position:absolute}.fb_iframe_widget_fluid_desktop,.fb_iframe_widget_fluid_desktop span,.fb_iframe_widget_fluid_desktop iframe{max-width:100%}.fb_iframe_widget_fluid_desktop iframe{min-width:220px;position:relative}.fb_iframe_widget_lift{z-index:1}.fb_hide_iframes iframe{position:relative;left:-10000px}.fb_iframe_widget_loader{position:relative;display:inline-block}.fb_iframe_widget_fluid{display:inline}.fb_iframe_widget_fluid span{width:100%}.fb_iframe_widget_loader iframe{min-height:32px;z-index:2;zoom:1}.fb_iframe_widget_loader .FB_Loader{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat;height:32px;width:32px;margin-left:-16px;position:absolute;left:50%;z-index:4}
.fb_invisible_flow{display:inherit;height:0;overflow-x:hidden;width:0}.fb_mobile_overlay_active{height:100%;overflow:hidden;position:fixed;width:100%}.fb_shrink_active{opacity:1;transform:scale(1, 1);transition-duration:200ms;transition-timing-function:ease-out}.fb_shrink_active:active{opacity:.5;transform:scale(.75, .75)}</style></head>

<body style="">

<!-- <div class="header">

    <div class="content">

    </div>
</div> -->

<div class="sticky header">

    <div id="mySidenav" class="sidenav">
        <li style="display:flex;justify-content:center;">
            <a href="http://www.fueradelgarage.com.pe" style="margin: 0 auto">
                <img src="/images/logo.png">
            </a>
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">
                <i class="lnr lnr-cross"></i>
            </a>
        </li>
        <li>
            <button class="btn BtnGeneral orangeBtn" onclick="closeNav();showSignSection(1);changeSection(1);window.location.href='#signup'">Ingresar</button>
        </li>
    </div>

    <div class="header-content">
        <a href="http://www.fueradelgarage.com.pe">
            <img src="images/logo.png">
        </a>
        <span class="mobile-nav" onclick="openNav()">
				<i class="fa fa-bars"></i>
			</span>
    </div>
</div>

<div class="wrapper">

    <div class="wrapper-side">
        <h3>Conecta con músicos, managers y empresas!</h3>
        <img class="industry-img" src="http://www.groovelist.co/assets/img/signup-img.png">
    </div>

    <div class="wrapper-side">
        <div>
            <h3>Regístrate</h3>
        </div>
        <br>
        <form method="POST" action="http://www.groovelist.co/register/organization" accept-charset="UTF-8" id="signup-form" class="has-validation-callback" novalidate="novalidate"><input name="_token" type="hidden" value="kNP9NMgSxQlVtjCAIXyDUWSVqQMjbPqDStsJ8rJ0">
            <div class="form-horizontal">
                <div class="form-group">
                    <div class="input-group">
			<span class="input-group-addon">
				<i class="glyphicon glyphicon-user"></i>
			</span>
                        <input type="text" name="name" id="name" placeholder="Nickname" class="form-control input-md" data-validation="required" data-validation-error-msg="Ingrese su nickname">
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
			<span class="input-group-addon">
				<i class="glyphicon glyphicon-user"></i>
			</span>
                        <input type="text" name="lastname" id="name" placeholder="Password" class="form-control input-md" data-validation="required" data-validation-error-msg="Ingrese una contraseña">
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
			<span class="input-group-addon">
				<i class="glyphicon glyphicon-user"></i>
			</span>
                        <input type="text" name="username" id="username" placeholder="Description" class="form-control input-md" data-validation="email" data-validation-error-msg="Ingrese una descripción">
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
			<span class="input-group-addon">
				<i class="glyphicon glyphicon-user"></i>
			</span>
                        <input type="password" name="password" id="name" placeholder="Contraseña" class="form-control input-md" data-validation="required" data-validation-error-msg="Contraseña">
                    </div>
                </div>
                <div class="form-group">
                </div>
                <div class="form-group">
                    <p>
                        Al clickear registrarme, estarás aceptando los <a target="_blank" href="https://s3.amazonaws.com/groovelisttyc/Condiciones+y+T%C3%A9rminos+de+Uso+-+Groovelist.pdf">Términos y condiciones de uso</a> de GrooveList.</p>
                </div>

                <div class="form-group" style="display:flex">
                    <button class="BtnGeneral orangeBtn BtnFullWidth" type="submit" id="btnRegisterLanding">
                        Registrarme
                    </button>
                    <!--<button id="Face-btn" class="BtnGeneral faceBtn BtnHalfWidth" onClick="logInWithFacebook()">
                        <i class="fa fa-facebook space"></i>Ingresa con tu cuenta de Facebook
                    </button>-->
                </div>
            </div>


        </form>
    </div>
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



<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.26/jquery.form-validator.min.js"></script>
<script type="text/javascript">
    $.validate({
        lang: 'es'
    });
</script>

<!--
====================================================================
	JavaScript
====================================================================
-->
<script src="http://www.groovelist.co/assets/js/jquery-2.1.0.min.js"></script>

<script src="http://www.groovelist.co/assets/js/bootstrap.min.js"></script>

<script src="http://www.groovelist.co/assets/js/jquery.toastmessage.js"></script>

<script src="http://www.groovelist.co/assets/js/jquery.validate.min.js"></script>

<script src="http://www.groovelist.co/assets/js/jquery-ui-1.9.2.custom.min.js"></script>

<script src="http://www.groovelist.co/assets/js/bootstrap-select.min.js"></script>

<script type="text/javascript">

    function openNav() {
        document.getElementById("mySidenav").style.width = "100%";
    }

    function closeNav() {
        document.getElementById("mySidenav").style.width = "0";
    }

    $(document).on('ready',function(){


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


        $('.selectpicker').selectpicker();

        $("#signup-form").validate();

        $(document).on('change', '#country', function(){
            var url 	= '/getCity/'+$(this).val();

            $.ajax({
                url: url,
                type: 'POST',
                success: function(result) {
                    $('#city').html(result);
                    $('#city').selectpicker('refresh');
                },
                error: function(result){
                    notif({
                        type: "error",
                        msg: "<b>Error:</b> No se pudo procesar la solicitud.",
                        width: "all",
                        position: "center"
                    });
                }
            });
        });


        $('#changeLanguage').on('change', function(e){
            $(this).closest('form').submit();
        });

    });

</script>
<div id="fb-root" class=" fb_reset">
    <div style="position: absolute; top: -10000px; height: 0px; width: 0px;">
        <div>

        </div>
    </div>
    <div style="position: absolute; top: -10000px; height: 0px; width: 0px;">
        <div>
            <iframe name="fb_xdm_frame_http" frameborder="0" allowtransparency="true" allowfullscreen="true" scrolling="no" id="fb_xdm_frame_http" aria-hidden="true" title="Facebook Cross Domain Communication Frame" tabindex="-1" src="http://staticxx.facebook.com/connect/xd_arbiter/r/lY4eZXm_YWu.js?version=42#channel=f2941a548bd9544&amp;origin=http%3A%2F%2Fwww.groovelist.co" style="border: none;"></iframe>
            <iframe name="fb_xdm_frame_https" frameborder="0" allowtransparency="true" allowfullscreen="true" scrolling="no" id="fb_xdm_frame_https" aria-hidden="true" title="Facebook Cross Domain Communication Frame" tabindex="-1" src="https://staticxx.facebook.com/connect/xd_arbiter/r/lY4eZXm_YWu.js?version=42#channel=f2941a548bd9544&amp;origin=http%3A%2F%2Fwww.groovelist.co" style="border: none;"></iframe>
        </div>
    </div>
</div>
</body>
</html>
