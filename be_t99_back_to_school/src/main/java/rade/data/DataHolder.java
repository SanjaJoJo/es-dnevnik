package rade.data;

public class DataHolder {
	// TODO Podatke cuvati u #mapama?
	// TODO Adrese prilagoditi podacima sa linka https://data.gov.rs/sr/datasets/
	
	// http://www.devizni.gov.rs/PDF/PR10%20-%20Sifarnik%20zemalja%20-%20lat.pdf
	protected static String[][] drzave = {
			{"0", "NA", "N/A", "Indeks države van opsega", "Indeks države van opsega"},
			{"70", "BA", "BIH", "Bosna i Hercegovina", "Evropa"},
			{"191", "HR", "HRV", "Hrvatska", "Evropa"},
			{"499", "ME", "MNE", "Crna Gora", "Evropa"},
			{"533", "AW", "ABW", "Aruba", "South America"},
			{"688", "RS", "SRB", "Srbija", "Evropa"},
			{"705", "SI", "SVN", "Slovenija", "Evropa"},
			{"807", "MK", "MKD", "Republika Makedonija", "Evropa"},
			{"1000", "", "", "Uraatnia", ""},
			{"1001", "", "", "Azdrad", ""}
	};
	
	// https://poslovne.com/postanski-broj-2/?fbclid=IwAR0ui9u0VRkUon9XVyrXlsrTAju8StMVtX6QM9Lo1I3RNmQdfoxpduiS6O8
	// https://www.neobilten.com/sifarnik-naseljenih-mesta-u-republici-srbiji/
	// http://kodekssifara.minrzs.gov.rs/documents/Sifarnik_opstina_u_Republici_Srbiji.pdf
	// http://www.cekos.rs/%C5%A1ifarnik-op%C5%A1tina-u-republici-srbiji
	protected static String[][] opstine = {
			{"0", "Indeks opštine van opsega", "", "0"},
			{"70149", "Beograd - Zvezdara", "", "688"},
			{"70181", "Beograd - Novi Beograd", "", "688"},
			{"70220", "Beograd - Savski venac", "", "688"},
			{"80284", "Novi Sad", "21000", "688"},
			{"71323", "Niš - Palilula", "", "688"},
			{"71307", "Niš - Pantele", "", "688"},
			{"70645", "Kragujevac", "", "688"},
			{"80438", "Subotica", "24000", "688"},
			{"70726", "Leskovac", "", "688"},
			{"70670", "Kruševac", "", "688"},
			{"70653", "Kraljevo", "", "688"},
			{"80152", "Zrenjanin", "", "688"},
			{"80314", "Pančevo", "", "688"},
			{"71242", "Čačak", "", "688"},
			{"71269", "Šabac", "", "688"},
			{"70874", "Novi Pazar", "", "688"},
			{"", "Sarajevo", "", "70"},
			{"", "Zagreb", "", "191"},
			{"", "Podgorica", "", "499"},
			{"", "Ljubljana", "", "705"},
			{"", "Skopje", "", "807"},
			{"", "Oranjestad", "", "533"},
			{"10000", "Uraatos", "", "1000"},
			{"", "Nassau", "", ""}
	};

	// https://data.gov.rs/sr/datasets/adresni-registar-shifarnik/
	// https://forum.openstreetmap.org/viewtopic.php?id=73217
	protected static String[] ulice = {
			"Indeks ulice van opsega",
			"Programerska",
			"Eklipse",
			"Učenički šor",
			"Praktikantska",
			"Bulevar palih juniora",
			"Palata Seniorskih Vladara",
			"Regruterski kvart",
			"Bulevar Oslobođenja",
			"Kneza Miloša",
			"Kralja Petra",
			"Kralja Aleksandra",
			"Kralja Milana",
			"Narodnog fronta",
			"Nemanjina",
			"Maršala Tolbuhina",
			"Vojvode Stepe",
			"Jevrejska",
			"Strahinjića Bana",
			"Nikole Pašića",
			"Slobodana Jovanovića",
			"Žarka Zrenjanina",
			"Veljka Vlahovića",
			"Dušana Radovića",
			"Mihajla Pupina",
			"Dečanska",
			"Braće Jerković",
			"Makenzijeva",
			"Sarajevska",
			"Maršala Tita",
			"Grabovačka",
			"Zadnja"
	};
	
	protected static String[] prezimena = {
			"Indeks prezimena van opsega",
		    "Kovač",
		    "Petrović",
		    "Horvat",
		    "Bašić",
		    "Pavlović",
		    "Jović",
		    "Kostić",
		    "Milošević",
		    "Nikolić",
		    "Vuković",
		    "Marković",
		    "Dukić",
		    "Bošković",
		    "Milojević",
		    "Popović",
		    "Radović",
		    "Stojanović",
		    "Đorđević",
		    "Đurić",
		    "Živković",
		    "Ivanović",
		    "Ljubičić",
		    "Matić",
		    "Novaković",
		    "Obradović",
		    "Ristić",
		    "Savić",
		    "Tadić",
		    "Vuletić",
		    "Anđelić",
		    "Cvetković",
		    "Gajić",
		    "Janković",
		    "Knežević",
		    "Milić",
		    "Nenadić",
		    "Perić",
		    "Radulović",
		    "Stanković",
		    "Todorović",
		    "Urošević",
		    "Vasić",
		    "Zorić",
		    "Arsić",
		    "Đoković",
		    "Gavrilović",
		    "Jevtić",
		    "Kuzmanović",
		    "Mladenović",
		    "Radosavljević"
	};

	protected static String[] imenaM = {
			"Indeks muškog imena van opsega",
		    "Marko",
		    "Nikola",
		    "Miloš",
		    "Vladimir",
		    "Srđan",
		    "Bojan",
		    "Dušan",
		    "Dejan",
		    "Goran",
		    "Zoran",
		    "Dragan",
		    "Nenad",
		    "Branislav",
		    "Milan",
		    "Slobodan",
		    "Dražen",
		    "Predrag",
		    "Željko",
		    "Miroslav",
		    "Aleksandar",
		    "Ivan",
		    "Luka",
		    "Petar",
		    "Dario"
	};

	protected static String[] imenaZ = {
			"Indeks ženskog imena van opsega",
		    "Maja",
		    "Jelena",
		    "Ana",
		    "Ivana",
		    "Sanja",
		    "Tatjana",
		    "Marija",
		    "Milena",
		    "Nataša",
		    "Biljana",
		    "Jasna",
		    "Olga",
		    "Ljiljana",
		    "Marina",
		    "Snežana",
		    "Mirjana",
		    "Danijela",
		    "Dragana",
		    "Vesna",
		    "Nada",
		    "Dubravka",
		    "Ljubica",
		    "Jelisaveta",
		    "Branka",
		    "Jadranka"
	};
	
	protected static String[] nadimci = {
			"Indeks nadimka van opsega",
			"Samotnjak",
			"Žilet",
			"Ledeni",
			"Vetar",
			"Jebivetar",
			"Grom",
			"Gonzales",
			"Feniks",
			"Orao",
			"Izviđač",
			"Kondor",
			"Sokol",
			"Vitez",
			"Bomba",
			"Divljak",
			"Ratnik",
			"Nindža",
			"Sova",
			"Šampion",
			"Borac",
			"Čelik",
			"Vulkan",
			"Vučko",
			"Kobra",
			"Ždrebac",
			"Pilot",
			"Zmaj",
			"Medo",
			"Jastreb",
			"Kometa",
			"Bumerang",
			"Munja",
			"Galeb",
			"Zver",
			"Top Gun",
			"Škorpion",
			"Gavran",
			"Pegaz",
			"Foka",
			"Panter",
			"Kameleon",
			"Bager",
			"Veverica",
			"Slepac"
	};
}