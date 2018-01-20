<?php

include ('db_function.php');
$response = array();

$result = displayAll();

if(mysqli_num_rows($result)>0) {

	$response["university"] = array();
	while ($row = mysqli_fetch_array($result)){
		$data = array();
		$data["unicode"]=$row["unicode"];
		$data["name"]=$row["name"];
		$data["address"]=$row["address"];
		$data["logo_path"]=$row["logo_path"];
		$data["unilink"]=$row["unilink"];
        array_push($response["university"], $data);
	}
		if($result){
			$response["success"] = 1;
			$response["message"] = "Successfully Displayed";
			echo json_encode($response);
		}
		else{
			$response["success"] = 0;
			$response["message"] = "Try Again";
			echo json_encode($response);
		}
}
else {
	// no results found
    $response["success"] = 0;
    $response["message"] = "No Details Found";
    echo json_encode($response);
}

if($db == true){
	mysqli_close($db);
}

?>
