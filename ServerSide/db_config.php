<?php
/**
 * Database config variables
 */
define("DB_HOST", "localhost");
define("DB_USER", "");
define("DB_PASSWORD", "");
define("DB_DATABASE", "");

$db = mysqli_connect(DB_HOST,DB_USER,DB_PASSWORD,DB_DATABASE);

	if($db == false){
		echo "No connection";
	}
?>
