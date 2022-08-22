
  package com.example.demo.entity;
  
  import static javax.persistence.GenerationType.IDENTITY;
  
  import java.util.Date; import java.util.HashSet; import java.util.Set;
  
  import javax.persistence.Column; import javax.persistence.Entity; import
  javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
  javax.persistence.Id; import javax.persistence.JoinColumn; import
  javax.persistence.ManyToOne; import javax.persistence.OneToMany; import
  javax.persistence.Table; import javax.persistence.Temporal; import
  javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
  
  @Entity
  @JsonIgnoreProperties({"hibernateLazyInitializer"})
  @Table(name = "soumissionnaire") 
  public class Soumissionnaire implements java.io.Serializable {
  
  

	  private static final long serialVersionUID = 1L;
		private Integer soumissionnaireReference;
		private Fonction fonction;
		private Formejuridique formejuridique;
		private String soumissionnaireRaisonSociale;
		private Float soumissionnaireCapital;
		private String soumissionnaireMatriculeFiscal;
		private String soumissionnaireAdresseSiegeSocial;
		private String soumissionnaireAffiliationCnss;
		private String soumissionnaireNumeroRib;
		private String soumissionnaireLieuOuvertureCompte;
		private Date soumissionnaireAnneeCreation;
		private String soumissionnaireIdentifiant;
		private String soumissionnaireNom;
		private String soumissionnairePrenom;
		private String soumissionnaireTel;
		private String soumissionnaireFax;
		private String soumissionnaireMailEntreprise;
		private String soumissionnaireSiteWeb;
		private String soumissionnaireTitreRep;
		private String soumissionnaireMailRep;
		private String soumissionnaireTelRep;
		private TypeMarche typeMarche;
		private Gouvernerat gouvernorat;
		private Ville ville;
		private Pays pays;
		private String soumissionnaireNumeroRegistreCommerce;
		private int codePostaleId; 
		private Etat etat ;
		private Etat soumissionnaireEtatCompte;
		private String soumissionnaireAutreAdresse;
		
//		private Set<Soumission> soumissions = new HashSet<Soumission>(0);

		public Soumissionnaire() {
		}

		public Soumissionnaire(Formejuridique formejuridique) {
			this.formejuridique = formejuridique;
		}

		public Soumissionnaire(Fonction fonction, Formejuridique formejuridique,
				String soumissionnaireRaisonSociale, Float soumissionnaireCapital,
				String soumissionnaireMatriculeFiscal,
				String soumissionnaireAdresseSiegeSocial,
				String soumissionnaireAffiliationCnss,
				String soumissionnaireNumeroRib,
				String soumissionnaireLieuOuvertureCompte,
				Date soumissionnaireAnneeCreation,
				String soumissionnaireIdentifiant, String soumissionnaireNom,
				String soumissionnairePrenom) {
			this.fonction = fonction;
			this.formejuridique = formejuridique;
			this.soumissionnaireRaisonSociale = soumissionnaireRaisonSociale;
			this.soumissionnaireCapital = soumissionnaireCapital;
			this.soumissionnaireMatriculeFiscal = soumissionnaireMatriculeFiscal;
			this.soumissionnaireAdresseSiegeSocial = soumissionnaireAdresseSiegeSocial;
			this.soumissionnaireAffiliationCnss = soumissionnaireAffiliationCnss;
			this.soumissionnaireNumeroRib = soumissionnaireNumeroRib;
			this.soumissionnaireLieuOuvertureCompte = soumissionnaireLieuOuvertureCompte;
			this.soumissionnaireAnneeCreation = soumissionnaireAnneeCreation;
			this.soumissionnaireIdentifiant = soumissionnaireIdentifiant;
			this.soumissionnaireNom = soumissionnaireNom;
			this.soumissionnairePrenom = soumissionnairePrenom;
//			this.soumissions = soumissions;
		}

		@Id
		@GeneratedValue(strategy = IDENTITY)
		@Column(name = "soumissionnaireReference", unique = true)
		public Integer getSoumissionnaireReference() {
			return this.soumissionnaireReference;
		}

		public void setSoumissionnaireReference(Integer soumissionnaireReference) {
			this.soumissionnaireReference = soumissionnaireReference;
		}

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "fonctionId")
		public Fonction getFonction() {
			return this.fonction;
		}

		public void setFonction(Fonction fonction) {
			this.fonction = fonction;
		}

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "formeJuridiqueId")
		public Formejuridique getFormejuridique() {
			return this.formejuridique;
		}

		public void setFormejuridique(Formejuridique formejuridique) {
			this.formejuridique = formejuridique;
		}

		@Column(name = "soumissionnaireRaisonSociale", length = 254)
		public String getSoumissionnaireRaisonSociale() {
			return this.soumissionnaireRaisonSociale;
		}

		public void setSoumissionnaireRaisonSociale(
				String soumissionnaireRaisonSociale) {
			this.soumissionnaireRaisonSociale = soumissionnaireRaisonSociale;
		}

		@Column(name = "soumissionnaireCapital", precision = 12, scale = 0)
		public Float getSoumissionnaireCapital() {
			return this.soumissionnaireCapital;
		}

		public void setSoumissionnaireCapital(Float soumissionnaireCapital) {
			this.soumissionnaireCapital = soumissionnaireCapital;
		}

		@Column(name = "soumissionnaireMatriculeFiscale", length = 254)
		public String getSoumissionnaireMatriculeFiscal() {
			return this.soumissionnaireMatriculeFiscal;
		}

		public void setSoumissionnaireMatriculeFiscal(
				String soumissionnaireMatriculeFiscal) {
			this.soumissionnaireMatriculeFiscal = soumissionnaireMatriculeFiscal;
		}

		@Column(name = "soumissionnaireAdresseSiegeSocial", length = 254)
		public String getSoumissionnaireAdresseSiegeSocial() {
			return this.soumissionnaireAdresseSiegeSocial;
		}

		public void setSoumissionnaireAdresseSiegeSocial(
				String soumissionnaireAdresseSiegeSocial) {
			this.soumissionnaireAdresseSiegeSocial = soumissionnaireAdresseSiegeSocial;
		}

		@Column(name = "soumissionnaireAffiliationCNSS", length = 254)
		public String getSoumissionnaireAffiliationCnss() {
			return this.soumissionnaireAffiliationCnss;
		}

		public void setSoumissionnaireAffiliationCnss(
				String soumissionnaireAffiliationCnss) {
			this.soumissionnaireAffiliationCnss = soumissionnaireAffiliationCnss;
		}

		@Column(name = "soumissionnaireNumeroRIB", length = 254)
		public String getSoumissionnaireNumeroRib() {
			return this.soumissionnaireNumeroRib;
		}

		public void setSoumissionnaireNumeroRib(String soumissionnaireNumeroRib) {
			this.soumissionnaireNumeroRib = soumissionnaireNumeroRib;
		}

		@Column(name = "soumissionnaireLieuOuvertureCompte", length = 254)
		public String getSoumissionnaireLieuOuvertureCompte() {
			return this.soumissionnaireLieuOuvertureCompte;
		}

		public void setSoumissionnaireLieuOuvertureCompte(
				String soumissionnaireLieuOuvertureCompte) {
			this.soumissionnaireLieuOuvertureCompte = soumissionnaireLieuOuvertureCompte;
		}

		@Column(name = "soumissionnaireAnneeCreation", length = 10)
		public Date getSoumissionnaireAnneeCreation() {
			return this.soumissionnaireAnneeCreation;
		}

		public void setSoumissionnaireAnneeCreation(
				Date soumissionnaireAnneeCreation) {
			this.soumissionnaireAnneeCreation = soumissionnaireAnneeCreation;
		}

		@Column(name = "soumissionnaireIdentifiant", length = 254)
		public String getSoumissionnaireIdentifiant() {
			return this.soumissionnaireIdentifiant;
		}

		public void setSoumissionnaireIdentifiant(String soumissionnaireIdentifiant) {
			this.soumissionnaireIdentifiant = soumissionnaireIdentifiant;
		}

		@Column(name = "soumissionnaireNom", length = 254)
		public String getSoumissionnaireNom() {
			return this.soumissionnaireNom;
		}

		public void setSoumissionnaireNom(String soumissionnaireNom) {
			this.soumissionnaireNom = soumissionnaireNom;
		}

		@Column(name = "soumissionnairePrenom", length = 254)
		public String getSoumissionnairePrenom() {
			return this.soumissionnairePrenom;
		}

		public void setSoumissionnairePrenom(String soumissionnairePrenom) {
			this.soumissionnairePrenom = soumissionnairePrenom;
		}

//		@OneToMany(fetch = FetchType.LAZY, mappedBy = "soumissionnaire")
//		public Set<Soumission> getSoumissions() {
//			return this.soumissions;
//		}
	//
//		public void setSoumissions(Set<Soumission> soumissions) {
//			this.soumissions = soumissions;
//		}

		@Column(name = "soumissionnaireTelEntreprise", length = 10)
		public String getSoumissionnaireTel() {
			return soumissionnaireTel;
		}

		public void setSoumissionnaireTel(String soumissionnaireTel) {
			this.soumissionnaireTel = soumissionnaireTel;
		}

		@Column(name = "soumissionnaireFax", length = 10)
		public String getSoumissionnaireFax() {
			return soumissionnaireFax;
		}

		public void setSoumissionnaireFax(String soumissionnaireFax) {
			this.soumissionnaireFax = soumissionnaireFax;
		}

		@Column(name = "soumissionnaireMailEntreprise", length = 250)
		public String getSoumissionnaireMailEntreprise() {
			return soumissionnaireMailEntreprise;
		}

		public void setSoumissionnaireMailEntreprise(
				String soumissionnaireMailEntreprise) {
			this.soumissionnaireMailEntreprise = soumissionnaireMailEntreprise;
		}

		@Column(name = "soumissionnaireSiteWeb", length = 250)
		public String getSoumissionnaireSiteWeb() {
			return soumissionnaireSiteWeb;
		}

		public void setSoumissionnaireSiteWeb(String soumissionnaireSiteWeb) {
			this.soumissionnaireSiteWeb = soumissionnaireSiteWeb;
		}
		@Column(name = "soumissionnaireTitre", length = 250)
		public String getSoumissionnaireTitreRep() {
			return soumissionnaireTitreRep;
		}

		public void setSoumissionnaireTitreRep(String soumissionnaireTitreRep) {
			this.soumissionnaireTitreRep = soumissionnaireTitreRep;
		}
		@Column(name = "soumissionnaireMailRep", length = 250)
		public String getSoumissionnaireMailRep() {
			return soumissionnaireMailRep;
		}

		public void setSoumissionnaireMailRep(String soumissionnaireMailRep) {
			this.soumissionnaireMailRep = soumissionnaireMailRep;
		}
		@Column(name = "soumissionnaireTel", length = 10)
		public String getSoumissionnaireTelRep() {
			return soumissionnaireTelRep;
		}

		public void setSoumissionnaireTelRep(String soumissionnaireTelRep) {
			this.soumissionnaireTelRep = soumissionnaireTelRep;
		}
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "typeMarche")
		public TypeMarche getTypeMarche() {
			return typeMarche;
		}

		public void setTypeMarche(TypeMarche typeMarche) {
			this.typeMarche = typeMarche;
		}
		
		
		
		
		
		
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "etatId")
		public Etat getEtat() {
			return etat;
		}

		public void setEtat(Etat etat) {
			this.etat = etat;
		}
		



		

	@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "soumissionnaireGouvernorat")
		public Gouvernerat getGouvernorat() {
			return gouvernorat;
		}

		
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "soumissionnaireEtatCompte")
		public Etat getSoumissionnaireEtatCompte() {
			return soumissionnaireEtatCompte;
		}

		public void setSoumissionnaireEtatCompte(Etat soumissionnaireEtatCompte) {
			this.soumissionnaireEtatCompte = soumissionnaireEtatCompte;
		}

		public void setGouvernorat(Gouvernerat gouvernorat) {
			this.gouvernorat = gouvernorat;
		}

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "soumissionnaireVille")
		public Ville getVille() {
			return ville;
		}

		public void setVille(Ville ville) {
			this.ville = ville;
		}

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "soumissionnairePays")
		public Pays getPays() {
			return pays;
		}

		public void setPays(Pays pays) {
			this.pays = pays;
		}

		@Column(name = "soumissionnaireNumeroRegistreCommerce", length = 45)
		public String getSoumissionnaireNumeroRegistreCommerce() {
			return soumissionnaireNumeroRegistreCommerce;
		}

		public void setSoumissionnaireNumeroRegistreCommerce(
				String soumissionnaireNumeroRegistreCommerce) {
			this.soumissionnaireNumeroRegistreCommerce = soumissionnaireNumeroRegistreCommerce;
		}
		@Column(name = "soumissionnaireCodePostalId", length = 45)
		public int getCodePostaleId() {
			return codePostaleId;
		}

		public void setCodePostaleId(int codePostaleId) {
			this.codePostaleId = codePostaleId;
		}

		@Column(name = "soumissionnaireAutreAdresse")
		public String getSoumissionnaireAutreAdresse() {
			return soumissionnaireAutreAdresse;
		}

		public void setSoumissionnaireAutreAdresse(String soumissionnaireAutreAdresse) {
			this.soumissionnaireAutreAdresse = soumissionnaireAutreAdresse;
		}
		  }
  
  
  
  
		 