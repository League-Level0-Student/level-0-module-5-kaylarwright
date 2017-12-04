package hi;

import javax.swing.JOptionPane;

public class recipe {
	public static void main(String[] args) {

		String recipe = JOptionPane
				.showInputDialog("What recipe would you like to see?  \n Spaghetti \n Chocolate Cake \n Hamburger");

		if (recipe.equalsIgnoreCase("Spaghetti")) {
			JOptionPane.showMessageDialog(null,
					"Combine ground beef, onion, garlic, and green pepper in a large saucepan. \n Cook and stir until meat is brown and vegetables are tender. \n Drain grease \n Stir diced tomatoes, tomato sauce, and tomato paste into the pan. \n Season with oregano, basil, salt, and pepper.");
		} else if (recipe.equalsIgnoreCase("Chocolate Cake")){
			JOptionPane.showMessageDialog(null,
					"Pre-heat oven to 350 degrees. \n " + "Grease and flour three 6\" X 1 1/2\" round cake pans. \n"
							+ "Mix together flour, cocoa powder, baking powder and baking soda. \n Set aside. \n"
							+ "In a large bowl, beat butter, eggs and vanilla. \n" + "Gradually add sugar.\n"
							+ "Beat on medium to high speed for about 3-4 minutes until well mixed \n"
							+ "Alternately combine in flour mixture and milk to batter while beating. \n"
							+ "Continue to beat until batter is smooth. \n"
							+ "Pour equal amounts of batter into greased and floured round cake pans. \n"
							+ "Bake 30 to 35 minutes. \n"
							+ "Check with a toothpick to see if it is done. \n Bake a few minutes more, if needed. \n"
							+ "Remove from oven and allow cakes to cool in pans for a few minutes. \n"
							+ "Place cakes on a wire rack, to them allow to completely cool.");
			
		} else if(recipe.equalsIgnoreCase("Hamburger")){
			JOptionPane.showMessageDialog(null, "Preheat grill for high heat."
					+ " \n In a large bowl, mix the ground beef, egg, bread crumbs, evaporated milk, Worcestershire sauce, cayenne pepper, and garlic using your hands. \n Form the mixture into 8 hamburger patties. \n"
					+ "Lightly oil the grill grate. \n Grill patties 5 minutes per side, or until well done.");
			
		} else{
			JOptionPane.showMessageDialog(null, "You Suck from Carmen C");
		}

	}
}