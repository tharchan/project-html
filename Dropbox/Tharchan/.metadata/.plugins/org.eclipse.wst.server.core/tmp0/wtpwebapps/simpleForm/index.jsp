<!Doctype html>
<html>
	<head>
		<title>Simple Form</title>
		<LINK REL=StyleSheet href="css/style.css">
	</head>
	<body>
	<form method="get" action="convert.jsp" id="mainForm">
		Name <input type="text" id="txtName" value "" > <br><br>
		Preferred Color : 
		<input type="radio" name="color" value="Red" checked> Red
		<input type="radio" name="color" value="Blue"> Blue 
		<input type="radio" name="color" value="Green"> Green  <br><br>
		State Less Visited : 
		<select name="state">
				<option value="">Select One State</option>
				<option value="New York">New York</option>
				<option value="New Jersey">New Jersey</option>
				<option value="Minnesota">Minnesota</option>
				<option value="Chicago">Chicago</option>
				<option value="Detroit">Detroit</option>
		</select>
		<br><br>
		<input type="submit" value="submit" onclick="setTxtValue();">
		<script type="text/javascript">
		function setTxtValue(){
			var elem = document.getElementById("txtName");
			
			debugger;
		}
						
		</script>
	</form>
	 
	
	</body>
</html>