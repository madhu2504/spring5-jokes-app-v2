package in.madhusudanjoshi.jokesApp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		
		this.chuckNorrisQuotes = chuckNorrisQuotes;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}
	
}
