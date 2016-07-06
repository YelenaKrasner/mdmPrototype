 app.controller('createCustomerController', ['$scope','$http', function($scope,$http) {
			$scope.response = {}
         	$scope.getCustomer = function () {
         		return $http.get('/getCustomer').then(function (response) {
            $scope.response = response.data
            return response;
         	})};
    }]);