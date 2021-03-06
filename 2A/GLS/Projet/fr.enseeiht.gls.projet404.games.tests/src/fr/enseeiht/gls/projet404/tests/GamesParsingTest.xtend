/*
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.tests

import com.google.inject.Inject
import fr.enseeiht.gls.projet404.games.Game
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(GamesInjectorProvider)
class GamesParsingTest{

	@Inject
	ParseHelper<Game> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
