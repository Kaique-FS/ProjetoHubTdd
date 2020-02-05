# ProjetoHubTdd
Projeto de automação HUB_TDD

Src/main/java

- br.com.rsinet.hub.projetobdd.pageobjects

	CartPage: Classe responsável por armazenar os elementos da página do “Carrinho do Compras” da aplicação.

	HomePage:  Classe responsável por armazenar os elementos da página “Inicial/Principal” da aplicação.

	LogInPage: Classe responsável por armazenar os elementos da página de “LogIn/entrada” da aplicação.

	ProductPage: Classe responsável por armazenar os elementos da página de “produto” da aplicação.  

	RegisterPage: Classe responsável por armazenar os elementos da página de “registro” da aplicação.  

	SearchPage:  Classe responsável por armazenar os elementos da página de “pesquisa” da aplicação.

- br.com.rsinet.hub.projetobdd.utility

	Constant: Responsável por definir as instancias necessárias para aplicação.

	Driver: Responsável por instanciar o objeto WebDriver.

	ExcelUtils: Responsável pela leitura da massa de dados do excel.

	ProductsMouse: Classe responsável por armazenar os elementos de produtos do pagina de “mouses/mice” da aplicação.  

	ScreenShot: Classe responsável por criar e definir o local dos prints/screenshots. 

Src/test/java

- br.com.rsinet.hub.projetobdd.testes

	NotRegister: Classe Responsável por rodar o teste de “não cadastrar um usuário/cadastrar um usuário já existente”.

	Register: Classe Responsável por rodar o teste de “cadastrar um usuário”.

	RegisterExcel: Classe Responsável por rodar o teste de “cadastrar um usuário” através da massa de dados do excel.

	SearchProductHome: Classe Responsável por rodar o teste de “Pesquisa de produto pela página inicial”.

	SearchProductHomeInvalid: Classe Responsável por rodar o teste de “Pesquisa de produto pela página inicial e não encontrar o produto selecionado”.

	SearchProductLupa: Classe Responsável por rodar o teste de “Pesquisa de produto pela barra de pesquisa”.

	SearchProductLupaInvalid: Classe Responsável por rodar o teste de “Pesquisa de produto pela barra de pesquisa inexistente”. 
