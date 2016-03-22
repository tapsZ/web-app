
<!DOCTYPE html>

<html ng-app="MyApp" ng-controller="AppCtrl">
  <head>
    <title ng-bind="pageTitle"></title>

 
	
	<!-- STYLE / THEME -->

	<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
	
	
	
  </head>
  <body>
    
          <div class="navbar-wrapper">
      <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Project name</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li ui-sref-active="active">
              <a href ui-sref="home">
                <i class="fa fa-home"></i>
                Home
              </a>
            </li>
            <li>
              <a href ui-sref="accountSearch">
                <i class="fa fa-book"></i>
                Search Accounts
              </a>
            </li>
               </ul>
            </div>
          </div>
        </nav>

      </div>
    </div>
      
  

    <div class="container" ui-view="main"></div>

    <footer class="footer">
      <div class="container">
        <p>Copyright &copy; Goodwill 2016</p>
      </div>
    </footer>
  </body>
 
  <script src="resources/external/angular.js"></script>
  <script src="resources/external/angular-base64.min.js" ></script> 
  <script src="resources/external/angular-hateoas.js" ></script> 
  <script src="resources/external/angular-route.min.js" ></script>
  <script src="resources/external/angular-resource.min.js" ></script>
  <script src="resources/external/angular-sanitize.min.js"></script>
  <script src="resources/external/angular-ui-router.min.js"></script>
   
  
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.8/angular-ui-router.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.7/angular-resource.min.js"></script>
	
	<!-- THIS APP. -->
		
  <script src="resources/app.js" ></script>
  <script src="resources/account.js" ></script>
  <script src="resources/home.js" ></script>
  <script src="resources/blog.js" ></script>  
    
    
</html>
