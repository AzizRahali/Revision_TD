public class Medecin {
        private int cin;
        private String nom;
        private String prenom;
        private int numOrdre;
        public Medecin(int cin, String nom, String prenom, int numOrdre) {
            this.cin = cin;
            this.nom = nom;
            this.prenom = prenom;
            this.numOrdre = numOrdre;
        }
        public int getCin() {
            return cin;
        }
        public void setCin(int cin) {
            this.cin = cin;
        }
        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public int getNumOrdre() {
            return numOrdre;
        }
    public String toString() {
        return "Medecin{" +
                "cin=" + cin +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numOrdre=" + numOrdre +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Medecin medecin = (Medecin) obj;
        return cin == medecin.cin && numOrdre == medecin.numOrdre;
    }



}