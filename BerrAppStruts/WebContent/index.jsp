<%@ taglib prefix="s" uri="/struts-tags"%> 
<html>  
  <head>
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
  </head>
  <body>
  	<div class="row">
  		<div class="col-lg-9 col-offset-1">
  			<h1>BEER SELECTION PAGE</h1>
  		</div>
  	</div>
  	<div class="row">
  	 <div class="col-lg-3 col-offset-1">
  		<s:form action="SelectBeer">
		  <fieldset>
			<legend>Select beer characteristics</legend>
			<div class="form-group">
			<div class="row">			  
			  <div class="col-lg-6">
			  	<label for="beerColor">color</label>
				  <select class="form-control" name="beerColor">
					  <option>Light</option>
					  <option>Amber</option>
					  <option>Brown</option>
					  <option>Dark</option>					  
				  </select>
			   </div>
			  </div>			  
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		  </fieldset>
		</s:form>
	 </div>	  		
	</div>
    

    <!-- JavaScript plugins (requires jQuery) -->
    <script src="http://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Optionally enable responsive features in IE8 -->
    <script src="js/respond.js"></script>
  </body>
</html>