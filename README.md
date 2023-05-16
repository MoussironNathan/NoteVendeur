# NoteVendeur

# Description

---
Ce projet est une plateforme de vente en ligne dédiée aux articles de glisse d'occasion, facilitant les transactions entre particuliers. L'objectif est de permettre aux amateurs de sports de glisse, tels que le surf, le snowboard, le skateboard et autres. Afin de pouvoir acheter et vendre des équipements d'occasion de manière sécurisée et pratique.

Après chaque transaction, les utilisateurs peuvent laisser une évaluation et des commentaires sur le vendeur. Cela permet de renforcer la confiance au sein de la communauté et d'encourager les comportements responsables.

Cette API vise à permettre aux utilisateurs de laisser leurs avis sur chaque vendeur dont il effectue leurs commandes sur le site de vente en ligne.

# Technologie utilisées

---

- Java Spring


# Pré-requis

---
- Avoir un IDE adapté à Java.

- Possèder la version Java 17.

# API

---
Voici la liste de l'ensemble des endpoints disponible sur notre API:

## /stars

### /get/{userID}

- Description: Récupère les notes de l'utilisateur
- Méthode: GET
- Réponse: Retourne la liste des notes de l'utilisateur avec l'id du post:
  - Code Response 202
      ```
    {
      note:[ 
        { 
            idPoste: "12", 
            note: 4 
        }, 
        ... 
      ]
    }
      ```
- Paramètre:
    ```
  { "token":"1df65g1df6gd1g6df1gd65g1d6gd1g1d6" }
    ```
- Erreur: Si mauvais token renvoi { message: "Erreur de token" }

### /post/{postID}

- Description: envoie la note de l'utilisateur
- Méthode: POST
- Réponse:
    - Code Response 202
  - Paramètre:
      ```
    { 
        "token":"1df65g1df6gd1g6df1gd65g1d6gd1g1d6",
        "note":"4" 
    }
      ```
- Erreur: Si mauvais token renvoi { message: "Erreur de token" }

## /comments

### /get/{userID}

- Description: Récupère les commentaires de l'utilisateur
- Méthode: GET
- Réponse: Retourne la liste des commentaire de l'utilisateur avec l'id du post:
    - Code Response 202
        ```
      {
        note:[ 
          { 
              idPoste: "12", 
              comment: "waaah c'est trop bien !!" 
          }, 
          ... 
        ]
      }
        ```
- Paramètre:
    ```
  { "token":"1df65g1df6gd1g6df1gd65g1d6gd1g1d6" }
    ```
- Erreur: Si mauvais token renvoi { message: "Erreur de token" }

### /post/{postID}

- Description: envoie le commentaire de l'utilisateur
- Méthode: POST
- Réponse:
    - Code Response 202
    - Paramètre:
        ```
      { 
          "token":"1df65g1df6gd1g6df1gd65g1d6gd1g1d6",
          "comment":"waaah c'est trop bien !!" 
      }
        ```
- Erreur: Si mauvais token renvoi { message: "Erreur de token" }

# Auteurs

---

- [Nathan Moussiron](https://github.com/MoussironNathan)
- [Hugo Lamothe](https://github.com/hugo-lamothe)