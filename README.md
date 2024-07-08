# TP6
Première Partie : Développer un micro-service
   - MIcro Service avec Web Service RESTFUL :
Donc on a commencé par choisir la deuxième option afin de créer le projet dont son nom est le suivant: bank-account-service  et par la suite on a ajouté les dépendances nécessaires pour le travail.
Ensuite on a emmanché la création du package de l'application nommée entities et à l'intérieur de ce dernier on va créer la classe java BankAccount:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/7cb0b427-7137-4000-b3ac-9d9a186ca894)
On a passe par la suite à la création du package de l'application nommée enums et à l'intérieur de ce dernier on va créer  un énumerateur AccountType:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/2522b998-ab8a-4d3d-9ea9-7bae81a788db)
Ensuite on va créer un package nommée repositories à l'intérieur de ce dernier y'aura la création de l'interface BankAccountRepository :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/4cd51834-8bd1-42f8-8d71-f06da96dbaee)
Ensuite on va passer pour faire un petit test :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/597cd22b-2385-46d2-8b1e-ba6f33cace0e)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/55af515b-60f9-4235-b7f7-9579dc28a8b0)
mais avant de le faire il faut parametrer la base donnée:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/6beb6dfc-bf97-425e-9bbc-49ffb27ad84a)
Alors en visitant le localhost:8081/h2-console on aura le résultat suivant:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/ba156c90-29bb-42a6-b05c-ca6ee19baeea)
Cette fois ci nous voudrions exposer les fonctionnalités de notre microservices pour le monde extérieur et on a le choix de passer via un webservice basée sur rest pour cela on va créer un package web et a l'intérieur de ce dernier on va créer une classe dont son nom est:AccountRestController
![image](https://github.com/baayaouiimane/TP6/assets/167249908/c4d49196-a5d5-4582-a918-2eabc61459de)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/86cd72b2-2fbb-4bc8-b9ea-faadba7f8fc5)
Faisant un petit test pour voir si notre rest fonctionne :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/4b0e1c71-2057-4f9f-bbb1-ed2fd7ad8bcb)
![image](https://github.com/baayaouiimane/TP6/assets/167249908/8c735f69-45a8-4af4-8483-f29fd4807f2d)
Et pour consulter juste un compte  on a le résultat ci dessous :
![image](https://github.com/baayaouiimane/TP6/assets/167249908/3a32e901-c735-4368-8f1b-82dfb175b20d)
Ensuite on va ajouter un compte et pour effectuer cette tache il faut ajouter des modifications dans AccountRestController:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/70d649a7-5a49-46fe-98d7-5de68c609c54)
Et en faisant la petite modification du type double afin de l'écrire de la sorte:Double dans BankAccount
![image](https://github.com/baayaouiimane/TP6/assets/167249908/2175f2eb-88ed-4370-bb97-abe91344da74)
Et avant de faire le test il faut apporter des modifications a AccountRestController:
![image](https://github.com/baayaouiimane/TP6/assets/167249908/af975847-0c39-4949-83a8-f4ca09cb2120)


