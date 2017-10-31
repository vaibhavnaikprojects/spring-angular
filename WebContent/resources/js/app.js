var module = angular.module("fileuploadApp",[]);
module.controller("modelData",modelData);
function modelData($http){
	this.upload=function(option){
		console.log("tex");
	}
}