<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="mainLayout" flush="true">
	<tiles:putAttribute name="title">
		Login Page
	</tiles:putAttribute>
	<tiles:putAttribute name="cssLinks">
		<link href="/css/main.css" rel="stylesheet" />
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
		THIS IS BODY HOHOHOH
		
		<button type="button" onClick="testButton();">SUBMIT ME PLEASE</button> 
	</tiles:putAttribute>
	<tiles:putAttribute name="jsLinks">
		<script src="/js/main.js"></script>
	</tiles:putAttribute>
</tiles:insertDefinition>