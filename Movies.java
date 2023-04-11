
class Movies {
    public static void main(String[] args) {
        String[] moviesTitle = {
                "Indiana Jones et le Temple Maudit", "Les Aventuriers de L'Arche Perdue",
                "Indiane Jones et la Dernière Croisade" };

        String[][] moviesActors = {

                { "Ke Huy Quan", "Harrisson Ford", "Kate Capshaw" },
                { "Harrisson Ford", "Karen Allen", "Paul Freeman" },
                { "Harrisson Ford", "Sean Connery", "Denholm Elliott" }
        };
        for (int i = 0; i < moviesTitle.length; i++) {
            System.out.println("Dans le film : " + moviesTitle[i] + " les principaux acteurs sont : "
                    + moviesActors[i][0] + ", " + moviesActors[i][1] + ", " + moviesActors[i][2]);
        }
    };
}
// System.out.println(movies1[0]);
// System.out.println(movies2[1]);
// System.out.println(movies3[2]);