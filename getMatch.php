<?php
	$id = $_GET["id"];
	$type = $_GET["type"];
	if(!is_numeric($id) || !is_numeric($type)) {
		die('parameter not valid');
	}
	$userName = "root";
	$pwd = "Voltree2015";
	$dbName = "test";
	$conn = mysql_connect("localhost:3306", $userName, $pwd);
	if (!$conn)
	{
		die('Could not connect: ' . mysql_error());
	}
	mysql_select_db($dbName, $conn);
	$result = mysql_query("select targetId from MathMSMT where id=".$id." and type=".$type);
	$arr = mysql_fetch_assoc($result);
	mysql_close($conn);
	echo $arr['targetId'];
?>