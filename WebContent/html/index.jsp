<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html ng-app="fileuploadApp">
<head>
<script src='<c:url="resources/js/angular.js"/>'></script>
<script src="/resources/js/app.js"></script>
<link href="/resources/css/styles.js"/>
<title>Demo</title>
</head>
<body ng-controller="fileController as fctrl">
	<h4>File Upload Demo</h4>
	 <input type="file" ng-model="fctrl.file"/>
	 <button type="button" ng-click="fctrl.upload()">Upload</button>
	 <div class="result">
	 </div>
</body>
</html>