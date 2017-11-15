
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<head>
    <title>Music Max a Entertainment Category Flat Bootstrap Responsive Web Template | Home :: w3layouts</title>
    <!--css-->
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/index.css" rel="stylesheet" type="text/css" media="all" />
    <link rel="stylesheet" href="css/swipebox.css" type="text/css" media="all" />
    <!--css-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Music Max  Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
    <!--js-->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!--js-->
    <!--webfonts-->
    <link href='//fonts.googleapis.com/css?family=Nova+Round' rel='stylesheet' type='text/css'>
    <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
    <!--webfonts-->
    <script src="js/responsiveslides.min.js"></script>
    <script>
        $(function () {
            $("#slider").responsiveSlides({
                auto: true,
                nav: true,
                speed: 500,
                namespace: "callbacks",
                pager: true,
            });
        });
    </script>
    <!--Include jQuery & Filterizr-->
    <script src="js/jquery.filterizr.js"></script>
    <script src="js/controls.js"></script>
    <!--Kick off Filterizr-->
    <script type="text/javascript">
        $(function() {
            //Initialize filterizr with default options
            $('.filtr-container').filterizr();
        });
    </script>
    <!--gallery-->
    <!--startsmothscrolling-->
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event){
                event.preventDefault();
                $('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
            });
        });
    </script>
    <script src="js/jquery.swipebox.min.js"></script>
    <script type="text/javascript">
        jQuery(function($) {
            $(".swipebox").swipebox();
        });
    </script>
    <!--swipe box js-->
</head>
<body>
<!--header-->
<div class="header" id="home">
    <div class="header-top">
        <div class="container">
            <div class="social-icons">
                <a href="#"><i class="icon"></i></a>
                <a href="#"><i class="icon1"></i></a>
                <a href="#"><i class="icon2"></i></a>
                <a href="#"><i class="icon3"></i></a>
            </div>
            <div class="detail">
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="container">
        <div class="header-bottom">
            <div class=" logo ">
                <h1><a href="index.jsp">Fuera del Garage</a></h1>
            </div>
            <div class=" top-nav">
                <span class="menu"><img src="images/nav.png" alt=""/></span>
                <ul class="nav1">
                    <li><a href="index.html" class="active scroll">Home</a></li>
                    <li><a href="#about" class="scroll">Registro</a></li>
                    <li><a href="#services" class="scroll">Ingresar</a></li>
                    <li><a href="listUsers.jsp" class="scroll">Listar Usuarios</a></li>
                </ul>
                <!--script-for-menu-->
                <script>
                    $( "span.menu" ).click(function() {
                        $( "ul.nav1" ).slideToggle( 300, function() {
                            // Animation complete.
                        });
                    });
                </script>
                <!--script-for-menu-->
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--header-->
<!--banner-->
<div class="banner-section">
    <section class="slider">
        <div class="flexslider">
            <ul class="slides">
                <li>
                    <div class="slider-info">
                        <img src="images/ba1.jpg" class="img-responsive" alt="">
                    </div>
                    <div class="container">
                        <div class="banner-text">
                            <h3>The Rhythm of life</h3>
                            <p>We strive to deliver the very best possible work that’s available out there, at any time. That’s how we set ourselves apart from the competition.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="slider-info">
                        <img src="images/ba2.jpg" class="img-responsive" alt="">
                    </div>
                    <div class="container">
                        <div class="banner-text">
                            <h3>The Rhythm of life</h3>
                            <p>We strive to deliver the very best possible work that’s available out there, at any time. That’s how we set ourselves apart from the competition.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="slider-info">
                        <img src="images/ba3.jpg" class="img-responsive" alt="">
                    </div>
                    <div class="container">
                        <div class="banner-text">
                            <h3>The Rhythm of life</h3>
                            <p>We strive to deliver the very best possible work that’s available out there, at any time. That’s how we set ourselves apart from the competition.</p>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </section>
    <!--FlexSlider-->
    <script defer src="js/jquery.flexslider.js"></script>
    <script type="text/javascript">
        $(function(){
            SyntaxHighlighter.all();
        });
        $(window).load(function(){
            $('.flexslider').flexslider({
                animation: "slide",
                start: function(slider){
                    $('body').removeClass('loading');
                }
            });
        });
    </script>
    <!--FlexSlider-->
    <!--slider-->
</div>
<!--banner-->
    <div class="service-w3l" id="services">
        <div class="container">
            <h3 class="tittle"> Our Services</h3>
            <div class="border"></div>
            <div class="service-grids">
                <div class="col-md-3 ser-grid">
                    <div class="ser-top">
                        <div class="con hvr-shutter-in-horizontal">
                            <i class="glyphicon glyphicon-cog" aria-hidden="true"></i>
                        </div>
                        <h4>Timeline</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="col-md-3 ser-grid">
                    <div class="ser-top">
                        <div class="con hvr-shutter-in-horizontal">
                            <i class="glyphicon glyphicon-heart" aria-hidden="true"></i>
                        </div>
                        <h4>Party Events</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="col-md-3 ser-grid">
                    <div class="ser-top">
                        <div class="con hvr-shutter-in-horizontal">
                            <i class="glyphicon glyphicon-time" aria-hidden="true"></i>
                        </div>
                        <h4>Grunt Workflow</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="col-md-3 ser-grid">
                    <div class="ser-top">
                        <div class="con hvr-shutter-in-horizontal">
                            <i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>
                        </div>
                        <h4>50+ speakers</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="service-grids">
                <div class="col-md-3 ser-grid">
                    <div class="ser-top">
                        <div class="con hvr-shutter-in-horizontal">
                            <i class="glyphicon glyphicon-user" aria-hidden="true"></i>
                        </div>
                        <h4>7/24 Event</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="col-md-3 ser-grid">
                    <div class="ser-top">
                        <div class="con hvr-shutter-in-horizontal">
                            <i class="glyphicon glyphicon-headphones" aria-hidden="true"></i>
                        </div>
                        <h4>25+ Events</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="col-md-3 ser-grid">
                    <div class="ser-top">
                        <div class="con hvr-shutter-in-horizontal">
                            <i class="glyphicon glyphicon-bell" aria-hidden="true"></i>
                        </div>
                        <h4>50+ speakers</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="col-md-3 ser-grid">
                    <div class="ser-top">
                        <div class="con hvr-shutter-in-horizontal">
                            <i class="glyphicon glyphicon-picture" aria-hidden="true"></i>
                        </div>
                        <h4>Party Events</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    <div class="artists-agileits" id="artists">
        <div class="container">
            <h3 class="tittle">Artists</h3>
            <div class="border"></div>
            <div class="slider">
                <div class="callbacks_container">
                    <ul class="rslides" id="slider">
                        <li>
                            <div class="caption">
                                <div class="col-md-4 cap-left">
                                    <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal3"><img src="images/a3.jpg" class="img-responsive" alt=""/></a>
                                    <h4>Anderson</h4>
                                    <h5>Director, ABC</h5>
                                </div>
                                <div class="col-md-4 cap-left">
                                    <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal1"><img src="images/a1.jpg" class="img-responsive" alt=""/></a>
                                    <h4>John Thomson</h4>
                                    <h5>Director, ABC</h5>
                                </div>
                                <div class="col-md-4 cap-left">
                                    <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal2"><img src="images/a2.jpg" class="img-responsive" alt=""/></a>
                                    <h4>Mary Doe</h4>
                                    <h5>Director, ABC</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </li>
                        <li>
                            <div class="caption">
                                <div class="col-md-4 cap-left">
                                    <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal4"><img src="images/a4.jpg" class="img-responsive" alt=""/></a>
                                    <h4>Eva Adamson</h4>
                                    <h5>Director, ABC</h5>
                                </div>
                                <div class="col-md-4 cap-left">
                                    <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal5"><img src="images/a5.jpg" class="img-responsive" alt=""/></a>
                                    <h4>Tompson</h4>
                                    <h5>Director, ABC</h5>
                                </div>
                                <div class="col-md-4 cap-left">
                                    <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal3"><img src="images/a3.jpg" class="img-responsive" alt=""/></a>
                                    <h4>Anderson</h4>
                                    <h5>Director, ABC</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </li>
                        <li>
                            <div class="caption">
                                <div class="col-md-4 cap-left">
                                    <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal1"><img src="images/a1.jpg" class="img-responsive" alt=""/></a>
                                    <h4>John Thomson</h4>
                                    <h5>Director, ABC</h5>
                                </div>
                                <div class="col-md-4 cap-left">
                                    <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal3"><img src="images/a3.jpg" class="img-responsive" alt=""/></a>
                                    <h4>Anderson</h4>
                                    <h5>Director, ABC</h5>
                                </div>
                                <div class="col-md-4 cap-left">
                                    <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal5"><img src="images/a5.jpg" class="img-responsive" alt=""/></a>
                                    <h4>Tompson</h4>
                                    <h5>Director, ABC</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!--Biography-->
    <div class="biography-w3agile" id="biography">
        <div class="container">
            <h3 class="tittle1">Biography</h3>
            <div class="border1"></div>
            <div class="biography-grids">
                <div class="col-md-6 biography-grid">
                    <img src="images/s.jpg" class="img-responsive" alt=""/>
                </div>
                <div class="col-md-6 biography-grid">
                    <h4>Who are we?</h4>
                    <p>Curabitur pellentesque neque eget diam posuere porta. Quisque ut nulla at nunc vehicula lacinia. Proin adipiscing porta tellus, ut feugiat nibh adipiscing metus sit amet. In eu justo a felis faucibus ornare vel id metus. Sed hendrerit enim non justo posuere placerat. Phasellus eget purus vel mauris tincidunt tincidunt. Sed et nibh tortor faucibus pellentesque facilisis.</p>
                    <ul>
                        <li>Nam convallis non eros curabitur.</li>
                        <li> Donec vehicula suscipit oasselus.</li>
                        <li>Accumasan mauris tellus feugiat.</li>
                        <li>Sed hendrerit enim non justo.</li>
                        <li>Nam convallis non eros curabitur.</li>
                        <li>Nam convallis non eros curabitur.</li>
                        <li> Donec vehicula suscipit oasselus.</li>
                        <li>Accumasan mauris tellus feugiat.</li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    <!--Biography-->
</div>

<!--footer-->
<div class="copy-section">
    <div class="container">
        <div class="footer-top">
            <p>&copy; 2016 Music Max. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
        </div>
        <a href="#home" class="scroll top"><span class="glyphicon glyphicon-chevron-up" aria-hidden="true"></span></a>
    </div>
</div>
<!--footer-->

<div class="modal fade" id="myModal1" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content modal-info">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body">
                <div class="news-gr">
                    <img src="images/a1.jpg" class="img-responsive" alt=""/>
                    <h4>John Thomson</h4>
                    <div class="social">
                        <a href="#"><i class="icon"></i></a>
                        <a href="#"><i class="icon1"></i></a>
                        <a href="#"><i class="icon2"></i></a>
                        <a href="#"><i class="icon3"></i></a>
                    </div>
                    <p>Nam aliquam pretium feugiat. Duis sem est, viverra eu interdum ac, suscipit nec mauris. Suspendisse commodo tempor sagittis! In justo est, sollicitudin eu scelerisque pretium, placerat eget elit. Praesent faucibus rutrum odio at rhoncus. Pel ermentum pretium. Maecenas ac lacus ut neque rhoncus laoreet sed id tellus. Donec justo tellus.</p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content modal-info">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body">
                <div class="news-gr">
                    <img src="images/a2.jpg" class="img-responsive" alt=""/>
                    <h4>John Thomson</h4>
                    <div class="social">
                        <a href="#"><i class="icon"></i></a>
                        <a href="#"><i class="icon1"></i></a>
                        <a href="#"><i class="icon2"></i></a>
                        <a href="#"><i class="icon3"></i></a>
                    </div>
                    <p>Nam aliquam pretium feugiat. Duis sem est, viverra eu interdum ac, suscipit nec mauris. Suspendisse commodo tempor sagittis! In justo est, sollicitudin eu scelerisque pretium, placerat eget elit. Praesent faucibus rutrum odio at rhoncus. Pel ermentum pretium. Maecenas ac lacus ut neque rhoncus laoreet sed id tellus. Donec justo tellus.</p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content modal-info">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body">
                <div class="news-gr">
                    <img src="images/a3.jpg" class="img-responsive" alt=""/>
                    <h4>John Thomson</h4>
                    <div class="social">
                        <a href="#"><i class="icon"></i></a>
                        <a href="#"><i class="icon1"></i></a>
                        <a href="#"><i class="icon2"></i></a>
                        <a href="#"><i class="icon3"></i></a>
                    </div>
                    <p>Nam aliquam pretium feugiat. Duis sem est, viverra eu interdum ac, suscipit nec mauris. Suspendisse commodo tempor sagittis! In justo est, sollicitudin eu scelerisque pretium, placerat eget elit. Praesent faucibus rutrum odio at rhoncus. Pel ermentum pretium. Maecenas ac lacus ut neque rhoncus laoreet sed id tellus. Donec justo tellus.</p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="myModal4" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content modal-info">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body">
                <div class="news-gr">
                    <img src="images/a4.jpg" class="img-responsive" alt=""/>
                    <h4>John Thomson</h4>
                    <div class="social">
                        <a href="#"><i class="icon"></i></a>
                        <a href="#"><i class="icon1"></i></a>
                        <a href="#"><i class="icon2"></i></a>
                        <a href="#"><i class="icon3"></i></a>
                    </div>
                    <p>Nam aliquam pretium feugiat. Duis sem est, viverra eu interdum ac, suscipit nec mauris. Suspendisse commodo tempor sagittis! In justo est, sollicitudin eu scelerisque pretium, placerat eget elit. Praesent faucibus rutrum odio at rhoncus. Pel ermentum pretium. Maecenas ac lacus ut neque rhoncus laoreet sed id tellus. Donec justo tellus.</p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="myModal5" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content modal-info">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body">
                <div class="news-gr">
                    <img src="images/a5.jpg" class="img-responsive" alt=""/>
                    <h4>John Thomson</h4>
                    <div class="social">
                        <a href="#"><i class="icon"></i></a>
                        <a href="#"><i class="icon1"></i></a>
                        <a href="#"><i class="icon2"></i></a>
                        <a href="#"><i class="icon3"></i></a>
                    </div>
                    <p>Nam aliquam pretium feugiat. Duis sem est, viverra eu interdum ac, suscipit nec mauris. Suspendisse commodo tempor sagittis! In justo est, sollicitudin eu scelerisque pretium, placerat eget elit. Praesent faucibus rutrum odio at rhoncus. Pel ermentum pretium. Maecenas ac lacus ut neque rhoncus laoreet sed id tellus. Donec justo tellus.</p>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
