package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Etat;
import com.example.demo.entity.Fonction;
import com.example.demo.entity.Formejuridique;
import com.example.demo.entity.Gouvernerat;
import com.example.demo.entity.Pays;
import com.example.demo.entity.Soumissionnaire;
import com.example.demo.entity.TypeMarche;
import com.example.demo.entity.Ville;
import com.example.demo.repository.EtatRepository;
import com.example.demo.repository.FonctionRepository;
import com.example.demo.repository.FormejuridiqueRepository;
import com.example.demo.repository.GouverneratRepository;
import com.example.demo.repository.PaysRepository;
import com.example.demo.repository.SoumissionnaireRepository;
import com.example.demo.repository.TypeMarcheRepository;
import com.example.demo.repository.VilleRepository;

@Service
public class SoumissionnaireService {
	@Autowired
	SoumissionnaireRepository repo;
	@Autowired
	FonctionRepository repofonction;
	@Autowired
	FormejuridiqueRepository repoforme;
	@Autowired
	TypeMarcheRepository repoTypeMarche;
	@Autowired
	GouverneratRepository repoGouvernerat;
	@Autowired
	VilleRepository repoVille;
	@Autowired
	PaysRepository repoPays;
	@Autowired
	EtatRepository repoEtat;
	
	
/*public List<Soumissionnaire> ajouter(Soumissionnaire t,Integer idfonction,Integer idforme,Integer idtypemarche,
		Integer idgouvernerat,Integer idville,Integer idpays,Integer idetat) {
		Fonction f=new Fonction();
		Formejuridique forme=new Formejuridique();
		TypeMarche marche=new TypeMarche();
		Gouvernerat gou=new Gouvernerat();
		Ville ville=new Ville();
		Etat etat=new Etat();
		Pays pays=new Pays();
		
	    f=repofonction.getById(idfonction);
	    forme=repoforme.getById(idforme);
	    marche=repoTypeMarche.getById(idtypemarche);
	    gou=repoGouvernerat.getById(idgouvernerat);
	    ville=repoVille.getById(idville);
	    pays=repoPays.getById(idpays);
	    etat=repoEtat.getById(idetat);
		
	    
	    t.setFonction(f);
	    t.setEtat(etat);
	    t.setFormejuridique(forme);
	    t.setTypeMarche(marche);
	    t.setGouvernorat(gou);
	    t.setVille(ville);
	    t.setPays(pays);
				repo.save(t);
				return repo.findByOrderBySoumissionnaireReferenceDesc();
	 }
	
	
public void update(int id,Soumissionnaire t1,Integer idfonction,Integer idforme,Integer idtypemarche,
		Integer idgouvernerat,Integer idville,Integer idpays,Integer idetat) {
	Soumissionnaire t = new Soumissionnaire();
	
	t=repo.getById(id);
	
	Fonction f=new Fonction();
	Formejuridique forme=new Formejuridique();
	TypeMarche marche=new TypeMarche();
	Gouvernerat gou=new Gouvernerat();
	Ville ville=new Ville();
	Etat etat=new Etat();
	Pays pays=new Pays();
	
    f=repofonction.getById(idfonction);
    forme=repoforme.getById(idforme);
    marche=repoTypeMarche.getById(idtypemarche);
    gou=repoGouvernerat.getById(idgouvernerat);
    ville=repoVille.getById(idville);
    pays=repoPays.getById(idpays);
    etat=repoEtat.getById(idetat);
	
    
    t.setFonction(f);
    t.setEtat(etat);
    t.setFormejuridique(forme);
    t.setTypeMarche(marche);
    t.setGouvernorat(gou);
    t.setVille(ville);
    t.setPays(pays);
    t.setCodePostaleId(t1.getCodePostaleId());
    t.setSoumissionnaireAdresseSiegeSocial(t1.getSoumissionnaireAdresseSiegeSocial());
    t.setSoumissionnaireAffiliationCnss(t1.getSoumissionnaireAffiliationCnss());
    t.setSoumissionnaireAdresseSiegeSocial(t1.getSoumissionnaireAdresseSiegeSocial());
    t.setSoumissionnaireAnneeCreation(t1.getSoumissionnaireAnneeCreation());
    t.setSoumissionnaireAutreAdresse(t1.getSoumissionnaireAutreAdresse());
    t.setSoumissionnaireCapital(t1.getSoumissionnaireCapital());
    t.setSoumissionnaireFax(t1.getSoumissionnaireFax());
    t.setSoumissionnaireIdentifiant(t1.getSoumissionnaireIdentifiant());
    t.setSoumissionnaireLieuOuvertureCompte(t1.getSoumissionnaireLieuOuvertureCompte());
    t.setSoumissionnaireMailEntreprise(t1.getSoumissionnaireMailEntreprise());
    t.setSoumissionnaireMailRep(t1.getSoumissionnaireMailRep());
    t.setSoumissionnaireMatriculeFiscal(t1.getSoumissionnaireMatriculeFiscal());
    t.setSoumissionnaireNom(t1.getSoumissionnaireNom());
    t.setSoumissionnaireNumeroRegistreCommerce(t1.getSoumissionnaireNumeroRegistreCommerce());
    t.setSoumissionnaireNumeroRib(t1.getSoumissionnaireNumeroRib());
    t.setSoumissionnairePrenom(t1.getSoumissionnairePrenom());
    t.setSoumissionnaireSiteWeb(t1.getSoumissionnaireSiteWeb());
    t.setSoumissionnaireTel(t1.getSoumissionnaireTel());
    t.setSoumissionnaireTelRep(t1.getSoumissionnaireTelRep());
    t.setSoumissionnaireTitreRep(t1.getSoumissionnaireTitreRep());
	repo.save(t);
	
}*/


	public List<Soumissionnaire> ajouter(Soumissionnaire t) {
		repo.save(t);
		return repo.findByOrderBySoumissionnaireReferenceDesc();
		
	}


	public List<Soumissionnaire> getAll(){
		return repo.findByOrderBySoumissionnaireReferenceDesc();
	}
	
	public List<Soumissionnaire> supprimer(int id) {
		repo.deleteById(id);
		return repo.findByOrderBySoumissionnaireReferenceDesc();
	}
	
	
	public Soumissionnaire getone(int id){
		return repo.getById(id);
	}
	
	
	public void update(Soumissionnaire t1) {
		
		repo.save(t1);
		
	}
	
}
