<!DOCTYPE html>
<html>
  <head>
    <title>Gaucho Gardens</title>
    <#include "head.ftl" />

  </head>
  <body>
    <#include "navbar.ftl" />
    <div class="container" id="jumbotext">
      <div class="jumbotron">
        <h1 class='welcome-text'>
          Welcome to Gaucho Gardens!
        </h1>
      </div>
    </div>

    <div class=container">
	  <table>
		<tr>
			<td>
			  <p>${veg}</p>
			</td>
		</tr>
	  </table>
	</div>
   
  </body>
</html>
