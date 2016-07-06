var app = angular.module('mdmPrototype', ['ngRoute','ui.grid'])

app.config(['$routeProvider',function ($routeProvider) {

     $routeProvider
     
         .when('/createcustomer', {
             templateUrl: "/createCustomer.html",
             controller: 'createCustomerController'
         })


 }])

