<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html lang="en" ng-app='App'  ng-controller="AppCtrl">
<head>
  <meta charset="UTF-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=egde"/>
<title ng-bind="pageTitle"></title>


	<!-- LIBRARIES -->
	<script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.1/jquery.min.js'></script>
  <script src="https://code.angularjs.org/1.3.0/angular.min.js"></script>
  <script src="https://code.angularjs.org/1.3.0/angular-route.min.js"></script>
  <script src="https://code.angularjs.org/1.3.0/angular-resource.min.js"></script>
  <script src="https://code.angularjs.org/1.3.0/angular-sanitize.min.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.8/angular-ui-router.min.js"></script>
	
	<!-- STYLE / THEME -->
	
	<link rel="icon" href="../../favicon.ico">
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
	<link href="//cdncatalog.com/assets/flat-ui/css/flat-ui.css" rel="stylesheet">
	<link href="view/css/style.css" rel="stylesheet">
	
	<link href="/css/carousel.css" rel="stylesheet">

	<!-- THIS APP. -->
  <script src="webapp/resources/App.js"></script>
	<script src="webapp/resources/account.js"></script>
	<script src="webapp/resources/home.js"></script>
	
</head>

<body class="container">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#/home">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Projects</a></li>
        <li><a href="#/register">Register</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
        
    <div class="container-fluid">
     
		<!--/span-->
        <div class="row-fluid" ui-view="main"><!-- VIEWS --></div>

        </div><!--/span-->
      

	<br>
        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Goodwill 2016</p>
                </div>
            </div>
            <!-- /.row -->
        </footer>
</body>
</html>
