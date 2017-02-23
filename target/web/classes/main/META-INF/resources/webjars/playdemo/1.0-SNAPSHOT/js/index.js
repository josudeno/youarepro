(function() {
  $(function() {
    return $.get("/products", function(products) {
      return $.each(products, function(index, product) {
        return $('#products').append($("<li>").text(product.name));
      });
    });
  });

}).call(this);

//# sourceMappingURL=index.js.map
