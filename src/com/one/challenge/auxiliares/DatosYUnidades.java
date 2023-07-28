package com.one.challenge.auxiliares;

public interface DatosYUnidades {
	
	/**
	 * Divisa con su valor en double que equivale 1 Peso Colombiano
	 * 
	 */
	double PESO_COLOMBIANO = 1;
	double CEDI = 0.0028;
	double CHELIN_KENIANO = 0.036;
	double CHELIN_SOMALI = 0.14;
	double CHELIN_TANZANO = 0.62;
	double CHELIN_UGANDES = 0.91;
	double BOLIVIANO = 0.0017;
	double COLON_COSTARRICENSE = 0.14;
	double COLON_SALVADORENYO = 0.0022;
	double CORONA_CHECA = 0.0055;
	double CORONA_DANESA = 0.0017;
	double CORONA_ISLANDESA = 0.033;
	double CORONA_NORUEGA = 0.0025;
	double CORONA_SUECA = 0.0026;
	double DINAR_ARGELINO = 0.034;
	double DOLAR_DE_HONG_KONG = 0.002;
	double DOLAR_NEOZELANDES = 0.00041;
	double DOLAR_ESTADOUNIDENSE = 0.00025;
	double EURO = 0.00023;
	double RAND_SUDAFRICANO = 0.0044;
	double REAL_BRASILENO = 0.0012;
	double RIYAL_SAUDI = 0.00094;
	double RUBLO_RUSO = 0.023;
	double RUPIA_INDIA = 0.021;
	double SUEVO_SEQUEL = 0.00093;
	double YEN_JAPONES = 0.035;
	double RENMINBI = 0.0018;

/**
 * aqui se pusieron los valores de las divisas en un array
 */
	double[] divisasValor = { 
			PESO_COLOMBIANO,		//0
			CEDI,					//1
			CHELIN_KENIANO,			//2
			CHELIN_SOMALI, 			//3				
			CHELIN_TANZANO, 		//4				
			CHELIN_UGANDES, 		//5			
			BOLIVIANO, 				//6				
			COLON_COSTARRICENSE,	//7				
			COLON_SALVADORENYO, 	//8				
			CORONA_CHECA,			//9 					
			CORONA_DANESA,			//10			
			CORONA_ISLANDESA, 		//11				
			CORONA_NORUEGA,			//12 					
			CORONA_SUECA, 			//13			
			DINAR_ARGELINO,		 	//14			
			DOLAR_DE_HONG_KONG, 	//15				
			DOLAR_NEOZELANDES, 		//16			
			DOLAR_ESTADOUNIDENSE, 	//17			
			EURO, 					//18			
			RAND_SUDAFRICANO, 		//19				
			REAL_BRASILENO, 		//20				
			RIYAL_SAUDI, 			//21				
			RUBLO_RUSO,				//22				
			RUPIA_INDIA,			//23				
			SUEVO_SEQUEL,			//24 					
			YEN_JAPONES, 			//25				
			RENMINBI,				//26			
	};
/**
 * aqui se puso el nombre de las divisas en un array en el mismo orden que en los valores
 */
	String[] divisasString = { 
			" Peso Colombiano",		//0
			" Cedi",				//1
			" Chelin Keniano",		//2
			" Chelin Somali", 		//3				
			" Chelin Tanzano", 		//4				
			" Chelin Ugandes", 		//5			
			" Boliviano", 			//6				
			" Colon Costarricense", //7				
			" Colon Salvadorenio",	//8					
			" Corona Checa",		//9			
			" Corona Danesa", 		//10				
			" Corona Islandesa",	//11 					
			" Corona Noruega", 		//12			
			" Corona Sueca", 		//13			
			" Dinar Argelino", 		//14				
			" Dolar de Hong Kong", 	//15			
			" Dolar Neozelandes", 	//16			
			" Dolar Estadounidense",//17			
			" Euro", 				//18				
			" Rand Sudafricano", 	//19				
			" Real Brasileno", 		//20				
			" Riyal Saudi",			//21						
			" Rublo Ruso", 			//22					
			" Rupia India", 		//23			
			" Suevo Sequel", 		//24			
			" Yen Japones", 		//25				
			" Renminbi", 			//26			
	};
	/**
	 * Datos de grados celsius, fahrenheit y kelvin con sus arrays
	 */
	double CELSIUS = 0.0;
	double FAHRENHEIT = 0.0;
	double KELVIN = 0.0;
	
	Double[] gradosValor = {
			CELSIUS,
			FAHRENHEIT,
			KELVIN
	};
	
	String[] grados = {
			" Grados Celsius ",
			" Grados Fahrenheit ",
			" Grados Kelvin "
	};
	
}
