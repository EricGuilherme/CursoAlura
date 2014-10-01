

var atualizaDados = function(){
            var carrinhos = $(".carrinho");
            carrinhos.each( function(){
                var carrinho = $(this);
                var items = carrinho.find(".item-total:visible");
                var total = 0;
                for(var i=0; i < items.length; i++) {
                        var conteudo = $(items[i]).text();
                        var preco = parseFloat(conteudo);
                  	 	total= total += preco;
                }
                carrinho.find(".valor-total").text(total);
                carrinho.find(".total-itens").text(items.length);
            });

};

var removeItem = function(event){
	event.preventDefault();

	var self = $(this);
	self.closest("tr").hide();

	atualizaDados();
};

var undo = function(){

    var carrinho = $(this).closest('.carrinho');
    carrinho.find("tr:visible").removeClass("recuperado");
    
    var trs = carrinho.find("tr:hidden");
    trs.addClass("recuperado").show();
    atualizaDados();

};

// var geraPropraganda = function(){

// 	var propragandas[	
// 					"O que acha de comprar uma moto ?"
// 					"O que acha de comprar uma guitarra?"
// 					"O que acha de achar o que procura?"
// 					"O que acha de um carro ?"
// 					];

// 	var posicao = Math.floor(propragandas.length = Math.random());
// 	var texto = propragandas[posicao];
// 	var tr = $("<tr>").appendTo($("<tdf>"));
// 	tr.find("td").text(texto);
// 	return tr;			

// };

var aposInicializado = function(){
	atualizaDados();
	$(".undo").click(undo);
	$(".remove-item").click(removeItem);
};

$(aposInicializado);	

