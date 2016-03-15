

public class Connection 
{
	
	

	public static void main(String[] args) 
	{
		/*try {
			
			//table.main - kolejki
			//table.main tbody tr - ka¿dy wiersz kolejki
			//table.main tbody tr td b - dru¿yny i wynik
			
			//table.main2 tbody tr - tabela
            Document doc = Jsoup.connect("http://90minut.pl/liga/0/liga8069.html").get();
            Elements paragraphs = doc.select("table.main2 tbody tr td a");
            for(Element p : paragraphs) 
            {
            	System.out.println(p.text());
            	System.out.println();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } */
		
		League e = new League("http://www.90minut.pl/liga/0/liga8069.html");
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < e.scheduleOfTheLeague.size(); i++)
		{
			//System.out.println(e.scheduleOfTheLeague.get(i).toString());
		}
	}

}
