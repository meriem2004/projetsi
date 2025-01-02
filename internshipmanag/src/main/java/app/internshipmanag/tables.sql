-- Table: offre_stage
CREATE TABLE offre_stage (
    id_offre_de_stage   NUMBER PRIMARY KEY,
    titre_offre         VARCHAR2(220) NOT NULL,
    description         CLOB NOT NULL,
    date_debut_de_stage DATE NOT NULL,
    date_publication    DATE NOT NULL,
    nombre_semaine      NUMBER NOT NULL,
    date_fin_de_stage   DATE NOT NULL,
    niveau_exige        NUMBER NOT NULL
);

-- Table: tuteur
CREATE TABLE tuteur (
    id_tuteur        VARCHAR2(220) PRIMARY KEY,
    entreprise       VARCHAR2(220) NOT NULL,
    nom_tuteur       VARCHAR2(220) NOT NULL,
    prenom_tuteur    VARCHAR2(220) NOT NULL,
    telephone_tuteur VARCHAR2(220) NOT NULL
);

-- Table: tuteur_interne
CREATE TABLE tuteur_interne (
    id_tuteur_interne        VARCHAR2(220) PRIMARY KEY,
    nom_tuteur_interne       VARCHAR2(220) NOT NULL,
    prenom_tuteur_interne    VARCHAR2(220) NOT NULL,
    telephone_tuteur_interne VARCHAR2(220) NOT NULL
);

-- Table: entretien
CREATE TABLE entretien (
    id_entretien          VARCHAR2(500) PRIMARY KEY,
    date_entretien        DATE NOT NULL,
    lieu_entretien        VARCHAR2(500) NOT NULL,
    statut_entretien      VARCHAR2(500) NOT NULL,
    commantaire_entretien VARCHAR2(500) NOT NULL
);

-- Table: ETUDIANT
CREATE TABLE ETUDIANT (
    numero_etudiant            VARCHAR2(220) PRIMARY KEY,
    nom_etudiant               VARCHAR2(50) NOT NULL,
    prenom_etudiant            VARCHAR2(50) NOT NULL,
    adresse_etudiant           VARCHAR2(50) NOT NULL,
    date_de_naissance_etudiant DATE NOT NULL,
    telephone_etudiant         VARCHAR2(50) NOT NULL,
    statut_recherche_etudiant  VARCHAR2(50) NOT NULL,
    promotion_etudiant         VARCHAR2(50) NOT NULL,
    filiere_etudiant           VARCHAR2(50) NOT NULL,
    email_etudiant             VARCHAR2(220) NOT NULL,
    mot_de_passe_etudiant      VARCHAR2(220) NOT NULL,
    id_entretien               VARCHAR2(500) NOT NULL
);

-- Table: Gestionnaire_entreprise
CREATE TABLE Gestionnaire_entreprise (
    id_gestionnaire           NUMBER PRIMARY KEY,
    nom_gestionnaire          VARCHAR2(220) NOT NULL,
    prenom_gestionnaire       VARCHAR2(220) NOT NULL,
    email_gestionnaire        VARCHAR2(220) NOT NULL,
    mot_de_passe_gestionnaire VARCHAR2(220) NOT NULL,
    id_entretien              VARCHAR2(500) NOT NULL
);

-- Table: Entreprise
CREATE TABLE Entreprise (
    siret_entreprise         NUMBER PRIMARY KEY,
    raison_social_entreprise VARCHAR2(220) NOT NULL,
    forme_juridique          VARCHAR2(220) NOT NULL,
    adresse_entreprise       VARCHAR2(220) NOT NULL,
    ville_entreprise         VARCHAR2(220) NOT NULL,
    code_postal_entreprise   NUMBER NOT NULL,
    telephone_entreprise     VARCHAR2(220) NOT NULL,
    fax_entreprise           VARCHAR2(220),
    contact_entreprise       VARCHAR2(220) NOT NULL,
    tel_contact              VARCHAR2(220) NOT NULL,
    id_gestionnaire          NUMBER NOT NULL
);

-- Table: gerer
CREATE TABLE gerer (
    id_offre_de_stage NUMBER NOT NULL,
    id_gestionnaire   NUMBER NOT NULL,
    PRIMARY KEY (id_offre_de_stage, id_gestionnaire)
);

-- Table: DF
CREATE TABLE DF (
    id_offre_de_stage NUMBER NOT NULL,
    id_tuteur         VARCHAR2(220) NOT NULL,
    PRIMARY KEY (id_offre_de_stage, id_tuteur)
);

-- Table: proposer
CREATE TABLE proposer (
    id_offre_de_stage NUMBER NOT NULL,
    siret_entreprise  NUMBER NOT NULL,
    PRIMARY KEY (id_offre_de_stage, siret_entreprise)
);

-- Table: postuler
CREATE TABLE postuler (
    numero_etudiant      VARCHAR2(220) NOT NULL,
    id_offre_de_stage    NUMBER NOT NULL,
    date_de_postulation  DATE NOT NULL,
    lettre_de_motivation CLOB NOT NULL,
    statut               VARCHAR2(200) NOT NULL,
    cv                   VARCHAR2(500) NOT NULL,
    convention_de_stage  VARCHAR2(500) NOT NULL,
    PRIMARY KEY (numero_etudiant, id_offre_de_stage)
);

-- Table: DF (for tuteur_interne)
CREATE TABLE DF_tuteur_interne (
    id_tuteur_interne VARCHAR2(220) NOT NULL,
    id_offre_de_stage NUMBER NOT NULL,
    PRIMARY KEY (id_tuteur_interne, id_offre_de_stage)
);

-- Table: Admin_systeme
CREATE TABLE Admin_systeme (
    id_admin           NUMBER PRIMARY KEY,
    nom_admin          VARCHAR2(220) NOT NULL,
    prenom_admin       VARCHAR2(220) NOT NULL,
    email_admin        VARCHAR2(220) NOT NULL,
    mot_de_passe_admin VARCHAR2(220) NOT NULL,
    id_gestionnaire    NUMBER NOT NULL,
    id_admin_ensias    NUMBER NOT NULL
);
